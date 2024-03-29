/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.daoLoSanPham;
import DAO.daoLoaiSanPham;
import DAO.daoSanPham;
import DTO.ChiTietLoSanPham;
import DTO.Kho;
import DTO.LoSanPham;
import DTO.SanPham;
import GROUP.ThongTinKhoHienTai;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.lang.*;

/**
 *
 * @author Dinh Tien
 */
public class fCreate_PhieuXuat_sub extends javax.swing.JFrame {

    /**
     * Creates new form fCreate_PhieuXuat_sub
     */
    public int id_nv;

    public fCreate_PhieuXuat_sub() {
        initComponents();
        setIcon();
        build();
    }

    public fCreate_PhieuXuat_sub(int id_nv) {
        this.id_nv = id_nv;
        initComponents();
        setIcon();
        build();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Logo2.png")));
    }

    public void build() {
        listDanhSachKho();
    }

    public void listDanhSachKho() {
        DefaultTableModel model = (DefaultTableModel) jTableLo.getModel();
        while (jTableLo.getRowCount() > 0) {
            model.removeRow(0);
        }
        ArrayList<ThongTinKhoHienTai> arr = DAO.daoKho.getInstance().getListThongTinKhoHienTai();
        arr.stream().forEach((item) -> {
            //System.out.print(item.id_lo_sp);
            model.addRow(new Object[]{item.id_lo_sp, item.ten_sp, item.sl_san_pham, item.hsd});
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLo = new javax.swing.JTable();
        jButtonThoat = new javax.swing.JButton();
        jButtonLuu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTimKiem = new javax.swing.JTextField();
        jButtonTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông tin sản phẩm trong kho");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jTableLo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableLo.setAutoCreateRowSorter(true);
        jTableLo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID lô", "Tên sản phẩm", "SL lô", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLo.setRowHeight(30);
        jTableLo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLo);

        jButtonThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonThoat.setText("Thoát");
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });

        jButtonLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLuu.setText("Tiếp tục");
        if(GUI.fCreate_PhieuXuat.checkOpen())
        jButtonLuu.setVisible(false);
        jButtonLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLuuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHỌN SẢN PHẨM");

        jTextFieldTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTimKiemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTimKiemKeyReleased(evt);
            }
        });

        ImageIcon imgTimKiem = new ImageIcon(getClass().getResource("/icon/icons8-search.png"));
        ImageIcon ImgTimKiem = new ImageIcon(imgTimKiem.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonTimKiem.setIcon(ImgTimKiem);
        jButtonTimKiem.setText("Tìm kiếm");
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButtonThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTimKiem)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonThoatActionPerformed

    private void jTableLoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLoMouseClicked
        int selectrow = jTableLo.getSelectedRow();
        String id_lo = jTableLo.getValueAt(selectrow, 0).toString();
        String tensp = jTableLo.getValueAt(selectrow, 1).toString();
        String hsd = jTableLo.getValueAt(selectrow, 3).toString();
        String sl = jTableLo.getValueAt(selectrow, 2).toString();

        ChiTietLoSanPham ctlsp = DAO.daoChiTietLoSanPham.getInstance().getChiTietLoSanPham(Integer.parseInt(id_lo));
        SanPham sp = DAO.daoSanPham.getInstance().getSanPham(ctlsp.id_sp);
        LoSanPham lsp = DAO.daoLoSanPham.getInstance().getLoSanPham(Integer.parseInt(id_lo));
        String nsx = lsp.nsx;
        String loaisp = DAO.daoLoaiSanPham.getInstance().getLoaiSanPham(sp.id_loai_sp).ten_loai_sp;
        byte[] hinh_anh = sp.hinh_anh;
        fCreate_PhieuXuat.getInstance().setText(tensp, hsd, sl, nsx, loaisp, hinh_anh, id_lo);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableLoMouseClicked

    private void jButtonLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLuuActionPerformed
        if (GUI.fCreate_PhieuXuat.checkOpen()) {
            dispose();
        } else {
            GROUP.ThongTinLo lo = new GROUP.ThongTinLo();
            
            int selectrow = jTableLo.getSelectedRow();
            String id_lo = jTableLo.getValueAt(selectrow, 0).toString();
            String tensp = jTableLo.getValueAt(selectrow, 1).toString();
            String hsd = jTableLo.getValueAt(selectrow, 3).toString();
            String sl = jTableLo.getValueAt(selectrow, 2).toString();
//
                System.out.println(sl);
lo = daoLoSanPham.getInstance().getThongTinLo(Integer.parseInt(id_lo));
            
            

            ChiTietLoSanPham ctlsp = DAO.daoChiTietLoSanPham.getInstance().getChiTietLoSanPham(Integer.parseInt(id_lo));
            SanPham sp = DAO.daoSanPham.getInstance().getSanPham(ctlsp.id_sp);
            LoSanPham lsp = DAO.daoLoSanPham.getInstance().getLoSanPham(Integer.parseInt(id_lo));
            String nsx = lsp.nsx;
            String loaisp = DAO.daoLoaiSanPham.getInstance().getLoaiSanPham(sp.id_loai_sp).ten_loai_sp;
            byte[] hinh_anh = sp.hinh_anh;
            JFrame XuatKho = new fCreate_PhieuXuat(id_nv, 1);
            XuatKho.setVisible(false);
            ThongTinKhoHienTai item = DAO.daoKho.getInstance().getThongTinKhoHienTai(Integer.parseInt(id_lo));
            fCreate_PhieuXuat.getInstance().setText(lo.ten_sp, lo.hsd,sl, lo.nsx, lo.ten_loai_sp, lo.hinh_anh, id_lo);
            dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLuuActionPerformed

    private void jTextFieldTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTimKiemKeyReleased
        if ("".equals(jTextFieldTimKiem.getText())) {
            build();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTimKiemKeyReleased

    private void jTextFieldTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTimKiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String[][] Data;
            DefaultTableModel model = (DefaultTableModel) jTableLo.getModel();
            while (jTableLo.getRowCount() > 0) {
                model.removeRow(0);
            }
            //System.out.println("Giai doan 1");
            Data = DAO.daoKho.getInstance().FindListKhoXuat(jTextFieldTimKiem.getText());
            // System.out.println("Giai doan 2");
            //DefaultTableModel model = (DefaultTableModel) jTableLo.getModel();
            while (jTableLo.getRowCount() > 0) {
                model.removeRow(0);
            }
            int i = 0;
            while (Data[i][0] != null) {
                //System.out.println("Giai doan 3");
                model.addRow(new Object[]{
                    Data[i][0],
                    Data[i][1],
                    Data[i][2],
                    Data[i][3]});
                i++;
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTimKiemKeyPressed

    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        String[][] Data;
        //System.out.println("Giai doan 1");
        Data = DAO.daoKho.getInstance().FindListKhoXuat(jTextFieldTimKiem.getText());
        // System.out.println("Giai doan 2");
        DefaultTableModel model = (DefaultTableModel) jTableLo.getModel();
        while (jTableLo.getRowCount() > 0) {
            model.removeRow(0);
        }
        int i = 0;
        while (Data[i][0] != null) {
            //System.out.println("Giai doan 3");
            model.addRow(new Object[]{
                Data[i][0],
                Data[i][1],
                Data[i][2],
                Data[i][3]});
            i++;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(fCreate_PhieuXuat_sub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fCreate_PhieuXuat_sub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fCreate_PhieuXuat_sub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fCreate_PhieuXuat_sub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fCreate_PhieuXuat_sub(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLuu;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableLo;
    private javax.swing.JTextField jTextFieldTimKiem;
    // End of variables declaration//GEN-END:variables
}
