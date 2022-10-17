package ru.mirea.task4.task4_1;


public enum Seasons {
    WINTER(-15),
    SPRING(15),
    SUMMER(20) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10);

    private final double avgTemp;

    Seasons(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
