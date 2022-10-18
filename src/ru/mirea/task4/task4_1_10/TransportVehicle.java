package ru.mirea.task4.task4_1_10;

public abstract  class TransportVehicle {
    protected double timeP;
    protected double priceP;
    protected double weightP;

    protected double timeW;
    protected double priceW;
    protected double weightW;

    public abstract double getWTime();
    public abstract double getWPrice();
    public abstract double getWWeight();

    public abstract double getPTime();
    public abstract double getPPrice();
    public abstract double getPWeight();

    public abstract void setWTime(double timeW);
    public abstract void setWPrice(double priceW);
    public abstract void setWWeight(double weightW);

    public abstract void setPTime(double timeP);
    public abstract void setPPrice(double priceP);
    public abstract void setPWeight(double weightP);
}
