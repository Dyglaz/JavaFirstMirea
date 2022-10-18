package ru.mirea.task4.task4_1_10;

public class Ship extends TransportVehicle {
    @Override
    public double getWTime() {
        return timeW;
    }

    @Override
    public double getWPrice() {
        return priceW;
    }

    @Override
    public double getWWeight() {
        return weightW;
    }

    @Override
    public double getPTime() {
        return timeP;
    }

    @Override
    public double getPPrice() {
        return priceP;
    }

    @Override
    public double getPWeight() {
        return weightP;
    }

    @Override
    public void setWTime(double timeW) {
        this.timeW = timeW;
    }

    @Override
    public void setWPrice(double priceW) {
        this.priceW = priceW;
    }

    @Override
    public void setWWeight(double weightW) {
        this.weightW = weightW;
    }

    @Override
    public void setPTime(double timeP) {
        this.timeP = timeP;
    }

    @Override
    public void setPPrice(double priceP) {
        this.priceP = priceP;
    }

    @Override
    public void setPWeight(double weightP) {
        this.weightP = weightP;
    }
}
