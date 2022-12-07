package ru.mirea.task20.task20_4;

public class TestMinMax {
    public static void main(String[] args) {
        MinMax<Integer> minMax = new MinMax<Integer>(new Integer[]{1, 3, 2, 5});
        MinMax<Double> minMax2 = new MinMax<Double>(new Double[]{0.88, 34.23, 90., 52.12});

        System.out.println(minMax.findMin() + " " + minMax.findMax());
        System.out.println(minMax2.findMin() + " " + minMax2.findMax());
    }
}
