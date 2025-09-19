package BuildClass;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuộc tính
	private int chiSoMoi_116;
	private int chiSoCu_116;
	private double tien_116;

	// Phương thức
	// Hàm khởi tạo không đối số
	public BienLai() {

	}

	// Hàm khởi tạo có đối số
	public BienLai(int chiSoMoi_116, int chiSoCu_116, double tien_116) {
		this.chiSoMoi_116 = chiSoMoi_116;
		this.chiSoCu_116 = chiSoCu_116;
		this.tien_116 = tien_116;
	}

	public BienLai(String tenChuHo_116, int chiSoMoi_116, int chiSoCu_116, double tien_116) {
		this.tenChuHo_116 = tenChuHo_116;
		this.chiSoMoi_116 = chiSoMoi_116;
		this.chiSoCu_116 = chiSoCu_116;
		this.tien_116 = tien_116;
	}

	// Hàm nhập
	public void nhapThongTin(Scanner sc_116) {
		super.nhapThongTin(sc_116);
		System.out.print("\tNhập chỉ số mới: ");
		chiSoMoi_116 = sc_116.nextInt();
		sc_116.nextLine(); // Bắt newline sau khi nhập số nguyên
		System.out.print("\tNhập chỉ số cũ: ");
		chiSoCu_116 = sc_116.nextInt();
		sc_116.nextLine(); // Bắt newline sau khi nhập số nguyên
		tien_116 = (chiSoMoi_116 - chiSoCu_116) * 750;
	}

	// Hàm hiển thị
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChỉ số mới: " + chiSoMoi_116);
		System.out.println("\tChỉ số cũ: " + chiSoCu_116);
		System.out.println("\tTiền: : " + tien_116);
	}
}