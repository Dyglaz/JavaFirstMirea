package ru.mirea.task32;

public class Man extends Human {
    private char gender;
    public Man(int age, String name) {
        super(age, name);
        this.gender = 'M';
    }
    public char getGender() {
        return gender;
    }
    public void talk() {
        System.out.println("Hi! I'm man!");
    }

    public static void main(String[] args) {
        Man man = new Man(20, "Geralt");
        man.talk();
        System.out.println("My gender: " + man.gender);
    }
}
