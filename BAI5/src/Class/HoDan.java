package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
    private ArrayList<Nguoi> danhSachNguoi_116 = new ArrayList<>();

    public void nhapThongTin(Scanner sc_116) {
        System.out.print("Nhap so nguoi trong ho dan: ");
        int n = sc_116.nextInt();
        sc_116.nextLine(); // đọc bỏ ký tự Enter còn dư
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nguoi thu " + (i+1) + ":");
            Nguoi nguoi = new Nguoi();
            nguoi.nhapThongTin(sc_116);
            danhSachNguoi_116.add(nguoi);
        }
    }

    public void hienThiNguoi80TuoiTroLen() {
        for (Nguoi nguoi : danhSachNguoi_116) {
            if (nguoi.tinhTuoi() >= 80) {
                nguoi.hienThiThongTin();
            }
        }
    }
}
