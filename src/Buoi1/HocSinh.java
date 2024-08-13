package Buoi1;

public class HocSinh {
    private String maso;
    private String hoTen;
    private double diemTrungBinh;

    public HocSinh() {
    }

    public HocSinh(String maso, String hoTen, double diemTrungBinh) {
        this.maso = maso;
        this.hoTen = hoTen;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String xepHangHocLuc() {
        if (diemTrungBinh < 3) {
            return "YẾU";
        } else if (diemTrungBinh < 5) {
            return "TRUNG BÌNH";
        } else if (diemTrungBinh < 8) {
            return "KHÁ";
        } else if (diemTrungBinh < 10) {
            return "GIỎI";
        } else {
            return "XUẤT SẮC";
        }
    }

    public void hienThiHocSinh() {
        System.out.println("----------------------------------------");
        System.out.println("Mã số: " + maso);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("Học lực: " + xepHangHocLuc());
        System.out.println();
    }
}
