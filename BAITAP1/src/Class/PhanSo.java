package Class;

import java.util.Scanner;

public class PhanSo {
	// thuộc tính
	private int tuSo_116;
	private int mauSo_116;

	// hàm khởi tạo không đối số
	public PhanSo() {
		tuSo_116 = 0;
		mauSo_116 = 1;
	}

	// hàm khởi tạo có đối số
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo_116 = tuSo;
		this.mauSo_116 = mauSo;
	}

	// hàm nhập phân số
	public void nhapPS(Scanner sc) {
		int a_116;
		int b_116;

		do {
			System.out.print("\tNhap vao tu so: ");
			a_116 = sc.nextInt();

			System.out.print("\tNhap vao mau so: ");
			b_116 = sc.nextInt();

			// kiểm tra
			if (b_116 == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tuSo_116 = a_116;
				mauSo_116 = b_116;
			}
		} while (b_116 == 0);
	}

	// hàm hiển thị
	public void hienThiPS() {
		if (tuSo_116 * mauSo_116 < 0) {
			System.out.println("\t-" + Math.abs(tuSo_116) + "/" + Math.abs(mauSo_116));
		} else {
			System.out.println("\t" + Math.abs(tuSo_116) + "/" + Math.abs(mauSo_116));
		}
	}

	// hàm cộng
	public PhanSo congPS(PhanSo ps2) {
		int a_116 = tuSo_116 * ps2.mauSo_116 + ps2.tuSo_116 * mauSo_116;
		int b_116 = mauSo_116 * ps2.mauSo_116;

		return new PhanSo(a_116, b_116);
	}

	// hàm trừ
	public PhanSo truPS(PhanSo ps2) {
		int a_116 = tuSo_116 * ps2.mauSo_116 - ps2.tuSo_116 * mauSo_116;
		int b_116 = mauSo_116 * ps2.mauSo_116;

		return new PhanSo(a_116, b_116);
	}

	// hàm nhân
	public PhanSo nhanPS(PhanSo ps2) {
		int a_116 = tuSo_116 * ps2.tuSo_116;
		int b_116 = mauSo_116 * ps2.mauSo_116;

		return new PhanSo(a_116, b_116);
	}

	// hàm chia
	public PhanSo chiaPS(PhanSo ps2) {
		int a_116 = tuSo_116 * ps2.mauSo_116;
		int b_116 = mauSo_116 * ps2.tuSo_116;

		return new PhanSo(a_116, b_116);
	}

	// hàm tìm USCLN
	private int timUSCLN(int a_116, int b_116) {
		int r_116 = a_116 % b_116;

		while (r_116 != 0) {
			a_116 = b_116;
			b_116 = r_116;
			r_116 = a_116 % b_116;
		}

		return b_116;
	}

	// hàm kiểm tra phân số tối giản hay chưa
	public boolean kiemTraToiGian() {
		if (timUSCLN(tuSo_116, mauSo_116) == 1) {
			return true;
		}
		return false;
	}

	// hàm tối giản
	public void toiGianPS() {
		int x_116 = timUSCLN(tuSo_116, mauSo_116);

		tuSo_116 /= x_116;
		mauSo_116 /= x_116;
	}
}
