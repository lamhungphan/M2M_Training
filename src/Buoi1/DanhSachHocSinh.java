package Buoi1;

import java.util.ArrayList;
import java.util.List;

public class DanhSachHocSinh {
    private List<HocSinh> dshs = new ArrayList<>();

    public DanhSachHocSinh() {
    }

    public void themHocSinh(HocSinh hocSinh) {
        dshs.add(hocSinh);
    }

    public void hienThiDanhSachHocSinh() {
        for (HocSinh hs : dshs) {
            hs.hienThiThongTin();
        }
    }
}


