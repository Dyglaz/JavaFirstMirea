package ru.mirea.task21.task21_2_3;

public class Main {
    public static void main(String[] args) {
        GenericArrayHolder<Integer> arrayHolder = new GenericArrayHolder<Integer>(new Integer[5]);

        arrayHolder.addElement(1);
        arrayHolder.addElement(2);
        arrayHolder.addElement(3);
        arrayHolder.addElement(4);
        arrayHolder.addElement(5);
        arrayHolder.addElement(6);

        for (Integer integer : arrayHolder.getArray()) {
            System.out.println(integer);
        }

        System.out.println(arrayHolder.getElement(1));

        try {
            System.out.println(arrayHolder.getElement(5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
