package Buoi1;

public class HocSinh {
    private String maso;
    private String hoTen;
    private double diemTrungBinh;

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public void setHoTen(String hoTen) throws IllegalArgumentException {
        if (hoTen.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Tên không được chứa số");
        }
        this.hoTen = hoTen;
    }

    public void setDiemTrungBinh(double diemTrungBinh) throws IllegalArgumentException {
        if (diemTrungBinh > 10 || diemTrungBinh < 0) {
            throw new IllegalArgumentException("Điểm trong phạm vi từ 0 - 10");
        }
        this.diemTrungBinh = diemTrungBinh;
    }

    public HocSinh() {
    }

    public HocSinh(String maso, String hoTen, double diemTrungBinh) {
        this.maso = maso;
        this.hoTen = hoTen;
        this.diemTrungBinh = diemTrungBinh;
    }

    private String xepHangHocLuc() {
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

    public void hienThiThongTin() {
        System.out.println("----------------------------------------");
        System.out.println("Mã số: " + this.maso);
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Điểm trung bình: " + this.diemTrungBinh);
        System.out.println("Học lực: " + this.xepHangHocLuc());
        System.out.println();
    }
}
