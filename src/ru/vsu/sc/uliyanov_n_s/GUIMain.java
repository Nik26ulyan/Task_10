package ru.vsu.sc.uliyanov_n_s;

import ru.vsu.sc.uliyanov_n_s.GUIInterface.FrameMain;

import java.util.Locale;

public class GUIMain {
    public static void main(String[] args) throws Exception {
        winMain();
    }

    public static void winMain() throws Exception {
        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
}
