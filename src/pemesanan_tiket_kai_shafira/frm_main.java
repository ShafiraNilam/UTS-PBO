/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesanan_tiket_kai_shafira;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class frm_main extends javax.swing.JFrame {

    
    public frm_main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pemesanan = new javax.swing.JTextField();
        noid = new javax.swing.JTextField();
        brngkt = new javax.swing.JTextField();
        tujuan = new javax.swing.JTextField();
        tglBrngkt = new com.toedter.calendar.JDateChooser();
        jnskai = new javax.swing.JComboBox<>();
        duduk = new javax.swing.JComboBox<>();
        waktu = new javax.swing.JComboBox<>();
        hrg = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1Data = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PemesAnAN Tiket Kereta Api Indonesia ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 20, 460, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1310, 90);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Harga");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 380, 130, 30);

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Pemesanan");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 30, 130, 30);

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NO ID");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 70, 130, 30);

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stasiun Awal");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 110, 130, 30);

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stasiun Tujuan");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 150, 130, 30);

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tanggal Berangkat");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 190, 130, 30);

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jenis Kereta");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(50, 240, 130, 30);

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Waktu Berangkat");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 280, 130, 30);

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gerbong");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 330, 130, 30);

        pemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemesananActionPerformed(evt);
            }
        });
        jPanel2.add(pemesanan);
        pemesanan.setBounds(240, 30, 170, 30);

        noid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noidActionPerformed(evt);
            }
        });
        jPanel2.add(noid);
        noid.setBounds(240, 70, 170, 30);

        brngkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brngktActionPerformed(evt);
            }
        });
        jPanel2.add(brngkt);
        brngkt.setBounds(240, 110, 170, 30);

        tujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuanActionPerformed(evt);
            }
        });
        jPanel2.add(tujuan);
        tujuan.setBounds(240, 150, 170, 30);
        jPanel2.add(tglBrngkt);
        tglBrngkt.setBounds(240, 190, 170, 30);

        jnskai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ekonomi", "Bisnis", "Eksekutif", " ", " " }));
        jnskai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnskaiActionPerformed(evt);
            }
        });
        jPanel2.add(jnskai);
        jnskai.setBounds(240, 240, 170, 30);

        duduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel2.add(duduk);
        duduk.setBounds(240, 330, 170, 30);

        waktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06.00", "10.00", "14.00", "16.00", "20.00" }));
        jPanel2.add(waktu);
        waktu.setBounds(240, 280, 170, 30);
        jPanel2.add(hrg);
        hrg.setBounds(240, 380, 170, 30);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(null);
        jPanel2.add(jPanel3);
        jPanel3.setBounds(210, 20, 220, 420);

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(980, 330, 120, 50);

        tb1Data.setBackground(new java.awt.Color(204, 204, 255));
        tb1Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nm_pmsn", "no_id", "stasiun_awal", "stasiun_akhir", "tgl_brngkt", "jns_kai", "wkt_brngkt", "tmpt_duduk", "harga"
            }
        ));
        jScrollPane1.setViewportView(tb1Data);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(450, 30, 820, 240);

        refresh.setBackground(new java.awt.Color(0, 0, 51));
        refresh.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        refresh.setForeground(new java.awt.Color(204, 204, 255));
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel2.add(refresh);
        refresh.setBounds(1130, 330, 120, 50);

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 255));
        jButton3.setText("PRINT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(450, 330, 120, 50);

        jButton4.setBackground(new java.awt.Color(0, 0, 51));
        jButton4.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 255));
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(810, 330, 120, 50);

        jButton6.setBackground(new java.awt.Color(0, 0, 51));
        jButton6.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 255));
        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(630, 330, 120, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 1310, 480);

        setSize(new java.awt.Dimension(1339, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pemesananActionPerformed

    private void noidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noidActionPerformed

    private void brngktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brngktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brngktActionPerformed

    private void tujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tujuanActionPerformed

    private void jnskaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnskaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnskaiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
         String tanggal = dateFormat.format(tglBrngkt.getDate());
         String WKT =  waktu.getSelectedItem().toString();
        
        if("".equals(pemesanan.getText()) || "".equals(noid.getText())|| "".equals(brngkt.getText()) || "".equals(tujuan.getText()) || "".equals(hrg.getText()) || tanggal.equals("")){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            if(jnskai.getSelectedItem().equals("Ekonomi")){
                
            }else if (jnskai.getSelectedItem().equals("Bisinis")){
                
            }else if (jnskai.getSelectedItem().equals("Eksekutif")){
               
               
                if(waktu.getSelectedItem().equals("06.00")){
                    WKT = "06.00";
                }else if (waktu.getSelectedItem().equals("10.00")){
                    WKT = "10.00";
                }else if(waktu.getSelectedItem().equals("14.00")){
                    WKT = "14.00";
                }else if (waktu.getSelectedItem().equals("16.00")){
                    WKT = "16.00";
                }else if (waktu.getSelectedItem().equals("20.00")){
                    WKT = "20.00";
                }
            }
            String SQL = "INSERT INTO tb_pemesanan (nm_pmsn,no_id,stasiun_awal,stasiun_akhir,tgl_brngkt,jns_kai,wkt_brngkt,tmpt_duduk,harga)"
                    + "VALUES ('"+pemesanan.getText()+"','"+noid.getText()+"','"+brngkt.getText()+"','"+tujuan.getText()+"','"+tanggal+"','"+jnskai.getSelectedItem()+"','"+WKT+"','"+duduk.getSelectedItem()+"','"+hrg.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1){
                JOptionPane.showMessageDialog(this,"Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan","gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        selectData();
    }//GEN-LAST:event_refreshActionPerformed
    public void selectData() {
        
        String kolom[] = {"nm_pmsn","no__id","stasiun_awal","stasiun_akhir","tgl_brngkt","jns_kai","wkt_brngkt","tmpt_duduk","harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_pemesanan";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()) {
        String nm_pmsn = rs.getString(1);
        String no_id = rs.getString(2);
        String stasiun_awal = rs.getString(3);
        String stasiun_akhir = rs.getString(4);
        String tgl_brngkt = rs.getString(5);
        String jns_kai = rs.getString(6);
        String wkt_brngkt = rs.getString(7);
        String tmpt_duduk = rs.getString(8);
        String harga = rs.getString(9);
        
        String data[] = {nm_pmsn,no_id,stasiun_awal,stasiun_akhir,tgl_brngkt,jns_kai,wkt_brngkt,tmpt_duduk,harga};
        dtm.addRow(data);
        }
    }catch (SQLException ex) {
        Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
    }
        tb1Data.setModel(dtm);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MessageFormat header = new MessageFormat(" Pemesanan Tiket Kereta");
        MessageFormat footer = new MessageFormat("Page (0,number,integer) ");
        try{
            tb1Data.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        }   catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
        pemesanan.setText("");
        noid.setText("");
        brngkt.setText("");
        tujuan.setText("");
        tglBrngkt.setDateFormatString("");
        jnskai.setToolTipText("");
        waktu.setToolTipText("");
        brngkt.setText("");
        duduk.setToolTipText("");
        hrg.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        int baris = tb1Data.getSelectedRow();
        if( baris != -1){
            String no_id = tb1Data.getValueAt(baris, 1).toString();
            String SQL = "DELETE FROM tb_pemesanan WHERE no_id='"+no_id+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukes", JOptionPane.INFORMATION_MESSAGE);
            } else {
                 JOptionPane.showMessageDialog(this, "Data gagal dihapus", "gagal", JOptionPane.WARNING_MESSAGE);
            }
        }else {
             JOptionPane.showMessageDialog(this, "Pilih Baris data terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brngkt;
    private javax.swing.JComboBox<String> duduk;
    private javax.swing.JTextField hrg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jnskai;
    private javax.swing.JTextField noid;
    private javax.swing.JTextField pemesanan;
    private javax.swing.JButton refresh;
    private javax.swing.JTable tb1Data;
    private com.toedter.calendar.JDateChooser tglBrngkt;
    private javax.swing.JTextField tujuan;
    private javax.swing.JComboBox<String> waktu;
    // End of variables declaration//GEN-END:variables

    
}
    
