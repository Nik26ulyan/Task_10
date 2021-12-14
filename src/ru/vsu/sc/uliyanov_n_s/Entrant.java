package ru.vsu.sc.uliyanov_n_s;

import java.util.List;

public class Entrant {
    String fio;
    int russianEstimation;
    int mathEstimation;
    int physicsEstimation;
    double averageEstimation;

    public Entrant(String fio, int russianEstimation, int mathEstimation, int physicsEstimation) {
        this.fio = fio;
        this.russianEstimation = russianEstimation;
        this.mathEstimation = mathEstimation;
        this.physicsEstimation = physicsEstimation;
        averageEstimation = (double) (russianEstimation + mathEstimation + physicsEstimation) / 3;
    }

    Entrant(String  fio, String russianEstimation, String mathEstimation, String physicsEstimation) {
        this.fio = fio;
        this.russianEstimation = Integer.parseInt(russianEstimation);
        this.mathEstimation = Integer.parseInt(mathEstimation);
        this.physicsEstimation = Integer.parseInt(physicsEstimation);
        averageEstimation = (double) (this.russianEstimation + this.mathEstimation + this.physicsEstimation) / 3;
    }

    Entrant(List<String> list) {
        this.fio = list.get(0);
        this.russianEstimation = Integer.parseInt(list.get(1));
        this.mathEstimation = Integer.parseInt(list.get(2));
        this.physicsEstimation = Integer.parseInt(list.get(3));
        averageEstimation = (double) (this.russianEstimation + this.mathEstimation + this.physicsEstimation) / 3;
    }

    @Override
    public String toString() {
        return fio + " "
                + russianEstimation + " "
                + mathEstimation + " "
                + physicsEstimation;
    }

    public String getFio() {
        return fio;
    }

    public int getRussianEstimation() {
        return russianEstimation;
    }

    public int getPhysicsEstimation() {
        return physicsEstimation;
    }

    public int getMathEstimation() {
        return mathEstimation;
    }

    public double getAverageEstimation() {
        return averageEstimation;
    }
}
