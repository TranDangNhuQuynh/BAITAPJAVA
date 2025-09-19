package Testing;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

	public static void main(String[] args_116) {
		Scanner sc_116 = new Scanner(System.in);

		QuanLy ql_116 = new QuanLy();

		ql_116.nhapDanhSach(sc_116);

		System.out.println("\nDanh sách những cán bộ có lương >= 8 triệu là:");
		ql_116.timKiem(8000000);

		sc_116.close();
	}

}