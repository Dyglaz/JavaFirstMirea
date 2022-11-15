//Реализуйте класс Shirt: Метод toString() выводит
//        объяснение и значение полей построчно.
//        Дан также строковый массив: shirts[0] = "S001,Black Polo
//        Shirt,Black,XL"; shirts[1] = "S002,Black Polo Shirt,Black,L"; shirts[2] =
//        "S003,Blue Polo Shirt,Blue,XL"; shirts[3] = "S004,Blue Polo Shirt,Blue,M";
//        shirts[4] = "S005,Tan Polo Shirt,Tan,XL"; shirts[5] = "S006,Black T-
//        Shirt,Black,XL"; shirts[6] = "S007,White T-Shirt,White,XL"; shirts[7] =
//        "S008,White T-Shirt,White,L"; shirts[8] = "S009,Green T-Shirt,Green,S";
//        shirts[9] = "S010,Orange T-Shirt,Orange,S"; shirts[10] = "S011,Maroon Polo
//        Shirt,Maroon,S";
//        Преобразуйте строковый массив в массив класса Shirt и выведите его
//        на консоль.

package ru.mirea.task13.task13_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirtsObj = Arrays.stream(shirts).map(Shirt::new).toArray(Shirt[]::new);
        for (Shirt shirt: shirtsObj) {
            System.out.println(shirt);
        }
    }
}

class Shirt {
    String id;
    String name;
    String color;
    String size;

    Shirt(String description) {
        String[] descriptionArr = description.split(",");
        id = descriptionArr[0];
        name = descriptionArr[1];
        color = descriptionArr[2];
        size = descriptionArr[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
