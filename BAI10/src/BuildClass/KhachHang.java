package BuildClass;

import java.util.Scanner;

public class KhachHang {
	// Thuộc tính
	protected String tenChuHo_116;
	protected int soNha_116;
	protected String maCongTo_116;

	// Phương thức
	// Hàm khởi tạo không đối số
	public KhachHang() {

	}

	// Hàm khởi tạo có đối số
	public KhachHang(String tenChuHo_116, int soNha_116, String maCongTo_116) {
		this.tenChuHo_116 = tenChuHo_116;
		this.soNha_116 = soNha_116;
		this.maCongTo_116 = maCongTo_116;
	}

	// Hàm nhập
	public void nhapThongTin(Scanner sc_116) {
		System.out.print("\tNhập tên chủ hộ: ");
		tenChuHo_116 = sc_116.nextLine();
		System.out.print("\tNhập số nhà: ");
		soNha_116 = sc_116.nextInt();
		sc_116.nextLine(); // Bắt newline sau khi nhập số nguyên
		System.out.print("\tNhập mã công tơ: ");
		maCongTo_116 = sc_116.nextLine();
	}

	// Hàm hiển thị
	public void hienThiThongTin() {
		System.out.println("\tTên chủ hộ: " + tenChuHo_116);
		System.out.println("\tSố nhà: " + soNha_116);
		System.out.println("\tMã công tơ: " + maCongTo_116);
	}
}