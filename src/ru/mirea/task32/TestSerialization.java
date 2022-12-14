package ru.mirea.task32;

import java.io.*;

public class TestSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        MySerializable mySerializable1 = new MySerializable();
        mySerializable1.setValue(20);
        mySerializable1.setAnotherValue(33);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(mySerializable1);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("output.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        MySerializable mySerializable2 = (MySerializable) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(mySerializable1);
        System.out.println(mySerializable2);
    }

}
