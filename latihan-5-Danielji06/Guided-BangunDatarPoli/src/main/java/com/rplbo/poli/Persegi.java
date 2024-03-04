package com.rplbo.poli;

public class Persegi extends BagunDatar{
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void luas() {
        System.out.println("Luas: " + (this.sisi * this.sisi));
    }

    @Override
    public void keliling() {
        System.out.println("Keliling: " + (4 * this.sisi));
    }

}
