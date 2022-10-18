package ru.mirea.task4.task4_1;

// Времена года
// Создать перечисление, содержащее названия времен года.
//1) Создать переменную, содержащую ваше любимое время года и
//распечатать всю информацию о нем.
//2) Создать метод, который принимает на вход переменную созданного
//вами enum типа. Если значение равно Лето, выводим на консоль “Я
//люблю лето” и так далее. Используем оператор switch.
//3) Перечисление должно содержать переменную, содержащую среднюю
//температуру в каждом времени года.
//4) Добавить конструктор, принимающий на вход среднюю температуру.
//5) Создать метод getDescription, возвращающий строку “Холодное время
//года”. Переопределить метод getDescription - для константы Лето
//метод должен возвращать “Теплое время года”.
//6) В цикле распечатать все времена года, среднюю температуру и
//описание времени года

public class Main {
    public static void main(String[] args) {
        Seasons season1 = Seasons.SUMMER;
        ILoveSeason(season1);
        for (Seasons season: Seasons.values()) {
            System.out.println(season.toString() + " " + season.getAvgTemp() + " " + season.getDescription());
        }
    }

    public static void ILoveSeason(Seasons season) {
        System.out.print("I love ");
        switch (season) {
            case AUTUMN:
                System.out.println("autumn");
                break;
            case SPRING:
                System.out.println("spring");
                break;
            case SUMMER:
                System.out.println("summer");
                break;
            case WINTER:
                System.out.println("winter");
                break;
        }
    }
}
