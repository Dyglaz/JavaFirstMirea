package ru.mirea.task6.task6_10;

import java.util.List;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addComputer(new Computer(
                new Processor(4),
                new Memory(8),
                new Monitor("1680x1050"),
                Brands.HP
        ));
        shop.addComputer(new Computer(
                new Processor(2),
                new Memory(4),
                new Monitor("1440x1080"),
                Brands.DELL
        ));
        shop.addComputer(new Computer(
                new Processor(8),
                new Memory(32),
                new Monitor("1920x1080"),
                Brands.LENOVO
        ));

        Scanner sc = new Scanner(System.in);
        int cmd;
        System.out.println("0) Выход");
        System.out.println("1) Добавить компьютер");
        System.out.println("2) Удалить компьютер");
        System.out.println("3) Найти компьютер");
        System.out.println("4) Список компьютеров");
        while (true) {
            while (true) {
                cmd = sc.nextInt();
                if (cmd >= 0 && cmd <= 4) {
                    break;
                }
            }
            switch (cmd) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    shop.addComputer(addComputer());
                    break;
                case 2:
                    int index;
                    System.out.println("Введите индекс для удаления: ");
                    index = sc.nextInt();
                    shop.deleteComputer(index);
                    break;
                case 3:
                    Brands brand;
                    System.out.println("Введите бренд компьютера для поиска: ");
                    brand = Brands.valueOf(sc.next().toUpperCase());
                    List<Computer> res = shop.findComputer(brand);
                    if (res.size() != 0)
                        System.out.println(res.toString());
                    break;
                case 4:
                    shop.listComputers();
                    break;
            }
        }
    }

    public static Computer addComputer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество ядер процессора: ");
        int coresNum = sc.nextInt();
        System.out.println("Введите количество ГБ ОЗУ: ");
        int sizeInGB = sc.nextInt();
        System.out.println("Введите разрешение монитора: ");
        String resolution = sc.next();
        System.out.println("Введите бренд компьютера: ");
        Brands brand = Brands.valueOf(sc.next().toUpperCase());
        return  new Computer(
                new Processor(coresNum),
                new Memory(sizeInGB),
                new Monitor(resolution),
                brand
        );
    }
}
