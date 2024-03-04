package com.rplbo.wallet;
public abstract class Wallet {
    private double totalUang;
    public abstract void insertMoney(Currency c);
    public abstract void expenseMoney(Currency c);
    public abstract void printMoney();

    public double getTotalUang() {
        return this.totalUang;
    }

    public void setTotalUang(double totalUang) {
        this.totalUang = totalUang;
    }
}
