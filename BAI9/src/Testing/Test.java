package Testing;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

	public static void main(String[] args_116) {
		Scanner sc_116 = new Scanner(System.in);

		QuanLy ql_116 = new QuanLy();

		ql_116.nhapDanhSach(sc_116);

		System.out.println("Danh sách sinh viên trả sách vào cuối tháng:");
		ql_116.hienThiDanhSachTraCuoiThang();

		sc_116.close();
	}
}