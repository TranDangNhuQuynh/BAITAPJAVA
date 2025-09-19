package Testing;

import java.util.Scanner;
import Class.QuanLySach;

public class Test {

    public static void main(String[] args) {
        Scanner sc_116 = new Scanner(System.in);

        QuanLySach qls_116 = new QuanLySach();

        qls_116.nhapDanhSachTL(sc_116);

        System.out.print("\n\nNhap vao loai tai lieu can tim: ");
        String loai_116 = sc_116.nextLine();
        qls_116.timLoaiTL(loai_116);

        System.out.print("\n\nNhap vao ma tai lieu can tim1: ");
        String maTL_116 = sc_116.nextLine();
        qls_116.timMaTL(maTL_116);

        sc_116.close();
    }

}
