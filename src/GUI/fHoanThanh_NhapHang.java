/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.NhapKho;
import GROUP.ThongTinNhap;
import java.awt.GraphicsConfiguration;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.lang.*;

/**
 *
 * @author nghia
 */
public class fHoanThanh_NhapHang extends javax.swing.JFrame {

    /**
     * Creates new form fHoanThanh_NhapHang
     */
    public int id_nv;
    public int id_sp;
    public int so_tien_sp;
    public int so_luong_sp;
    public String ghi_chu;
    public String hsd;
    public String nsx;
    public int id_nguon_cc;
    public int so_luong_lo;
    public int so_tien_lo;
    //
    public String thoi_gian;

    public fHoanThanh_NhapHang(int id_nv, int id_sp, int so_tien_sp, int so_luong_sp, String ghi_chu, String hsd, String nsx,int id_nguon_cc, int so_luong_lo,int so_tien_lo) {
        initComponents();
        setIcon();
        this.id_nv = id_nv;
        this.id_sp = id_sp;
        this.so_tien_sp = so_tien_sp;
        this.so_luong_sp = so_luong_sp;
        this.ghi_chu = ghi_chu;
        this.hsd = hsd;
        this.nsx = nsx;
        this.id_nguon_cc = id_nguon_cc;
        this.so_luong_lo = so_luong_lo;
        this.so_tien_lo = so_tien_lo;
        this.thoi_gian = DAO.DateTimeNow.getIntance().Now;
    }
        
    public fHoanThanh_NhapHang() {
        
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Logo2.png")));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonLuuVaThoat = new javax.swing.JButton();
        jButtonLuuVaXuatBaoCao = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hoàn thành nhập hàng");
        setResizable(false);

        jButton1.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonLuuVaThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLuuVaThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-as.png"))); // NOI18N
        jButtonLuuVaThoat.setText("Lưu lại và thoát");
        jButtonLuuVaThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLuuVaThoatMouseClicked(evt);
            }
        });
        jButtonLuuVaThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLuuVaThoatActionPerformed(evt);
            }
        });

        jButtonLuuVaXuatBaoCao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLuuVaXuatBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-print.png"))); // NOI18N
        jButtonLuuVaXuatBaoCao.setText("Lưu và xuất báo cáo");
        jButtonLuuVaXuatBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLuuVaXuatBaoCaoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(119, 119, 119));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 76, 76));
        jLabel7.setText("Xác nhận để hoàn thành việc nhập hàng vào kho theo lô sản phẩm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonLuuVaThoat)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLuuVaXuatBaoCao))
                    .addComponent(jLabel7))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLuuVaThoat)
                    .addComponent(jButtonLuuVaXuatBaoCao))
                .addGap(57, 57, 57))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home.png"))); // NOI18N
        jLabel3.setText("Trang chủ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-news.png"))); // NOI18N
        jLabel4.setText("Thông tin Lô");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-checked.png"))); // NOI18N
        jLabel5.setText("Hoàn thành");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-folder.png"))); // NOI18N
        jLabel6.setText("Chọn sản phẩm");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-container-truck.png"))); // NOI18N
        jLabel8.setText("Nhà cung cấp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLuuVaThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLuuVaThoatMouseClicked
        NhapKho nhap = new NhapKho(thoi_gian ,so_luong_sp,so_tien_sp,id_sp,ghi_chu,id_nv,hsd,nsx,id_nguon_cc,so_tien_lo,so_luong_lo);
        nhap.Run();
        JFrame TrangChu = new fHome(id_nv);
            TrangChu.setVisible(true);
            dispose();
        JOptionPane.showMessageDialog(rootPane,
            "Đã lưu thông tin phiếu nhập thành công.",
            "Thông báo",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonLuuVaThoatMouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
//        JFrame TrangChu = new fHome(id_nv);
//        TrangChu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jButtonLuuVaXuatBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLuuVaXuatBaoCaoActionPerformed
        NhapKho nhap = new NhapKho(thoi_gian ,so_luong_sp,so_tien_sp,id_sp,ghi_chu,id_nv,hsd,nsx,id_nguon_cc,so_tien_lo,so_luong_lo);
        nhap.Run();
        //
        ThongTinNhap thongtinnhap = NhapKho.getInstance().getThongTinNhap(thoi_gian);
        //
        JFrame printthongtin = new fPrintThongTinNhap(thongtinnhap);
        printthongtin.setVisible(true);
        //
        JOptionPane.showMessageDialog(rootPane,
            "Đã lưu thông tin phiếu nhập thành công.",
            "Thông báo",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonLuuVaXuatBaoCaoActionPerformed

    private void jButtonLuuVaThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLuuVaThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLuuVaThoatActionPerformed

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
            java.util.logging.Logger.getLogger(fHoanThanh_NhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fHoanThanh_NhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fHoanThanh_NhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fHoanThanh_NhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fHoanThanh_NhapHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLuuVaThoat;
    private javax.swing.JButton jButtonLuuVaXuatBaoCao;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
