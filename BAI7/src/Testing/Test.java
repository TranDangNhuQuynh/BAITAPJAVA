package Testing;

import java.util.Scanner;
import Class.QLHS;

public class Test {

	public static void main(String[] args_116) {
		Scanner sc_116 = new Scanner(System.in);
		
		QLHS list_116 = new QLHS();
		
		list_116.nhapDanhSachHS(sc_116);
		
		System.out.println("Những học sinh sinh năm 1985 và quê Thái Nguyên là:");
		list_116.timKiemThongTin(1985, "Thái Nguyên");
		
		System.out.println("\nNhững học sinh học lớp 10A1 là:");
		list_116.timKiemThongTin("10A1");
		
		sc_116.close();
	}
}