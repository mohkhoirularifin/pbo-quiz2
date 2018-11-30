/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoirularifin.quiz2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KINTUL
 */
public class Transaksi {
    private double total=0;
    private double detailBaran;
    private DefaultTableModel tabel = new DefaultTableModel();
    
    public Transaksi(){
        getTabel().addColumn("Nama");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Jumlah");
    }
    
    public double countTotal(){
        total=0;
        for (int i = 0; i < tabel.getColumnCount(); i++) {
            total = total + Double.parseDouble(tabel.getValueAt(i, 1).toString()) * Double.parseDouble(tabel.getValueAt(i, 2).toString());
        }
        return total;
    }
    
    public String detailBarang(){
        String detailBarang = "";
        for (int i = 0; i < tabel.getRowCount(); i++) {
            detailBarang += tabel.getValueAt(i, 0).toString() + " " + tabel.getValueAt(i, 2).toString() +
                    " " + (Double.parseDouble(tabel.getValueAt(i, 1).toString()) * Double.parseDouble(tabel.getValueAt(i, 2).toString())) + "\n";
        }
        return detailBarang;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public DefaultTableModel getTabel(){
        return tabel;
    }

    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
}
