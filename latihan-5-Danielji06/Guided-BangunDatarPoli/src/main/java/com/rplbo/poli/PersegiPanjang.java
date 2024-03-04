package com.rplbo.poli;

public class PersegiPanjang extends BagunDatar {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.lebar = lebar;
        this.panjang = panjang;
    }

    @Override
    public void luas() {
        System.out.println("Luas: " + (this.panjang*this.lebar));
    }

    @Override
    public void keliling() {
        System.out.println("Keliling: " + 2 * (this.panjang + this.lebar));
    }
}
