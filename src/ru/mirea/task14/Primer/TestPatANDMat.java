package ru.mirea.task14.Primer;

import java.util.regex.*;

public class TestPatANDMat {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("a*y");
        Matcher m1 = p1.matcher("aaay");
        boolean b = m1.matches();
        System.out.println(b);

        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
        String s = "адреса эл.почты: mymail@tut.by и rom@bsu.by";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            System.out.println("e-mail: " + m2.group());
        }

        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("java5tiger 77 java6mustang");
        for (String word : words)
            System.out.println(word);
    }
}
