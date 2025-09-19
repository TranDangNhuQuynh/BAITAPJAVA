package Testing;

import java.util.Scanner;
import Class.KhachSan;

public class Test {
	public static void main(String[] args_116) {
		Scanner sc_116 = new Scanner(System.in);

		KhachSan ql_116 = new KhachSan();

		// Nhập danh sách khách trọ
		ql_116.nhapDanhSach(sc_116);

		// Thêm một dòng trống để dễ đọc hơn
		System.out.println(); 

		System.out.print("Nhập vào CMND của khách trọ cần tính tiền: ");
		// Lỗi đã được sửa ở đây: đọc CMND dưới dạng chuỗi (String)
		String cmnd_116 = sc_116.nextLine();

		double tongTien_116 = ql_116.tinhTien(cmnd_116);
		
		System.out.println("==> Tổng tiền là: " + tongTien_116);

		sc_116.close();
	}
}