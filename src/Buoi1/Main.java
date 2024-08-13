package Buoi1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachHocSinh lop1A = new DanhSachHocSinh();
        Scanner scanner = new Scanner(System.in);
        String maSo;
        String hoTen;
        double diemTrungBinh;

        System.out.println("Nhập số lượng học sinh");
        int soLuongHocSinh = scanner.nextInt(); scanner.nextLine();
        for (int i = 0; i < soLuongHocSinh; i++) {
            System.out.println("Thông tin sinh viên thứ: " + (i + 1));
            System.out.println("Nhập mã số: ");
            maSo = scanner.nextLine();

            System.out.println("Nhập họ tên: ");
            do {
                hoTen = scanner.nextLine();
                if (hoTen.matches(".*\\d.*")) {
                    System.out.println("Tên không được chứa số");
                }
            } while (hoTen.matches(".*\\d.*"));

            System.out.println("Nhập điểm trung bình: ");
            do {
                diemTrungBinh = scanner.nextDouble(); scanner.nextLine();
                if (diemTrungBinh > 10 || diemTrungBinh < 0) {
                    System.out.println("Mời nhập lại (0-10)");
                }
            } while (diemTrungBinh > 10 || diemTrungBinh < 0);

            HocSinh hs = new HocSinh(maSo, hoTen, diemTrungBinh);
            lop1A.themHocSinh(hs);
        }
        lop1A.hienThiDanhSachHocSinh();
    }
}
