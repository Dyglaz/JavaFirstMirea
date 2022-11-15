//Доработать класс адреса, который из полученной
//        строки формата “Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d]
//        Квартира” ([d] – разделитель, например, «запятая») выбирает
//        соответствующие части и записывает их в соответствующие поля класса
//        Address. Учесть, что в начале и конце разобранной части адреса не должно
//        быть пробелов. Все поля адреса строковые. Разработать проверочный класс
//        не менее чем на четыре адресных строки. В программе предусмотреть две
//        реализации этого метода:
//        а) разделитель – только запятая (использовать метод split());
//        Внимание, при разработке нужно учесть, что
//        б) разделитель – любой из символов ‘,’ ‘.’ ‘;’ - (класс StringTokenizer1).

package ru.mirea.task13.task13_3;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        String address1 = "Russia, Central, Moscow, Bulgakov, 77, 1, 7";
        String address2 = "Russia,   Central,   Moscow, Helicopter pilots, 55, 2, 309";
        String address3 = "Russia, Central. Moscow;  Dvintsev, 23. 3; 4";
        String address4 = "Russia,   Central; Moscow; Kaluga Square. 40; 2. 234";
        address.buildAddress(address1);
        System.out.println(address);
        address.buildAddress(address2);
        System.out.println(address);
        address.buildAddressWithTokens(address3);
        System.out.println(address);
        address.buildAddressWithTokens(address4);
        System.out.println(address);
    }
}

class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String apartment;

    public void buildAddress(String address) {
        String[] fields = address.trim().split(",");
        country = fields[0].trim();
        region = fields[1].trim();
        city = fields[2].trim();
        street = fields[3].trim();
        house = fields[4].trim();
        building = fields[5].trim();
        apartment = fields[6].trim();
    }

    public void buildAddressWithTokens(String address) {
        StringTokenizer fields = new StringTokenizer(address, ",.;");
        country = fields.nextToken().trim();
        region = fields.nextToken().trim();
        city = fields.nextToken().trim();
        street = fields.nextToken().trim();
        house = fields.nextToken().trim();
        building = fields.nextToken().trim();
        apartment = fields.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
