package ru.mirea.task7.task7_3;

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
