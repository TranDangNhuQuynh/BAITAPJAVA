package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
    // thuoc tinh
    private String mon1_116;
    private String mon2_116;
    private String mon3_116;

    // phuong thuc
    // ham khoi tao khong doi so
    public KhoiA() {

    }

    // ham khoi tao co doi so
    public KhoiA(String mon1_116, String mon2_116, String mon3_116) {
        this.mon1_116 = mon1_116;
        this.mon2_116 = mon2_116;
        this.mon3_116 = mon3_116;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc_116) {
        super.nhapThongTin(sc_116);
        System.out.print("\tNhap mon 1: ");
        mon1_116 = sc_116.nextLine();
        System.out.print("\tNhap mon 2: ");
        mon2_116 = sc_116.nextLine();
        System.out.print("\tNhap mon 3: ");
        mon3_116 = sc_116.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTo hop mon thi: " + mon1_116 + " - " + mon2_116 + " - " + mon3_116);
    }
}
