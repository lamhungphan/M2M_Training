package Buoi1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachHocSinh lop1A = new DanhSachHocSinh();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng học sinh");
        int soLuongHocSinh = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < soLuongHocSinh; i++) {
            HocSinh hs = new HocSinh();

            System.out.println("Thông tin sinh viên thứ: " + (i + 1));

            System.out.println("Nhập mã số: ");
            hs.setMaso(scanner.nextLine());

            System.out.println("Nhập họ tên: ");
            int loiNhapTen = 0;
            while (loiNhapTen < 3) {
                try {
                    hs.setHoTen(scanner.nextLine());
                    break;
                } catch (IllegalArgumentException e) {
                    loiNhapTen++;
                    System.out.println(e.getMessage() + " Số lần thử lại: " + loiNhapTen);
                }
            }
            if (loiNhapTen == 3) {
                System.out.println("Bạn đã nhập sai tên quá 3 lần. Dừng chương trình.");
                break;
            }

            System.out.println("Nhập điểm trung bình: ");
            int loiNhapDiem = 0;
            while (loiNhapDiem < 3) {
                try {
                    hs.setDiemTrungBinh(scanner.nextDouble());
                    scanner.nextLine();
                    break;
                } catch (IllegalArgumentException e) {
                    loiNhapDiem++;
                    System.out.println(e.getMessage() + " Số lần thử lại: " + loiNhapDiem);
                }
            }
            if (loiNhapDiem == 3) {
                System.out.println("Bạn đã nhập sai điểm quá 3 lần. Dừng chương trình.");
                break;
            }
            lop1A.themHocSinh(hs);
        }
        lop1A.hienThiDanhSachHocSinh();
    }
}
