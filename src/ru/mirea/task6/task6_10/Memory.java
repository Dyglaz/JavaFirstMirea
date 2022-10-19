package ru.mirea.task6.task6_10;

public class Memory {
    private int sizeInGB;

    public Memory(int sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    public int getSizeInGB() {
        return sizeInGB;
    }

    public void setSizeInGB(int sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "sizeInGB=" + sizeInGB +
                '}';
    }
}
