package com.rplbo.poli;

public class Main {
    public static void main(String[] args) {
        BagunDatar p = new Persegi(4);
        BagunDatar p2 = new PersegiPanjang(4, 5);
        System.out.println("Luas ");
        tampilkanLuas(p);
        tampilkanLuas(p2);
        System.out.println("Keliling ");
        tampilKeliling(p);
        tampilKeliling(p2);
    }

    public static void tampilKeliling(BagunDatar bd){
        bd.keliling();
    }

    public static void tampilkanLuas(BagunDatar bd){
        bd.luas();
    }
}
