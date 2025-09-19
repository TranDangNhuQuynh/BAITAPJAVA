package Testing;

import java.util.Scanner;
import Class.TuyenSinh;

public class Test {

    public static void main(String[] args) {
        Scanner sc_116 = new Scanner(System.in);

        TuyenSinh dsTuyenSinh_116 = new TuyenSinh();

        System.out.println("Nhap vao danh sach thi sinh: ");
        dsTuyenSinh_116.nhapDanhSach(sc_116);

        System.out.println("Danh sach thi sinh du thi la:");
        dsTuyenSinh_116.hienThiDanhSach();

        System.out.print("Nhap so bao danh can tim: ");
        int soBaoDanh_116 = sc_116.nextInt();
        sc_116.nextLine();

        dsTuyenSinh_116.timKiemThiSinh(soBaoDanh_116);

        sc_116.close();
    }

}
