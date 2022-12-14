package ru.mirea.task31.task31_2_1;

import ru.mirea.task31.task31_2_1.MyExecption;

public class TestClass {
    public static int testFunction(int a, int b) {
        System.out.println("Test function working");
        try {
            if (a < 0) {
                throw new MyExecption();
            }
        } catch (MyExecption e) {
            System.out.println(e.getMessage());
        }
        return a * (b + 5);
    }
}
