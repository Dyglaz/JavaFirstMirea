package ru.mirea.task32;

public class Woman extends Human {
    private char gender;
    public Woman(int age, String name) {
        super(age, name);
        this.gender = 'W';
    }
    public char getGender() {
        return gender;
    }
    public void talk() {
        System.out.println("Hi! I'm woman!");
    }
}
