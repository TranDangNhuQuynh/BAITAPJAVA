package Testing;

import java.util.Scanner;
import Class.KhuPho;

public class Test {
    public static void main(String[] args) {
        Scanner sc_116 = new Scanner(System.in);
        KhuPho qlkp_116 = new KhuPho();
        
        // Nhập danh sách hộ dân
        qlkp_116.nhapDanhSach(sc_116);

        // Hiển thị người >= 80 tuổi
        System.out.println("\nDanh sach ho dan co nguoi 80 tuoi tro len:");
        qlkp_116.timKiemThongTin();

        sc_116.close();
    }
}
