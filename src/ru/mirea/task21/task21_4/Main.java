package ru.mirea.task21.task21_4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\BUZ\\semestr3\\Java\\JavaFirstMirea\\src\\ru\\mirea\\task21\\task21_4\\Catalog";
        ArrayList<File> files = getListFromCatalog(path);

        // ASomeProgram.java
        // File1.txt
        // File2.jpg
        // File3.txt
        // File4.txt

    }

    public static ArrayList<File> getListFromCatalog(String path) {
        File f = new File(path);
        ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));
        for (int i = 0; i < Math.min(files.size(), 5); i++) {
            System.out.println(files.get(i).toString());
        }
        return files;
    }
}
