package ru.mirea.task4.task4_1_4;

import java.util.Locale;

public class Matrix {
    private double[][] m;
    private int rowsQuantity;
    private int columnsQuantity;

    public Matrix(int rowsQuantity, int columnsQuantity) {
        m = new double[rowsQuantity][columnsQuantity];
        this.rowsQuantity = rowsQuantity;
        this.columnsQuantity = columnsQuantity;
    }

    public Matrix(double[][] matrix) {
        this.m = matrix;
        rowsQuantity = matrix.length;
        columnsQuantity = matrix[0].length;
    }

    public int getRowsQuantity() {
        return rowsQuantity;
    }

    public int getColumnsQuantity() {
        return columnsQuantity;
    }

    public double getElement(int row, int column) {
        return m[row][column];
    }

    public void setElement(int row, int column, double value) {
        m[row][column] = value;
    }

    public Matrix add(Matrix a) {
        if (rowsQuantity != a.getRowsQuantity() || columnsQuantity != a.getColumnsQuantity()) return new Matrix(0, 0);
        Matrix tmp = new Matrix(rowsQuantity, columnsQuantity);
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                tmp.setElement(i, j, this.getElement(i, j) + a.getElement(i, j));
            }
        }
        return tmp;
    }

    public Matrix multiply(double a) {
        Matrix tmp = new Matrix(rowsQuantity, columnsQuantity);
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                tmp.setElement(i, j, this.getElement(i, j) * a);
            }
        }
        return tmp;
    }

    public Matrix multiply(Matrix a) {
        if (this.getColumnsQuantity() != a.getRowsQuantity()) return new Matrix(0, 0);
        Matrix tmp = new Matrix(rowsQuantity, a.getColumnsQuantity());
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < a.getColumnsQuantity(); j++) {
                for (int k = 0; k < columnsQuantity; k++) {
                    tmp.setElement(i, j, tmp.getElement(i, j) + this.getElement(i, k) * a.getElement(k, j));
                }
            }
        }
        return tmp;
    }

    public void print(String matrixName) {
        System.out.println("Matrix " + matrixName + ":");
        for (int i = 0; i < this.getRowsQuantity(); i++) {
            for (int j = 0; j < this.getColumnsQuantity(); j++) {
                System.out.printf(Locale.ROOT, "%1.4f    ", this.getElement(i, j));
            }
            System.out.println();
        }
        System.out.println();
    }
}
