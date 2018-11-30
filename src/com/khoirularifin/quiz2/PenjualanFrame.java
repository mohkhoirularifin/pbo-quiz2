/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoirularifin.quiz2;

// Menambahkan import yang diperlukan
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KINTUL
 */
public class PenjualanFrame extends javax.swing.JFrame {
    // Attribute Class Frame
    Barang barang;
    int code;
    DateFormat dateFormat;
    Date date;
    Transaksi penjualan = new Transaksi();
    boolean enable = true;
    DefaultTableModel tabel = new DefaultTableModel();
    /**
     * Creates new form PenjualanFrame
     */
    public PenjualanFrame() {
        initComponents();
        isiComboBarang();
        barangTable.setModel(penjualan.getTable());
        // setEnable untuk mengatur enable disable 
        barangComboBox.setEnabled(false);
        addButton.setEnabled(false);
        jumlahText.setEnabled(false);
        removeButton.setEnabled(false);
        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
    }
    
    private void isiComboBarang(){
        // isi dari combo box
        Barang brg1 = new Barang("Susu", 12000);
        Barang brg2 = new Barang("Gula", 10000);
        Barang brg3 = new Barang("Kopi", 14000);
        
        barangComboBox.addItem(brg1);
        barangComboBox.addItem(brg2);
        barangComboBox.addItem(brg3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codeText = new javax.swing.JTextField();
        barangComboBox = new javax.swing.JComboBox();
        newButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jumlahText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        barangTable = new javax.swing.JTable();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Code");

        jLabel2.setText("Items");

        codeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextActionPerformed(evt);
            }
        });

        barangComboBox.setToolTipText("");
        barangComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangComboBoxActionPerformed(evt);
            }
        });

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        barangTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                " ", "", ""
            }
        ));
        jScrollPane1.setViewportView(barangTable);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(barangComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jumlahText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 132, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(codeText)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(barangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton)
                    .addComponent(jumlahText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // Code untuk menambahkan item yang dibeli
        String[] data = new String[3];
        double harga;
        int qty = 0, jumlah = 0;
        
        data[0] = barang.getNamaBarang();
        harga = barang.getHarga();
        data[1] = String.valueOf(barang.getHarga());
        qty = Integer.parseInt(jumlahText.getText());
        jumlah = qty;
        data[2] = String.valueOf(jumlah);
//        penjualan.getTable().addRow(data);
        // ppengecekan apakah ada item yang sama
        // jika ada maka tinggal menambahkan pada item yang sudah ada
        int tableRow = penjualan.getTableRow();
        if (tableRow == 0) {
            penjualan.getTable().addRow(new Object[]{barang.getNamaBarang(), barang.getHarga(), jumlah});
        } else {
            for (int i = 0; i < tableRow; i++) {
                if (penjualan.getTable().getValueAt(i, 0).toString().equals(barang.getNamaBarang())) {
                    penjualan.getTable().setValueAt(Integer.parseInt(penjualan.getTable().getValueAt(i, 2).toString()) + Integer.parseInt(jumlahText.getText()), i, 2);
                    break;
                } else {
                    if (!penjualan.getTable().getValueAt(tableRow - 1, 0).toString().equals(barang.getNamaBarang()) && (i == tableRow - 1)) {
                        penjualan.getTable().addRow(new Object[]{barang.getNamaBarang(), barang.getHarga(), jumlahText.getText()});
                        break;
                    }
                }
            }
        }
        barangComboBox.requestFocus();
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void barangComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangComboBoxActionPerformed
        // Code untuk memilih item pada combobox
        barang = (Barang)barangComboBox.getSelectedItem();
    }//GEN-LAST:event_barangComboBoxActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // Code untuk menambahkan code
        code++;
        // Code agar mendapatkan tanggal saat terjadinya transaksi
        DateFormat dateFormat = new SimpleDateFormat("yyMMdd");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        // Code agar mendapatkan nomer urut 2 digit diawali angka 0,
        // dan jika bertemu angka 10 maka tidak ada 0 di depan
        codeText.setText(dateFormat.format(date) + String.format("%02d", code));
        // Code untuk mendisable item yang sudah dipilih
        codeText.setEnabled(false);
        newButton.setEnabled(false);
        // Code untuk meng-enable item yang akan dipilih
        barangComboBox.setEnabled(true);
        addButton.setEnabled(true);
        jumlahText.setEnabled(true);  
        removeButton.setEnabled(true);
        saveButton.setEnabled(true);
        cancelButton.setEnabled(true);
        
    }//GEN-LAST:event_newButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // Code untuk menghapus item yang dipilih
        penjualan.getTable().removeRow(barangTable.getSelectedRow());
    }//GEN-LAST:event_removeButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // Code untuk menyimpan transaksi dan menampilkannya
        DateFormat dateFormat = new SimpleDateFormat("yyMMdd");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        codeText.setText(dateFormat.format(date) + String.format("%02d", code));
        StringBuilder sb = new StringBuilder();
        sb.append("Kode: ").append(codeText.getText()).append("\n");
        sb.append("Detail Belanja: \n").append(penjualan.detailBarang());
        sb.append("Total: ").append(penjualan.countTotal()).append("\n");
        JOptionPane.showMessageDialog(this, sb, "Detail Transaksi", JOptionPane.INFORMATION_MESSAGE);
        code++;
        jumlahText.setText("");
        penjualan.getTable().setRowCount(0);
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // Code untuk membatalkan transaksi dan mengkosongkan frame
        new PenjualanFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PenjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenjualanFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox barangComboBox;
    private javax.swing.JTable barangTable;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField codeText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahText;
    private javax.swing.JButton newButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
