//Разработайте класс, который получает строковое
//        представление телефонного номера в одном из двух возможных строковых
//        форматов:
//        +<Код страны><Номер 10 цифр>, например “+79175655655” или
//        “+104289652211” или
//        8<Номер 10 цифр> для России, например “89175655655”
//        и преобразует полученную строку в формат:
//        +<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>

package ru.mirea.task13.task13_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String number1 = "+79150464085";
        String number2 = "+155003002525";
        String number3 = "89485467898";
        String number4 = "+1234567891234";
        String number5 = "93413452345";
        System.out.println(NumberFormat.getNumber(number1));
        System.out.println(NumberFormat.getNumber(number2));
        System.out.println(NumberFormat.getNumber(number3));
        System.out.println(NumberFormat.getNumber(number4));
        System.out.println(NumberFormat.getNumber(number5));
    }
}

class NumberFormat {
    public static String getNumber(String value) {
        Pattern pattern = Pattern.compile("(\\+[0-9]{1,3}|8)([0-9]{3})([0-9]{3})([0-9]{4})");
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            String countryCode = matcher.group(1);
            if (countryCode.startsWith("8"))
                countryCode = "+7";
            return String.format("%s-%s-%s-%s", countryCode, matcher.group(2), matcher.group(3), matcher.group(4));
        }
        else
            return "Wrong number dialed";
    }
}
