package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// Thuộc tính
	protected String hoTen_116;
	protected Date ngaySinh_116;
	protected String CMND;

	// Phương thức
	// Hàm khởi tạo không đối số
	public Nguoi() {
	}

	// Hàm khởi tạo có đối số 1
	public Nguoi(String hoTen_116, Date ngaySinh_116, String CMND) {
		this.hoTen_116 = hoTen_116;
		this.ngaySinh_116 = ngaySinh_116;
		this.CMND = CMND;
	}

	// Hàm khởi tạo có đối số 2 (Đã thêm)
	public Nguoi(String hoTen_116, String CMND) {
		this.hoTen_116 = hoTen_116;
		this.CMND = CMND;
		this.ngaySinh_116 = null; // Khởi tạo ngày sinh là null
	}

	// Hàm nhập
	public void nhapThongTin(Scanner sc_116) {
		System.out.print("\tNhập họ tên: ");
		hoTen_116 = sc_116.nextLine();
		
		// Vòng lặp để đảm bảo nhập đúng định dạng ngày
		while (true) {
			System.out.print("\tNhập ngày sinh (dd-MM-yyyy): ");
			String strDate_116 = sc_116.nextLine();
			ngaySinh_116 = strToDate_116(strDate_116);
			if (ngaySinh_116 != null) {
				break;
			}
		}

		System.out.print("\tNhập CMND: ");
		CMND = sc_116.nextLine();
	}

	private Date strToDate_116(String strDate_116) {
		Date date_116 = null;
		SimpleDateFormat sdf_116 = new SimpleDateFormat("dd-MM-yyyy");
		sdf_116.setLenient(false); // Thêm dòng này để kiểm tra ngày tháng chặt chẽ hơn

		try {
			date_116 = sdf_116.parse(strDate_116);
		} catch (ParseException e_116) {
			System.out.println("Lỗi định dạng ngày tháng! Vui lòng nhập lại.");
		}
		return date_116;
	}

	// Hàm hiển thị
	public void hienThiThongTin() {
		System.out.println("\tHọ tên: " + hoTen_116);
		
		// Định dạng lại ngày sinh để hiển thị
		SimpleDateFormat sdf_116 = new SimpleDateFormat("dd-MM-yyyy");
		String ngaySinhStr_116 = (ngaySinh_116 != null) ? sdf_116.format(ngaySinh_116) : "Không xác định";
		System.out.println("\tNgày sinh: " + ngaySinhStr_116);

		System.out.println("\tCMND: " + CMND);
	}

	// Hàm lấy ra thông tin CMND
	public String getCMND() {
		return CMND;
	}
}