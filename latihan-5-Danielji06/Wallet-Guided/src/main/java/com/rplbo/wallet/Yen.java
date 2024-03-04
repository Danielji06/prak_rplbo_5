package com.rplbo.wallet;

public class Yen implements Currency {
    private double value;

    public Yen(double value) {
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
        return 0.0067 * this.value;
    }

    @Override
    public double toRupiah() {
        return 104.66 * this.value;
    }

    @Override
    public double toWon() {
        return 8.86 * this.value;
    }

    @Override
    public double toYen() {
        return this.value;
    }
}
