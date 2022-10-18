package ru.mirea.task4.task4_1_4;

public class TestMatrix {
    public static void main(String[] args) {
        Matrix a = new Matrix(new double[][]{{1, 2, 1, 2}, {2, 1, 2, 1}, {1, 2, 1, 2}, {2, 1, 2, 1}});
        a.print("A (manually  filled matrix)");
        Matrix b = new Matrix(new double[][]{{1, 2, 1, 2}, {2, 1, 2, 1}, {1, 2, 1, 2}, {2, 1, 2, 1}});
        b.print("A (manually  filled matrix)");

        Matrix c = a.add(b);
        c.print("C = A + B");

        Matrix d = c.multiply(2);
        d.print("D = C * 2");

        Matrix e = c.multiply(d);
        e.print("E = C * D");
    }
}
