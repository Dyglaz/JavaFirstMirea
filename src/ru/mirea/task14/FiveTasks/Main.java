//2. Написать регулярное выражение, определяющее является ли данная
//        строка строкой "abcdefghijklmnopqrstuv18340" или нет.
//        a) пример правильных выражений: abcdefghijklmnopqrstuv18340
//        b) пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340.

//3. Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
//        a) пример правильных выражений: 25.98 USD.
//        b) пример неправильных выражений: 44 ERR, 0.004 EU.

//4. Дан текст, необходимо проверить есть ли в тексте цифры, за которыми не стоит знак «+».
//        a) пример правильных выражений:(1 + 8) – 9 / 4
//        b) пример неправильных выражений: 6 / 5 – 2 * 9

//5. Написать регулярное выражение, определяющее является ли данная
//        строчка датой в формате dd/mm/yyyy. Начиная с 1900 года до 9999 года.
//        a) пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.
//        b) пример неправильных выражений: 29/02/2001, 30-04-2003,1 /1/1899.

//7. Проверить, надежно ли составлен пароль. Пароль считается
//        надежным, если он состоит из 8 или более символов. Где символом
//        может быть цифр, английская буква, и знак подчеркивания. Пароль
//        должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру.
//        a) пример правильных выражений: F032_Password, TrySpy1.
//        b) пример неправильных выражений: smart_pass, A007.





package ru.mirea.task14.FiveTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task two:");
        taskTwo();
        System.out.println("Task three:");
        taskThree();
        System.out.println("Task four:");
        System.out.println("Are there numbers in the text (1 + 8) – 9 / 4 that are not followed by a + sign: " + taskFour("(1 + 8) – 9 / 4"));
        System.out.println("Are there numbers in the text 6 / 5 – 2 * 9 that are not followed by a + sign: " + taskFour("6 / 5 – 2 * 9"));
        System.out.println();
        System.out.println("Task five:");
        System.out.println("is this line 29/02/2000 a date in the format dd/mm/yyyy " + taskFive("29/02/2000"));
        System.out.println("is this line 1/1/1899 a date in the format dd/mm/yyyy " + taskFive("1/1/1899"));
        System.out.println();
        System.out.println("Task seven:");
        System.out.println("Is the password made up securely K6575788Kk_ " + taskSeven("K6575788Kk_"));
        System.out.println("Is the password made up securely _Killer12_7_ " + taskSeven("_Killer12_7_"));
        System.out.println("Is the password made up securely _kkkkkk33_ " + taskSeven("_kkkkkk33_"));


    }

    private static void taskTwo() {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher1 = pattern.matcher("abcdefghijklmnopqrstuv18340");
        Matcher matcher2 = pattern.matcher("notthis");
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println();
    }

    private static void taskThree() {
        Pattern pattern = Pattern.compile("(\\d+(\\.\\d{1,2})?) (USD|RUB|EU)");
        Matcher matcher = pattern.matcher("10 USD, 55.55 RUB, 77 ER, 12.14 EU, 32.40 RUB");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println();
    }

    public static boolean taskFour(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }

    public static boolean taskFive(String s){
        return Pattern.compile("\\d{2}\\/\\d{2}\\/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])").matcher(s).find();
    }

    public static boolean taskSeven(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }
}
