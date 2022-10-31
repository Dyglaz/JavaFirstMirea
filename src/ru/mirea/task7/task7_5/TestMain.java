package ru.mirea.task7.task7_5;

//Разработайте интерфейс для работы со строками, который
//        содержит а) функции подсчета символов в строке б) функция возвращает
//        строку, которая образовывает строку, состоящую из символов исходной
//        строки s, которые размещены на нечетных позициях: 1, 3, 5, ...в) функцию
//        инвертирования строки

public class TestMain {
    public static void main(String[] args) {
        ProcessStrings ps = new Main();
        String test = "123456789";
        System.out.println(ps.getStringLength(test));
        System.out.println(ps.getStringOddPos(test));
        System.out.println(ps.reverseString(test));
    }
}
