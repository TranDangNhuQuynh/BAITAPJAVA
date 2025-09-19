package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuộc tính
	private String lop_116;
	private String khoHoc_116;
	private String kyHoc_116;

	// phương thức
	// hàm khởi tạo không đối số
	public HocSinh() {

	}

	// hàm khởi tạo có đối số
	public HocSinh(String hoTen_116, String lop_116, String khoaHoc_116, String kyHoc_116) {
		this.hoTen_116 = hoTen_116;
		this.lop_116 = lop_116;
		this.khoHoc_116 = khoaHoc_116;
		this.kyHoc_116 = kyHoc_116;
	}

	// hàm nhập
	public void nhapThongTin(Scanner sc_116) {
		super.nhapThongTin(sc_116);

		System.out.print("\tNhập lớp: ");
		lop_116 = sc_116.nextLine();

		System.out.print("\tNhập khóa học: ");
		khoHoc_116 = sc_116.nextLine();

		System.out.print("\tNhập kỳ học: ");
		kyHoc_116 = sc_116.nextLine();
	}

	// hàm hiển thị
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLớp: " + lop_116);
		System.out.println("\tKhóa học: " + khoHoc_116);
		System.out.println("\tKỳ học: " + kyHoc_116);
	}

	// hàm lấy ra thông tin về lớp
	public String getLop() {
		return lop_116;
	}
}