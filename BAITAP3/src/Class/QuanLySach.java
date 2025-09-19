package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	// thuoc tinh
	private ArrayList<TaiLieu> dstl_116;

	// phuong thuc
	// ham khoi tao
	public QuanLySach() {
		dstl_116 = new ArrayList<TaiLieu>(10);
	}

	// them moi 1 tai lieu
	public void themTaiLieu(TaiLieu tl_116) {
		dstl_116.add(tl_116);
	}

	// nhap danh sach tai lieu
	public void nhapDanhSachTL(Scanner sc_116) {
		int chon_116;
		String stop_116;
		TaiLieu tl_116;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon_116 = sc_116.nextInt();
			sc_116.nextLine();

			switch (chon_116) {
			case 1:
				tl_116 = new Sach();
				break;
			case 2:
				tl_116 = new TapChi();
				break;
			case 3:
				tl_116 = new Bao();
				break;
			default:
				tl_116 = new Sach();
				break;
			}

			tl_116.nhapThongTin(sc_116);
			themTaiLieu(tl_116);

			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop_116 = sc_116.nextLine();
		} while (stop_116.equals("c"));
	}

	// tim kiem theo ma tai lieu
	public void timMaTL(String maTL_116) {
	    for (TaiLieu tl_116 : dstl_116) {
	        if (tl_116.getMaTaiLieu_116().equals(maTL_116)) {
	            tl_116.hienThiThongTin();
	        }
	    }
	}

	// tim kiem theo loai tai lieu
	public void timLoaiTL(String loai_116) {
		for (TaiLieu tl_116 : dstl_116) {
			if (loai_116.equals("Sach") && (tl_116 instanceof Sach)) {
				tl_116.hienThiThongTin();
			} else if (loai_116.equals("TapChi") && (tl_116 instanceof TapChi)) {
				tl_116.hienThiThongTin();
			} else if (loai_116.equals("Bao") && (tl_116 instanceof Bao)) {
				tl_116.hienThiThongTin();
			}
		}
	}
}
