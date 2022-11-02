package ru.mirea.task11.task11_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("ArrayList test");
        testList(arrayList);
        System.out.println();
        System.out.println("LinkedList test");
        testList(linkedList);

    }

    public static void testList(List<Integer> list) {
        float iterNum = 50;

        double estimatedTime = 0;
        for (int i = 0; i < iterNum; i++) {
            estimatedTime += testAdd(list) / iterNum;
        }
        System.out.println("Estimated time for add: " + estimatedTime + " ms");

        estimatedTime = 0;
        for (int i = 0; i < iterNum; i++) {
            estimatedTime += testInsert(list) / iterNum;
        }
        System.out.println("Estimated time for insert: " + estimatedTime + " ms");

        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        estimatedTime = 0;
        for (int i = 0; i < iterNum; i++) {
            estimatedTime += testGet(list) / iterNum;
        }
        System.out.println("Estimated time for get: " + estimatedTime + " ms");

        list.clear();
        estimatedTime = 0;
        for (int i = 0; i < iterNum; i++) {
            for (int j = 0; j < 10000; j++) {
                list.add(j);
            }
            estimatedTime += testRemove(list) / iterNum;
        }
        System.out.println("Estimated time for remove: " + estimatedTime + " ms");
    }

    public static long testAdd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long estimatedTime = System.currentTimeMillis() - startTime;
        list.clear();
        return estimatedTime;
    }

    public static long testInsert(List<Integer> list) {
        Random random = new Random();
        int size = list.size();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(random.nextInt(size + 1), i);
        }
        long estimatedTime = System.currentTimeMillis() - startTime;
        list.clear();
        return estimatedTime;
    }

    public static long testGet(List<Integer> list) {
        Random random = new Random();
        int size = list.size();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.get(random.nextInt(size));
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long testRemove(List<Integer> list) {
        Random random = new Random();
        int size = list.size();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(random.nextInt(size--));
        }
        return System.currentTimeMillis() - startTime;
    }
}
