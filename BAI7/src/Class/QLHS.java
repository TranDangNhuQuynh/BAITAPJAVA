package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	// thuộc tính
	private ArrayList<HocSinh> dshs_116;

	// phương thức
	// hàm khởi tạo
	public QLHS() {
		dshs_116 = new ArrayList<HocSinh>(10);
	}

	// hàm thêm học sinh
	public void themHS(HocSinh hs_116) {
		dshs_116.add(hs_116);
	}

	// hàm nhập danh sách
	public void nhapDanhSachHS(Scanner sc_116) {
		HocSinh hs_116;

		System.out.print("Nhập vào số lượng học sinh: ");
		int n_116 = sc_116.nextInt();
		sc_116.nextLine(); // Bắt newline sau khi nhập số nguyên

		System.out.println("Nhập thông tin cho học sinh trong danh sách:");
		for (int i_116 = 0; i_116 < n_116; i_116++) {
			System.out.println("\tHọc sinh thứ " + (i_116 + 1) + " là:");

			hs_116 = new HocSinh();
			hs_116.nhapThongTin(sc_116);

			themHS(hs_116);
		}
	}

	// hàm hiển thị
	public void hienThiDanhSach() {
		int n_116 = dshs_116.size();
		for (int i_116 = 0; i_116 < n_116; i_116++) {
			System.out.println("\tHọc sinh thứ " + (i_116 + 1) + " là:");
			dshs_116.get(i_116).hienThiThongTin();
		}
	}

	// hàm tìm kiếm thông tin
	public void timKiemThongTin(int nam_116, String que_116) {
		for (HocSinh hs_116 : dshs_116) {
			if ((hs_116.getNgaySinh().getYear() + 1900 == nam_116) && (que_116.equals(hs_116.getQueQuan()))) {
				hs_116.hienThiThongTin();
			}
		}
	}

	public void timKiemThongTin(String lop_116) {
		for (HocSinh hs_116 : dshs_116) {
			if (lop_116.equals(hs_116.getLop())) {
				hs_116.hienThiThongTin();
			}
		}
	}
}