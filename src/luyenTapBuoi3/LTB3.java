package luyenTapBuoi3;

import java.awt.*;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class LTB3 extends javax.swing.JFrame {

    private DongVatService dvs;

    public LTB3() {
        initComponents();
        dvs = new DongVatService();
        DongVat dv1 = new DongVat("DV1", "Sói", 50, true, 2005, "Sinh lâu rồi");
        DongVat dv2 = new DongVat("DV2", "Cáo", 20, false, 2000, "Mới sinh");
        DongVat dv3 = new DongVat("DV3", "Báo", 30, true, 2015, "Sinh lâu rồi");
        DongVat dv4 = new DongVat("DV4", "Báo", 10, false, 2015, "Sinh lâu rồi1");
        DongVat dv5 = new DongVat("DV5", "Báo", 35, true, 2015, "Sinh lâu rồi");
        this.dvs.add(dv1);
        this.dvs.add(dv2);
        this.dvs.add(dv3);
        this.dvs.add(dv4);
        this.dvs.add(dv5);
        loadTable(dvs.getDs());
    }

    public void loadTable(ArrayList<DongVat> list) {
        DefaultTableModel dtm = (DefaultTableModel) tblDongVat.getModel();
        dtm.setRowCount(0);
        if (list.isEmpty()) {
            return;
        }
        for (DongVat dv : list) {
            dtm.addRow(new Object[]{
                dv.getMaDV(),
                dv.getTenDongVat(),
                dv.getCanNang(),
                dv.isGioiTinh() == true ? "Đực" : "Cái",
                dv.getNamSinh(),
                dv.getTrangThai()
            });
        }
    }

    public DongVat getData() {
        String maDV = this.txtID.getText();
        String tenDV = this.txtName.getText();
        String can = this.txtCan.getText();
        if (maDV.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã động vật");
            return null;
        }
        if (tenDV.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên động vật");
            return null;
        }
        if (can.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập cân nặng");
            return null;
        }
        int canNang = 0;
        try {
            canNang = Integer.parseInt(can);
            if (canNang <= 0) {
                JOptionPane.showMessageDialog(this, "Cân nặng phải lớn hơn 0");
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cân nặng phải là số");
            return null;
        }

        boolean gioiTinh = false;
        if (this.rdbDuc.isSelected()) {
            gioiTinh = true;
        } else if (this.rdbCai.isSelected()) {
            gioiTinh = false;
        }
        String namsinh = this.cbbNamSinh.getSelectedItem().toString();
        String trangThai = namsinh;
        int nS = 0;
        try {
            nS = Integer.parseInt(namsinh);
        } catch (Exception e) {
        }

        int tT;
        try {
            tT = Integer.parseInt(trangThai);
        } catch (Exception e) {
        }
        tT = Integer.parseInt(trangThai);
        if (tT >= 2005) {
            trangThai = "Sinh lâu rồi";
        } else {
            trangThai = "Mới sinh";
        }

        DongVat dv = new DongVat(maDV, tenDV, canNang, gioiTinh, nS, trangThai);
        return dv;
    }

    public void Clear() {
        this.txtSBName.setText("");
        this.txtMin.setText("");
        this.txtMax.setText("");
        this.txtID.setText("");
        this.txtName.setText("");
        this.txtCan.setText("");
        this.rdbDuc.setSelected(true);
        this.cbbNamSinh.setSelectedIndex(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSBName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSBName = new javax.swing.JButton();
        txtMin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtCan = new javax.swing.JTextField();
        rdbDuc = new javax.swing.JRadioButton();
        rdbCai = new javax.swing.JRadioButton();
        cbbNamSinh = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDongVat = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        jLabel1.setText("Search theo tên");

        jLabel2.setText("Tên");

        btnSBName.setText("Search By Name");
        btnSBName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSBNameMouseClicked(evt);
            }
        });

        jLabel3.setText("Cân nặng Min");

        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        jLabel4.setText("Search theo khoảng cân nặng");

        jLabel5.setText("Cân nặng Max");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Mã DV");

        jLabel8.setText("Tên DV");

        jLabel9.setText("Cân nặng");

        jLabel10.setText("Năm sinh");

        jLabel11.setText("Giới tính");

        buttonGroup1.add(rdbDuc);
        rdbDuc.setText("Đực");

        buttonGroup1.add(rdbCai);
        rdbCai.setText("Cái");

        cbbNamSinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2005", "2010", "2015", "2020" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbDuc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(rdbCai, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCan, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rdbDuc)
                    .addComponent(rdbCai))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbbNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLabel6.setText("Information");

        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnTop.setText("Top 5");
        btnTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTopMouseClicked(evt);
            }
        });

        btnSort.setText("Sort");
        btnSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSortMouseClicked(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        jLabel12.setText("List");

        tblDongVat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã DV", "Tên DV", "Cân nặng", "Giới tính", "Năm sinh", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDongVat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDongVatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDongVat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(65, 65, 65)
                                .addComponent(btnTop)
                                .addGap(117, 117, 117)
                                .addComponent(btnSort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClear)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(100, 100, 100)
                                                .addComponent(txtSBName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(443, 443, 443)
                                                    .addComponent(btnSearch))
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                    .addGap(55, 55, 55)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtMin)
                                                        .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 29, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSBName)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSBName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btnSBName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnTop)
                    .addComponent(btnSort)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        DongVat dv = this.getData();
        if (dv == null) {
            return;
        }
        dvs.add(dv);
        loadTable(dvs.getDs());
        Clear();
        JOptionPane.showMessageDialog(this, "Thêm thành công");
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        Clear();
        dvs.getDs();
        loadTable(dvs.getDs());
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnSBNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSBNameMouseClicked
        // TODO add your handling code here:       
        if (txtSBName.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn cần nhập tên DV để tìm kiếm");
            return;
        }
        ArrayList<DongVat> dv = dvs.SBName(txtSBName.getText().trim());
        if (dv == null) {
            return;
        }
        loadTable(dv);

    }//GEN-LAST:event_btnSBNameMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
        if (txtMin.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn cần nhập Cân nặng min");
            return;
        }
        if (txtMax.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn cần nhập Cân nặng max");
            return;
        }
        int min = 0;
        int max = 0;
        try {
            min = Integer.parseInt(txtMin.getText());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "min phải là số nguyên");
            return;
        }
        try {
            max = Integer.parseInt(txtMax.getText());
            
        } catch (Exception e) {
              JOptionPane.showMessageDialog(this, "max phải là số nguyên");
            return;
        } 
        if(min>max){
            JOptionPane.showMessageDialog(this,"Min phải nhỏ hơn max");
            return;
        }
        
        ArrayList<DongVat> dv = dvs.SBCan(min, max);
        if (dv == null) {
            return;
        }
        loadTable(dv);
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortMouseClicked
        // TODO add your handling code here:
        this.dvs.sort();
        loadTable(this.dvs.getDs());
    }//GEN-LAST:event_btnSortMouseClicked

    private void tblDongVatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDongVatMouseClicked
        int index = tblDongVat.getSelectedRow();
        DongVat dongVat = dvs.getDs().get(index);
        new DetailDongVat(dongVat).setVisible(true);
//  this.setVisible(false);
    }//GEN-LAST:event_tblDongVatMouseClicked

    private void btnTopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTopMouseClicked
        // TODO add your handling code here:
        loadTable(this.dvs.top5());
    }//GEN-LAST:event_btnTopMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

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
            java.util.logging.Logger.getLogger(LTB3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LTB3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LTB3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LTB3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LTB3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSBName;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnTop;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbNamSinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbCai;
    private javax.swing.JRadioButton rdbDuc;
    private javax.swing.JTable tblDongVat;
    private javax.swing.JTextField txtCan;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSBName;
    // End of variables declaration//GEN-END:variables
}
