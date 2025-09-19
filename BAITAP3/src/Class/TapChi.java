package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh_116;
	private int thangPhatHanh_116;

	// phuong thuc
	// ham khoi tao khong doi so
	public TapChi() {

	}

	// ham khoi tao co doi so
	public TapChi(String maTaiLieu_116, String tenNXB_116, int soBanPhatHanh_116, int soPhatHanh_116, int thangPhatHanh_116) {
		super(maTaiLieu_116, tenNXB_116, soBanPhatHanh_116);
		this.soPhatHanh_116 = soPhatHanh_116;
		this.thangPhatHanh_116 = thangPhatHanh_116;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_116) {
		super.nhapThongTin(sc_116);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh_116 = sc_116.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh_116 = sc_116.nextInt();
		sc_116.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh_116);
		System.out.println("\tThang phat hanh: " + thangPhatHanh_116);
	}
}
