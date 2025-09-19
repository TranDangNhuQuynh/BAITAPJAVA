package Class;

import java.util.Scanner;

public class ThiSinh {
    // thuoc tinh
    private int soBD_116;
    private String hoTen_116;
    private String diaChi_116;
    private String dienUuTien_116;

    // phuong thuc
    // ham khoi tao khong doi so
    public ThiSinh() {

    }

    // ham khoi tao co doi so
    public ThiSinh(int soBD_116, String hoTen_116, String diaChi_116, String dienUuTien_116) {
        this.soBD_116 = soBD_116;
        this.hoTen_116 = hoTen_116;
        this.diaChi_116 = diaChi_116;
        this.dienUuTien_116 = dienUuTien_116;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc_116) {
        System.out.print("\tNhap so bao danh: ");
        soBD_116 = sc_116.nextInt();
        sc_116.nextLine();
        System.out.print("\tNhap ho ten: ");
        hoTen_116 = sc_116.nextLine();
        System.out.print("\tNhap dia chi: ");
        diaChi_116 = sc_116.nextLine();
        System.out.print("\tNhap dien uu tien: ");
        dienUuTien_116 = sc_116.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        System.out.println("\tSo bao danh: " + soBD_116);
        System.out.println("\tHo ten: " + hoTen_116);
        System.out.println("\tDia chi: " + diaChi_116);
        System.out.println("\tDien uu tien: " + dienUuTien_116);
    }

    // ham lay ra thong tin ve so bao danh
    public int getSoBD_116() {
        return soBD_116;
    }
}
