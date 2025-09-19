package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
	// thuoc tinh
	private String ngayPhatHanh_116;

	// phuong thuc
	// ham khoi tao khong doi so
	public Bao() {

	}

	// ham khoi tao co doi so
	public Bao(String maTaiLieu_116, String tenNXB_116, int soBanPhatHanh_116, String ngayPhatHanh_116) {
		super(maTaiLieu_116, tenNXB_116, soBanPhatHanh_116);
		this.ngayPhatHanh_116 = ngayPhatHanh_116;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_116) {
		super.nhapThongTin(sc_116);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh_116 = sc_116.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh_116);
	}
}
