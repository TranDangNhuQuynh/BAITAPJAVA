package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	// thuộc tính
	private ArrayList<KhachTro> ds_116;

	// phương thức
	// hàm khởi tạo
	public KhachSan() {
		ds_116 = new ArrayList<KhachTro>();
	}

	// hàm thêm khách trọ vào khách sạn
	public void themKhachTro(KhachTro kt_116) {
		ds_116.add(kt_116);
	}

	// hàm nhập danh sách
	public void nhapDanhSach(Scanner sc_116) {
		KhachTro khach_116;

		System.out.print("Nhập vào số lượng khách: ");
		int n_116 = sc_116.nextInt();
		sc_116.nextLine(); // Bắt newline sau khi nhập số

		System.out.println("Nhập vào thông tin khách trọ:");
		for (int i_116 = 0; i_116 < n_116; i_116++) {
			System.out.println("Khách trọ thứ " + (i_116 + 1) + " là:");
			khach_116 = new KhachTro();
			khach_116.nhapThongTin(sc_116);
			themKhachTro(khach_116);
		}
	}

	// hàm hiển thị
	public void hienThiDanhSach() {
		System.out.println("=== THÔNG TIN KHÁCH TRỌ ===");
		for (KhachTro khach_116 : ds_116) {
			khach_116.hienThiThongTin();
			System.out.println("---------------------------");
		}
	}

	// hàm tính tiền
	public double tinhTien(String CMND_116) {
		double tien_116 = 0;

		for (KhachTro khach_116 : ds_116) {
			if (khach_116.getCMND().equals(CMND_116)) {
				tien_116 = khach_116.getSoNgayTro() * khach_116.getGiaPhong();
				// Dừng vòng lặp sau khi tìm thấy và tính tiền
				break; 
			}
		}

		return tien_116;
	}
}