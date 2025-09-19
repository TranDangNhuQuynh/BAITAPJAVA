package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuộc tính
	private ArrayList<TheMuon> ds_116;

	// phương thức
	// hàm khởi tạo không đối số
	public QuanLy() {
		ds_116 = new ArrayList<TheMuon>(10);
	}

	// hàm thêm thẻ mượn vào danh sách
	public void themTheMuon(TheMuon theMuon_116) {
		ds_116.add(theMuon_116);
	}

	// hàm nhập vào danh sách
	public void nhapDanhSach(Scanner sc_116) {
		TheMuon theMuon_116;

		System.out.print("Nhập vào số lượng thẻ mượn: ");
		int n_116 = sc_116.nextInt();
		sc_116.nextLine(); // Bắt newline sau khi nhập số nguyên

		System.out.println("Nhập vào danh sách:");
		for (int i_116 = 0; i_116 < n_116; i_116++) {
			System.out.println("Thẻ mượn thứ " + (i_116 + 1) + " là:");
			theMuon_116 = new TheMuon();
			theMuon_116.nhapThongTin(sc_116);
			themTheMuon(theMuon_116);
		}
	}

	// hàm hiển thị danh sách trả cuối tháng
	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon the_116 : ds_116) {
			if (the_116.getHanTra().getDate() == 31 || the_116.getHanTra().getDate() == 30) {
				the_116.hienThiThongTin();
			}
		}
	}
}