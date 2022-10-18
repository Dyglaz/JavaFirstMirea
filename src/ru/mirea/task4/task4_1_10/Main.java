package ru.mirea.task4.task4_1_10;

public class Main {
    public static void main(String[] args)
    {
        Car car = new Car();
        Plane plane = new Plane();
        Train train = new Train();
        Ship ship = new Ship();

        car.setPTime(25.5);
        car.setPPrice(250);
        car.setPWeight(500);
        car.setWTime(34.2);
        car.setWPrice(300);
        car.setWWeight(5000);

        plane.setPTime(180);
        plane.setPPrice(25000);
        plane.setPWeight(150);
        plane.setWTime(360);
        plane.setWPrice(50000);
        plane.setWWeight(1000);

        train.setPTime(120);
        train.setPPrice(2500);
        train.setPWeight(150);
        train.setWTime(145);
        train.setWPrice(4000);
        train.setWWeight(350);

        ship.setPTime(85);
        ship.setPPrice(10800);
        ship.setPWeight(100);
        ship.setWTime(115);
        ship.setWPrice(34250);
        ship.setWWeight(2300);

        System.out.println("Car: ");
        System.out.println("Passenger time: " + car.getPTime());
        System.out.println("Passenger price: " + car.getPPrice());
        System.out.println("Passenger weight: " + car.getPWeight());
        System.out.println("--------------------------------------");
        System.out.println("Cargo time: " + car.getWTime());
        System.out.println("Cargo price: " + car.getWPrice());
        System.out.println("Cargo weight: " + car.getWWeight());

        System.out.println();

        System.out.println("Plane: ");
        System.out.println("Passenger time: " + plane.getPTime());
        System.out.println("Passenger price: " + plane.getPPrice());
        System.out.println("Passenger weight: " + plane.getPWeight());
        System.out.println("--------------------------------------");
        System.out.println("Cargo time: " + plane.getWTime());
        System.out.println("Cargo price: " + plane.getWPrice());
        System.out.println("Cargo weight: " + plane.getWWeight());

        System.out.println();

        System.out.println("Train: ");
        System.out.println("Passenger time: " + train.getPTime());
        System.out.println("Passenger price: " + train.getPPrice());
        System.out.println("Passenger weight: " + train.getPWeight());
        System.out.println("--------------------------------------");
        System.out.println("Cargo time: " + train.getWTime());
        System.out.println("Cargo price: " + train.getWPrice());
        System.out.println("Cargo weight: " + train.getWWeight());

        System.out.println();

        System.out.println("Ship: ");
        System.out.println("ship time: " + ship.getPTime());
        System.out.println("ship price: " + ship.getPPrice());
        System.out.println("ship weight: " + ship.getPWeight());
        System.out.println("--------------------------------------");
        System.out.println("Cargo time: " + ship.getWTime());
        System.out.println("Cargo price: " + ship.getWPrice());
        System.out.println("Cargo weight: " + ship.getWWeight());
    }
}
