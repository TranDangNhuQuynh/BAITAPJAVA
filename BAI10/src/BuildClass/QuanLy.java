package BuildClass;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// Thuộc tính
	private ArrayList<BienLai> ds_116;

	// Phương thức
	// Hàm khởi tạo
	public QuanLy() {
		ds_116 = new ArrayList<BienLai>(10);
	}

	// Hàm thêm biên lai vào danh sách
	public void themBienLai(BienLai bienLai_116) {
		ds_116.add(bienLai_116);
	}

	// Hàm nhập danh sách
	public void nhapDanhSach(Scanner sc_116) {
		BienLai bienLai_116;
		System.out.print("Nhập vào số lượng biên lai: ");
		int n_116 = sc_116.nextInt();
		sc_116.nextLine(); // Bắt newline sau khi nhập số nguyên
		System.out.println("Nhập vào danh sách biên lai:");
		for (int i_116 = 0; i_116 < n_116; i_116++) {
			System.out.println("Biên lai thứ " + (i_116 + 1) + " là:");
			bienLai_116 = new BienLai();
			bienLai_116.nhapThongTin(sc_116);

			themBienLai(bienLai_116);
		}
	}

	// Hàm hiển thị danh sách
	public void hienThiDanhSach() {
		for (int i_116 = 0; i_116 < ds_116.size(); i_116++) {
			System.out.println("Biên lai thứ " + (i_116 + 1) + " là:");
			ds_116.get(i_116).hienThiThongTin();
			System.out.println();
		}
	}
}