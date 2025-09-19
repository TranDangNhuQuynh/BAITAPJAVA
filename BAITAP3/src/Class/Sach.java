package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia_116;
	private int soTrang_116;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {

	}

	// ham khoi tao co doi so
	public Sach(String maTaiLieu_116, String tenNXB_116, int soBanPhatHanh_116, String tacGia_116, int soTrang_116) {
		super(maTaiLieu_116, tenNXB_116, soBanPhatHanh_116);
		this.tacGia_116 = tacGia_116;
		this.soTrang_116 = soTrang_116;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_116) {
		super.nhapThongTin(sc_116);
		System.out.print("\tNhap tac gia: ");
		tacGia_116 = sc_116.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang_116 = sc_116.nextInt();
		sc_116.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTac gia: " + tacGia_116);
		System.out.println("\tSo trang: " + soTrang_116);
	}
}
