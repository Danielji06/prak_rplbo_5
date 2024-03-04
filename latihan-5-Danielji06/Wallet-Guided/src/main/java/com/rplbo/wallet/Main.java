package com.rplbo.wallet;

public class Main {
    public static void main(String[] args) {
        Currency rp = new Rupiah(70000);

        Wallet dw = new DollarWallet();
        dw.insertMoney(rp);
        dw.expenseMoney(new Rupiah(20000));
        dw.printMoney();

        dw.insertMoney(new Won(50000));
        dw.printMoney();
        dw.expenseMoney(new Won(10000));
        dw.printMoney();
    }
}
