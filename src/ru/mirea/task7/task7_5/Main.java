package ru.mirea.task7.task7_5;

public class Main implements ProcessStrings {
    @Override
    public int getStringLength(String s) {
        return s.length();
    }

    @Override
    public String getStringOddPos(String s) {
        StringBuilder str = new StringBuilder();
        if (s.length() < 1) return "";
        for (int i = 1; i < s.length(); i+=2) {
            str.append(s.charAt(i));
        }
        return str.toString();
    }

    @Override
    public String reverseString(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}
