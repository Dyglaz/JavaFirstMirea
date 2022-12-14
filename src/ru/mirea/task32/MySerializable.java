package ru.mirea.task32;

import java.io.Serial;
import java.io.Serializable;

public class MySerializable implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    static String country = "Germany";
    private int value;
    transient int  anotherValue;

    public static String getCountry() {
        return country;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getAnotherValue() {
        return anotherValue;
    }

    public void setAnotherValue(int anotherValue) {
        this.anotherValue = anotherValue;
    }

    @Override
    public String toString() {
        return "MySerializable{" +
                "country=" + country +
                "value=" + value +
                ", anotherValue=" + anotherValue +
                '}';
    }
}
