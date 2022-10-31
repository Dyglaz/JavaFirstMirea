package ru.mirea.task7.task7_3;

//Добавьте в класс параметризированные конструкторы,
//        входящие в состав классов; метод в классах для перевода числовых
//        значений в Строку. Убедитесь, что две точки имеют одну и ту же скорость
//        при помощи специального логического метода SpeedTest(), проверяющего
//        это.

public class MovableRectangle {
    MovablePoint topLeft;
    MovablePoint topRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint topRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
    }

    String intToString(double value) {
        return String.valueOf(value);
    }

    boolean SpeedTest() {
        return topLeft.xSpeed == topRight.xSpeed && topLeft.ySpeed == topRight.ySpeed;
    }
}
