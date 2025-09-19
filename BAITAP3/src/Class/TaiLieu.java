package Class;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu_116;
	private String tenNXB_116;
	private int soBanPhatHanh_116;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu_116, String tenNXB_116, int soBanPhatHanh_116) {
		this.maTaiLieu_116 = maTaiLieu_116;
		this.tenNXB_116 = tenNXB_116;
		this.soBanPhatHanh_116 = soBanPhatHanh_116;
	}

	// nhap
	public void nhapThongTin(Scanner sc_116) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu_116 = sc_116.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB_116 = sc_116.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh_116 = sc_116.nextInt();
		sc_116.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu_116);
		System.out.println("\tTen nha xuat ban: " + tenNXB_116);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh_116);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu_116() {
		return maTaiLieu_116;
	}
}
