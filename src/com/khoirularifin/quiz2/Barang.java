/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoirularifin.quiz2;

/**
 *
 * @author KINTUL
 */
public class Barang {
    // membaut atribut yang mempuanyai acces modifier pivate
    private String namaBarang;
    private double harga;

    // constructor
    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }
    // Menambahkan Getter dan Setter
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    // Membuat toString
    @Override
    public String toString() {
        return this.namaBarang;
    }
    
    
    
    
    
    
    
    
}
