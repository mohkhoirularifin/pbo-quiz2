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
    private DefaultTableModel tabel = new DefaultTableModel();
    
    public Transaksi(){
        getTabel().addColumn("Nama");
        getTabel().addColumn("Harga");
        getTabel().addColumn(Jumlah);
    }
    
    public double countTotal(){
        total=0;
        for (int i = 0; i < tabel.getColumnCount(); i++) {
            total = total + Double.parseDouble(tabel.getValueAt(i, 2).toString());
        }
        return total;
    }
    
    public DefaultTableModel getTabel(){
        return tabel;
    }
}