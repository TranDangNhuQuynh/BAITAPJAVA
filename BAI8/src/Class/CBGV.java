package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuộc tính
	private double luongCung_116;
	private double thuong_116;
	private double phat_116;
	private double luongThucLinh_116;

	// phương thức
	// hàm khởi tạo không đối số
	public CBGV() {

	}

	// hàm nhập
	public void nhapThongTin(Scanner sc_116) {
		super.nhapThongTin(sc_116);

		System.out.print("\tNhập lương cứng: ");
		luongCung_116 = sc_116.nextDouble();
		sc_116.nextLine(); // Bắt newline sau khi nhập số

		System.out.print("\tNhập thưởng: ");
		thuong_116 = sc_116.nextDouble();
		sc_116.nextLine(); // Bắt newline sau khi nhập số

		System.out.print("\tNhập phạt: ");
		phat_116 = sc_116.nextDouble();
		sc_116.nextLine(); // Bắt newline sau khi nhập số

		// tính lương
		luongThucLinh_116 = luongCung_116 + thuong_116 - phat_116;
	}

	// hàm hiển thị thông tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLương cứng: " + luongCung_116);
		System.out.println("\tThưởng: " + thuong_116);
		System.out.println("\tPhạt: " + phat_116);
		System.out.println("\tLương thực lĩnh: " + luongThucLinh_116);
	}

	// hàm lấy ra thông tin về lương thực lĩnh
	public double getLuongThucLinh() {
		return luongThucLinh_116;
	}
}