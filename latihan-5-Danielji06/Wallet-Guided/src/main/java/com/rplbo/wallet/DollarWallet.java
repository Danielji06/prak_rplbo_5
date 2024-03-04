package com.rplbo.wallet;
public class DollarWallet extends Wallet {
    public DollarWallet() {
    }

    @Override
    public void insertMoney(Currency c) {
        double uangMasuk = c.toUSD();
        setTotalUang(getTotalUang()+uangMasuk);
    }

    @Override
    public void expenseMoney(Currency c) {
        double uangKeluar = c.toUSD();
        setTotalUang(getTotalUang()-uangKeluar);
    }

    @Override
    public void printMoney() {
        System.out.println("Total uang: "+getTotalUang()+ "USD");
    }
}
