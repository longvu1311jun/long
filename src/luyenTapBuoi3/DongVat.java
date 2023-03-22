package luyenTapBuoi3;

/**
 *
 * @author DELL
 */
public class DongVat {
 private String maDV;
 private String tenDongVat;
 private int canNang;
 private boolean gioiTinh;
 private int namSinh;
 private String trangThai;

    public DongVat() {
    }

    public DongVat(String maDV, String tenDongVat, int canNang, boolean gioiTinh, int namSinh, String trangThai) {
        this.maDV = maDV;
        this.tenDongVat = tenDongVat;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.trangThai = trangThai;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int canNang) {
        this.trangThai = String.valueOf(this.canNang);
    }


}
