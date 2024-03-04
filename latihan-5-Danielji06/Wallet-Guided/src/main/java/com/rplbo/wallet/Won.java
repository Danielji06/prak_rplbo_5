package com.rplbo.wallet;
public class Won implements Currency{
    private double value;

    public Won(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double toUSD() {
        return 0.00075 * this.value;
    }

    @Override
    public double toRupiah() {
        return 11.81 * this.value;
    }

    @Override
    public double toWon() {
        return this.value;
    }

    @Override
    public double toYen() {
        return 0.11 * this.value;
    }
}
