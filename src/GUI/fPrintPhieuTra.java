/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.ChiTietLoSanPham;
import DTO.ChiTietPhieuNhap;
import DTO.Kho;
import DTO.KhuVuc;
import DTO.LoSanPham;
import DTO.LoaiSanPham;
import DTO.NguonCungCap;
import DTO.NhanVien;
import DTO.PhieuTraKho;
import DTO.SanPham;
import DTO.TaiKhoan;
import DTO.XuatKho;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.lang.*;

/**
 *
 * @author Dinh Tien
 */
public class fPrintPhieuTra extends javax.swing.JFrame {

    /**
     * Creates new form fPrintPhieuTra
     */
    public int id_nv;
    public int id_pt;
    public fPrintPhieuTra() {
        initComponents();
    }
    public fPrintPhieuTra(int id_nv, int id_pt)
    {
        this.id_nv=id_nv;
        this.id_pt=id_pt;
        initComponents();
        setIcon();
        build();
    }
    public void build()
    {
        ThongTinIn();
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Logo2.png")));
    }
    public void ThongTinIn()
    {
        PhieuTraKho px = DAO.daoTraNhaCungCap.getInstance().getTraKho(id_pt);
        NhanVien nv = DAO.daoTaiKhoan.getInstance().getNhanVien(px.id_nv);
        TaiKhoan tk = DAO.daoTaiKhoan.getInstance().getTaiKhoan(id_nv);
        ChiTietLoSanPham ctlsp = DAO.daoChiTietLoSanPham.getInstance().getChiTietLoSanPham(px.id_lo_sp);
        SanPham sp = DAO.daoSanPham.getInstance().getSanPham(ctlsp.id_sp);
        LoaiSanPham loaisp = DAO.daoLoaiSanPham.getInstance().getLoaiSanPham(sp.id_loai_sp);
        LoSanPham lsp = DAO.daoLoSanPham.getInstance().getLoSanPham(px.id_lo_sp);
        ChiTietPhieuNhap ctpn = DAO.daoChiTietPhieuNhap.getInstance().getChiTietPhieuNhap(lsp.id_phieu_nhap);
        NguonCungCap ncc = DAO.daoNguonCungCap.getInstance().getNguonCungCap(ctpn.id_nguon_cc);
        Kho kho = DAO.daoKho.getInstance().getLoKho(lsp.id_lo_sp);
        KhuVuc kv = DAO.daoKhuVuc.getInstance().getKhuVuc(kho.id_khu_vuc);
        jLabelTenNhaCungCap.setText(ncc.ten_nha_cc);
        jLabelDiaChi.setText(ncc.dia_chi);
        jLabelThoiGian.setText(px.thoi_gian_tra);
        jLabelMaLo.setText(String.valueOf(px.id_lo_sp));
        jLabelTenSanPham.setText(sp.ten_sp);
        jLabelSoLuong.setText(String.valueOf(px.sl_san_pham));
        jLabelDvt.setText(loaisp.dvt);
        jLabelDonGia.setText(String.valueOf(ctlsp.so_tien_sp));
        jLabelTenNhanVien2.setText(nv.ten_nv);
        jLabelnumber.setText(String.valueOf(px.id_phieu_tra_kho));
        jLabelKho.setText(kv.ten_khu_vuc);
        jLabelDiaDiem.setText(kv.vi_tri);
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
        jPanelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelnumber = new javax.swing.JLabel();
<<<<<<< HEAD
        jLabel9 = new javax.swing.JLabel();
=======
>>>>>>> master
        jLabel10 = new javax.swing.JLabel();
        jLabelThoiGian = new javax.swing.JLabel();
        jPanelContent = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelTenNhaCungCap = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelDiaChi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelKho = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelDiaDiem = new javax.swing.JLabel();
        jPanelContentSub = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabelTenSanPham = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelMaLo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelSoLuong = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelDvt = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelDonGia = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabelTenNhanVien2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelControl = new javax.swing.JPanel();
        jButtonPrint = new javax.swing.JButton();
        jButtonThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PHIẾU TRẢ NHÀ CUNG CẤP");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Số: ");

        jLabelnumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelnumber.setText("number");

<<<<<<< HEAD
        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel9.setText("SIÊU THỊ S.O.S");

=======
>>>>>>> master
        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Ngày trả: ");

        jLabelThoiGian.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelThoiGian.setText("jLabelThoiGian");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
                .addContainerGap(195, Short.MAX_VALUE)
>>>>>>> master
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelnumber)
                .addGap(113, 113, 113))
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
<<<<<<< HEAD
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelThoiGian)))
=======
                .addGap(270, 270, 270)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelThoiGian)
>>>>>>> master
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
                .addContainerGap(55, Short.MAX_VALUE)
>>>>>>> master
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabelnumber))
                .addGap(9, 9, 9)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelThoiGian)))
        );

        jPanelContent.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Tên nhà cung cấp: ");

        jLabelTenNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTenNhaCungCap.setText("jLabelTenNhanVien");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Địa chỉ: ");

        jLabelDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelDiaChi.setText("jLabelLyDo");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Xuất tại kho: ");

        jLabelKho.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelKho.setText("jLabelKho");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Địa điểm: ");

        jLabelDiaDiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelDiaDiem.setText("jLabelDiaDiem");

        jPanelContentSub.setBackground(new java.awt.Color(255, 255, 255));
<<<<<<< HEAD
        jPanelContentSub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
=======
        jPanelContentSub.setBorder(javax.swing.BorderFactory.createLineBorder(null));
>>>>>>> master

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Tên sản phẩm: ");

        jLabelTenSanPham.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTenSanPham.setText("jLabelTenSanPham");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Mã lô:");

        jLabelMaLo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelMaLo.setText("jLabelMaLo");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Số lượng: ");

        jLabelSoLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelSoLuong.setText("jLabelSoLuong");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("DVT: ");

        jLabelDvt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelDvt.setText("jLabelDvt");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Đơn giá: ");

        jLabelDonGia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelDonGia.setText("jLabelDonGia");

        javax.swing.GroupLayout jPanelContentSubLayout = new javax.swing.GroupLayout(jPanelContentSub);
        jPanelContentSub.setLayout(jPanelContentSubLayout);
        jPanelContentSubLayout.setHorizontalGroup(
            jPanelContentSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentSubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContentSubLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSoLuong)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelContentSubLayout.createSequentialGroup()
                        .addGroup(jPanelContentSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContentSubLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMaLo))
                            .addGroup(jPanelContentSubLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTenSanPham)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelContentSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContentSubLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDvt))
                            .addGroup(jPanelContentSubLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDonGia)))
                        .addGap(78, 78, 78))))
        );
        jPanelContentSubLayout.setVerticalGroup(
            jPanelContentSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentSubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabelMaLo)
                    .addComponent(jLabel14)
                    .addComponent(jLabelDvt))
                .addGap(18, 18, 18)
                .addGroup(jPanelContentSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabelTenSanPham)
                    .addComponent(jLabel15)
                    .addComponent(jLabelDonGia))
                .addGap(18, 18, 18)
                .addGroup(jPanelContentSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabelSoLuong))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(jPanelContentSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContentLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTenNhaCungCap))
                            .addGroup(jPanelContentLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelKho)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(14, 14, 14)
                                .addComponent(jLabelDiaDiem))
                            .addGroup(jPanelContentLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDiaChi)))
                        .addGap(69, 381, Short.MAX_VALUE))))
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelTenNhaCungCap))
                .addGap(18, 18, 18)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelDiaChi))
                .addGap(18, 18, 18)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelKho)
                    .addComponent(jLabel8)
                    .addComponent(jLabelDiaDiem))
                .addGap(18, 18, 18)
                .addComponent(jPanelContentSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFooter.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Ký tên");

        jLabelTenNhanVien2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTenNhanVien2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTenNhanVien2.setText("HoVaTen");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelFooterLayout = new javax.swing.GroupLayout(jPanelFooter);
        jPanelFooter.setLayout(jPanelFooterLayout);
        jPanelFooterLayout.setHorizontalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                        .addComponent(jLabelTenNhanVien2)
                        .addGap(72, 72, 72))))
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTenNhanVien2)
                .addContainerGap(13, Short.MAX_VALUE))
        );

<<<<<<< HEAD
        jPanelControl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
=======
        jPanelControl.setBorder(javax.swing.BorderFactory.createLineBorder(null));
>>>>>>> master

        jButtonPrint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonPrint.setText("In");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        jButtonThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonThoat.setText("Thoát");
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelControlLayout = new javax.swing.GroupLayout(jPanelControl);
        jPanelControl.setLayout(jPanelControlLayout);
        jPanelControlLayout.setHorizontalGroup(
            jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPrint)
                .addGap(18, 18, 18)
                .addComponent(jButtonThoat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelControlLayout.setVerticalGroup(
            jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelControlLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrint)
                    .addComponent(jButtonThoat))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        jPanelControl.setVisible(false);

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                pf.setOrientation(PageFormat.LANDSCAPE);
                if(pageNum>0){
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.86,0.86);
                jPanel1.paint(g2);
                //

                return Printable.PAGE_EXISTS;

            }

        });

        boolean ok = job.printDialog();
        if(ok){
            try{

                job.print();
            }
            catch (PrinterException ex){}
        }
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonThoatActionPerformed

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
            java.util.logging.Logger.getLogger(fPrintPhieuTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fPrintPhieuTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fPrintPhieuTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fPrintPhieuTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fPrintPhieuTra(1,1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel9;
=======
>>>>>>> master
    private javax.swing.JLabel jLabelDiaChi;
    private javax.swing.JLabel jLabelDiaDiem;
    private javax.swing.JLabel jLabelDonGia;
    private javax.swing.JLabel jLabelDvt;
    private javax.swing.JLabel jLabelKho;
    private javax.swing.JLabel jLabelMaLo;
    private javax.swing.JLabel jLabelSoLuong;
    private javax.swing.JLabel jLabelTenNhaCungCap;
    private javax.swing.JLabel jLabelTenNhanVien2;
    private javax.swing.JLabel jLabelTenSanPham;
    private javax.swing.JLabel jLabelThoiGian;
    private javax.swing.JLabel jLabelnumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelContentSub;
    private javax.swing.JPanel jPanelControl;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    // End of variables declaration//GEN-END:variables
}
