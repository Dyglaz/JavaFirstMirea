package ru.mirea.task4.task4_1_2;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone() {}
    public Phone(String number, String model, String weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
        Phone phone4 = new Phone("83225551488", "Alcatel 2019G");
    }
    public Phone(String number, String model)
    {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println("Calls: " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Calls: " + name + " " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String number1, String number2) {
        System.out.println("The message will be sent: " + number1 + " and " + number2);
    }

    public String toString() {
        return "number = " + number + ", model = " + model + ", weight = " + weight;
    }
}
