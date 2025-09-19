package UseClass;

import java.util.Scanner;

import BuildClass.QuanLy;

public class Using {

	public static void main(String[] args_116) {
		Scanner sc_116 = new Scanner(System.in);

		QuanLy ql_116 = new QuanLy();
		ql_116.nhapDanhSach(sc_116);

		System.out.println("Danh sách biên lai của các hộ gia đình là:");
		ql_116.hienThiDanhSach();

		sc_116.close();
	}

}