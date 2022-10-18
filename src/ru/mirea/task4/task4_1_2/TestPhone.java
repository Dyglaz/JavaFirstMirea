package ru.mirea.task4.task4_1_2;


public class TestPhone {
    public static void main(String [ ] args) {
        Phone phone1 = new Phone("89150464085", "iPhone XR", "194");
        Phone phone2 = new Phone("88005553535", "Nokia 3310", "151");
        Phone phone3 = new Phone("89999999999", "iPhone 14", "174");

        System.out.println("Instance Information: " + phone1.toString());
        System.out.println("Instance Information: " + phone2.toString());
        System.out.println("Instance Information: " + phone3.toString());

        phone1.receiveCall("Maxim");
        phone2.receiveCall("Gosha");
        phone3.receiveCall("Denis");

        System.out.println("Phone number: " + phone1.getNumber());
        System.out.println("Phone number: " + phone2.getNumber());
        System.out.println("Phone number: " + phone3.getNumber());

        phone1.receiveCall("Maxim", phone1.getNumber());

        phone1.sendMessage(phone2.getNumber(), phone3.getNumber());
    }
}
