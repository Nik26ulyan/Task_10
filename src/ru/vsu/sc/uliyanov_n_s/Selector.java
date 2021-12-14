package ru.vsu.sc.uliyanov_n_s;

import ru.vsu.sc.uliyanov_n_s.Utils.ListUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Selector {
    public List<List<String>> selectEntrant(List<List<String>> list, int placesValue) {
        List<Entrant> entrantList = toEntrantsList(list);
        sortEntrants(entrantList);
        Collections.reverse(entrantList);

        for (int i = entrantList.size() - 1; i > placesValue - 1; i--) {
          entrantList.remove(i);
        }

        List<List<String>> resultList = new ArrayList<>();

        for (int i = 0; i < entrantList.size(); i++) {
            List<String> temp = entrantToStringList(entrantList.get(i));
            resultList.add(temp);
        }

        return resultList;
    }

    private List<String> entrantToStringList(Entrant entrant) {
        String str = entrant.toString();
        return ListUtils.toList(str);
    }

    private List<Entrant> toEntrantsList(List<List<String>> list) {
        List<Entrant> newList = new ArrayList<>(list.size());

        for (int i = 0; i < list.size(); i++) {
            newList.add(i, new Entrant(list.get(i)));
        }

        return newList;
    }

    private void sortEntrants(List<Entrant> list) {
        list.sort(new Comparator<Entrant>() {
            public int compare(Entrant o1, Entrant o2) {
                if (o1.getAverageEstimation() == o2.getAverageEstimation()) return 0;
                else if (o1.getAverageEstimation() > o2.getAverageEstimation()) return 1;
                else return -1;
            }
        });
    }
}
