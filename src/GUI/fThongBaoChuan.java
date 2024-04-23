/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GROUP.ThongTinKhoHienTai;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.lang.*;

/**
 *
 * @author Dinh Tien
 */
public class fThongBaoChuan extends javax.swing.JFrame {

    /**
     * Creates new form fThongBaoChuan
     */
    public int id_nv;
    public ArrayList<ThongTinKhoHienTai> DuLieuMau;
    public ArrayList<ThongTinKhoHienTai> DanhSachSoLuong;
    public ArrayList<ThongTinKhoHienTai> DanhSachHSD;

    public fThongBaoChuan() {
        initComponents();
        setIcon();
    }

    public fThongBaoChuan(int id_nv) {
        this.id_nv = id_nv;
        initComponents();
        setIcon();
        build();
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Logo2.png")));
    }
    public void build() {
        DuLieuMau=DAO.daoKho.getInstance().getListThongTinKhoHienTai();
        DanhSachSoLuong=DAO.daoKho.getInstance().KiemTraSoLuongTrongKho(DuLieuMau);
        DanhSachHSD=DAO.daoKho.getInstance().KiemTraHSDTrongKho(DuLieuMau);
        listDanhSachSoLuong(DanhSachSoLuong);
        listDanhSachHSD(DanhSachHSD);
    }

    public void listDanhSachSoLuong(ArrayList<ThongTinKhoHienTai> arr) {
        DefaultTableModel model = (DefaultTableModel) jTableSoLuong.getModel();
        while (jTableSoLuong.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (int i = arr.size() - 1; i > 0; i--) {
            ThongTinKhoHienTai item = arr.get(i);
            model.addRow(new Object[]{item.id_lo_sp, item.ten_sp, item.sl_san_pham,item.so_luong_lo});
        }
    }

    public void listDanhSachHSD(ArrayList<ThongTinKhoHienTai> arr) {
        DefaultTableModel model = (DefaultTableModel) jTableHSD.getModel();
        while (jTableHSD.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (int i = arr.size() - 1; i > 0; i--) {
            ThongTinKhoHienTai item = arr.get(i);
            model.addRow(new Object[]{item.id_lo_sp,item.ten_sp,item.sl_san_pham,item.hsd});
        }
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
<<<<<<< HEAD
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
=======
>>>>>>> master
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelSoLuongTon = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSoLuong = new javax.swing.JTable();
        jPanelHanSuDung = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHSD = new javax.swing.JTable();
<<<<<<< HEAD
=======
        jLabel4 = new javax.swing.JLabel();
>>>>>>> master

        setTitle("Thông báo");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

<<<<<<< HEAD
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Phần mềm quản lý kho");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("siêu thị S.O.S");

=======
>>>>>>> master
        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("THÔNG BÁO");
        jLabel3.setToolTipText("");

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanelSoLuongTon.setBackground(new java.awt.Color(255, 255, 255));

        jTableSoLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Lô", "Sản phẩm", "Số lượng lô", "Số lượng tồn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableSoLuong);
        if (jTableSoLuong.getColumnModel().getColumnCount() > 0) {
            jTableSoLuong.getColumnModel().getColumn(1).setHeaderValue("Sản phẩm");
            jTableSoLuong.getColumnModel().getColumn(2).setHeaderValue("Số lượng lô");
            jTableSoLuong.getColumnModel().getColumn(3).setHeaderValue("Số lượng tồn");
        }

        javax.swing.GroupLayout jPanelSoLuongTonLayout = new javax.swing.GroupLayout(jPanelSoLuongTon);
        jPanelSoLuongTon.setLayout(jPanelSoLuongTonLayout);
        jPanelSoLuongTonLayout.setHorizontalGroup(
            jPanelSoLuongTonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
        );
        jPanelSoLuongTonLayout.setVerticalGroup(
            jPanelSoLuongTonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Số lượng tồn", jPanelSoLuongTon);

        jPanelHanSuDung.setBackground(new java.awt.Color(255, 255, 255));

        jTableHSD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Lô", "Sản phẩm", "Số lượng lô", "Hạn sử dụng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableHSD);

        javax.swing.GroupLayout jPanelHanSuDungLayout = new javax.swing.GroupLayout(jPanelHanSuDung);
        jPanelHanSuDung.setLayout(jPanelHanSuDungLayout);
        jPanelHanSuDungLayout.setHorizontalGroup(
            jPanelHanSuDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
        );
        jPanelHanSuDungLayout.setVerticalGroup(
            jPanelHanSuDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Hạn sử dụng", jPanelHanSuDung);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
<<<<<<< HEAD
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
=======
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> master
                        .addContainerGap())
                    .addComponent(jTabbedPane1)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

<<<<<<< HEAD
=======
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quản lý kho siêu thị BigCity");

>>>>>>> master
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
=======
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> master
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
=======
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
>>>>>>> master
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(fThongBaoChuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fThongBaoChuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fThongBaoChuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fThongBaoChuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fThongBaoChuan(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
=======
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
>>>>>>> master
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelHanSuDung;
    private javax.swing.JPanel jPanelSoLuongTon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableHSD;
    private javax.swing.JTable jTableSoLuong;
    // End of variables declaration//GEN-END:variables
}
