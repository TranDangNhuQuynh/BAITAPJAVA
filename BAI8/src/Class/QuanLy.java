package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuộc tính
	private ArrayList<CBGV> ds_116;

	// phương thức
	// hàm khởi tạo
	public QuanLy() {
		ds_116 = new ArrayList<CBGV>(10);
	}

	// hàm thêm cán bộ vào danh sách
	public void themCBGV(CBGV canBo_116) {
		ds_116.add(canBo_116);
	}

	// hàm nhập vào danh sách
	public void nhapDanhSach(Scanner sc_116) {
		CBGV canBo_116;

		System.out.print("Nhập vào số lượng cán bộ: ");
		int n_116 = sc_116.nextInt();
		sc_116.nextLine(); // Bắt newline sau khi nhập số nguyên

		System.out.println("Nhập vào danh sách:");
		for (int i_116 = 0; i_116 < n_116; i_116++) {
			System.out.println("Cán bộ thứ " + (i_116 + 1) + " là:");
			canBo_116 = new CBGV();
			canBo_116.nhapThongTin(sc_116);
			themCBGV(canBo_116);
		}
	}

	// hàm hiển thị danh sách
	public void hienThiDanhSach() {
		for (CBGV cb_116 : ds_116) {
			cb_116.hienThiThongTin();
		}
	}

	// hàm tìm kiếm
	public void timKiem(double luong_116) {
		for (CBGV cb_116 : ds_116) {
			if (cb_116.getLuongThucLinh() >= luong_116) {
				cb_116.hienThiThongTin();
			}
		}
	}
}