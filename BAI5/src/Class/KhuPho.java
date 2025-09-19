package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> danhSachHoDan_116 = new ArrayList<>();

    public void nhapDanhSach(Scanner sc_116) {
        System.out.print("Nhap so ho dan: ");
        int n = sc_116.nextInt();
        sc_116.nextLine(); // đọc bỏ Enter
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin ho dan thu " + (i+1) + ":");
            HoDan hd = new HoDan();
            hd.nhapThongTin(sc_116);
            danhSachHoDan_116.add(hd);
        }
    }

    public void timKiemThongTin() {
        for (HoDan hd : danhSachHoDan_116) {
            hd.hienThiNguoi80TuoiTroLen();
        }
    }
}
