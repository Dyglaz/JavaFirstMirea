package ru.mirea.task20.task20_1_3;

public class TestGenericClass {
    public static void main(String[] args) {
        Integer obj1 = 1;
        Animal dog = new Animal("Timmi", 5);
        double[] array = new double[]{55.40, 25.30, 10.0};
        GenericClass genericClass = new GenericClass(obj1, dog, array);

        genericClass.printAllVars();
    }
}
