package com.rplbo.wallet;
public class Rupiah implements Currency{
    private double value;

    public Rupiah(double value) {
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
        return 0.000064 * this.value;
    }

    @Override
    public double toRupiah() {
        return this.value;
    }

    @Override
    public double toWon() {
        return 0.085 * this.value;
    }

    @Override
    public double toYen() {
        return 0.0096 * this.value;
    }
}
