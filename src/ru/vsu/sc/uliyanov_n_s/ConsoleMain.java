package ru.vsu.sc.uliyanov_n_s;

import ru.vsu.sc.uliyanov_n_s.Utils.ListUtils;

import java.io.PrintStream;
import java.util.List;

public class ConsoleMain {
    public static class CmdParams {
        public String inputFile;
        public String outputFile;
        public int placesValue;
        public boolean error;
        public boolean help;
        public boolean window;
    }

    public static CmdParams parseArgs(String[] args) {
        ConsoleMain.CmdParams params = new CmdParams();
        if (args.length > 0) {
            if (args[0].equals("--help")) {
                params.help = true;
                return params;
            }
            if (args[0].equals("--window")) {
                params.window = true;
                return params;
            }
            if (args.length < 2) {
                params.help = true;
                params.error = true;
                return params;
            }

            params.placesValue = Integer.parseInt(args[0]);
            params.inputFile = args[1];

            if (args.length > 2) {
                params.outputFile = args[2];
                return params;
            } else
                params.outputFile = null;


        } else {
            params.help = true;
            params.error = true;
        }
        return params;
    }

    public static void main(String[] args) throws Exception {
        CmdParams params = parseArgs(args);
        Selector selector = new Selector();

        if (params.help) {
            printHelpMsg(params);
        } else if (params.window) {
            GUIMain.winMain();
        } else {
            List<List<String>> list = ListUtils.loadStringList2FromFile(params.inputFile);

            if (list == null) {
                System.err.printf("Can't read list from \"%s\"%n", params.inputFile);
                System.exit(2);
            }

            List<List<String>> resultList = selector.selectEntrant(list, params.placesValue);

            if (params.outputFile != null) {
                ListUtils.writeList2ToFile(params.outputFile, resultList);
            } else {
                ListUtils.printList2InConsole(resultList);
            }
        }
    }

    private static void printHelpMsg(CmdParams params) {
        PrintStream out = params.error ? System.err : System.out;
        out.println("Usage:");
        out.println("  <cmd> args <placesValue> <input-file> (<output-file>)");
        out.println("  <cmd> --help");
        out.println("  <cmd> --window  // show window");
        System.exit(params.error ? 1 : 0);
    }
}
