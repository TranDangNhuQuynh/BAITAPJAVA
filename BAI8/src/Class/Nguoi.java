package Class;

import java.util.Scanner;

public class Nguoi {
	// thuộc tính
	protected String hoTen_116;
	protected String ngaySinh_116;
	protected String queQuan_116;

	// phương thức
	// hàm khởi tạo không đối số
	public Nguoi() {

	}

	// hàm khởi tạo có đối số
	public Nguoi(String hoTen_116, String ngaySinh_116, String queQuan_116) {
		this.hoTen_116 = hoTen_116;
		this.ngaySinh_116 = ngaySinh_116;
		this.queQuan_116 = queQuan_116;
	}

	// hàm nhập thông tin
	public void nhapThongTin(Scanner sc_116) {
		System.out.print("\tNhập họ tên: ");
		hoTen_116 = sc_116.nextLine();
		System.out.print("\tNhập ngày sinh: ");
		ngaySinh_116 = sc_116.nextLine();
		System.out.print("\tNhập quê quán: ");
		queQuan_116 = sc_116.nextLine();
	}

	// hàm hiển thị
	public void hienThiThongTin() {
		System.out.println("\tHọ tên: " + hoTen_116);
		System.out.println("\tNgày sinh: " + ngaySinh_116);
		System.out.println("\tQuê quán: " + queQuan_116);
	}
}