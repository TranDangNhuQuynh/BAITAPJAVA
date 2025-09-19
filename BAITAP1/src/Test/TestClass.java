package Test;

import java.util.Scanner;
import Class.PhanSo;

public class TestClass {

    public static void main(String[] args) {
        Scanner sc_116 = new Scanner(System.in);
        PhanSo ps1_116 = new PhanSo();
        PhanSo ps2_116 = new PhanSo();
        PhanSo psTong_116 = new PhanSo();

        // nhap phan so
        System.out.println("Nhap vao phan so thu nhat:");
        ps1_116.nhapPS(sc_116);
        System.out.println("Nhap vao phan so thu hai:");
        ps2_116.nhapPS(sc_116);

        // tinh tong 2 phan so
        psTong_116 = ps1_116.congPS(ps2_116);

        // hien thi phan so
        System.out.println("\nPhan so thu nhat la:");
        ps1_116.hienThiPS();
        System.out.println("\nPhan so thu hai la:");
        ps2_116.hienThiPS();
        System.out.println("\nPhan so tong la:");
        psTong_116.hienThiPS();

        sc_116.close();
    }
}
