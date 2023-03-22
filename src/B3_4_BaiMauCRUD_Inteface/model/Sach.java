/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_4_BaiMauCRUD_Inteface.model;

/**
 *
 * @author hangnt
 */
public class Sach {

    private String tenSach;
    private String tacGia;
    private String theLoai;
    private String namIn;
//
//    private boolean check;
//
//    public boolean isCheck() {
//        return check;
//    }
//
//    public void setCheck(boolean check) {
//        this.check = check;
//    }
    
    public Sach() {
    }

    public Sach(String tenSach, String tacGia, String theLoai, String namIn) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.namIn = namIn;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNamIn() {
        return namIn;
    }

    public void setNamIn(String namIn) {
        this.namIn = namIn;
    }

    private String getTrangThai() {
        int tuoiSach = 2022 - Integer.valueOf(namIn);
        if (tuoiSach < 20) {
            return "Sach moi ra";
        }
        return "Sach xuat ban lau roi";
    }

    public Object[] toDataRow() {
        return new Object[]{tenSach, tacGia, theLoai,
            namIn, getTrangThai()};
    }
}
