package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuộc tính
	protected String hoTen_116;
	protected Date ngaySinh_116;
	protected String queQuan_116;

	// phương thức
	// hàm khởi tạo không đối số
	public Nguoi() {

	}

	// hàm khởi tạo có đối số
	public Nguoi(String hoTen_116, Date ngaySinh_116, String queQuan_116) {
		this.hoTen_116 = hoTen_116;
		this.ngaySinh_116 = ngaySinh_116;
		this.queQuan_116 = queQuan_116;
	}

	// hàm nhập vào thông tin
	public void nhapThongTin(Scanner sc_116) {
		System.out.print("\tNhập họ tên: ");
		hoTen_116 = sc_116.nextLine();

		System.out.print("\tNhập ngày sinh: ");
		String strDate_116 = sc_116.nextLine();
		ngaySinh_116 = strToDate_116(strDate_116);

		System.out.print("\tNhập quê quán: ");
		queQuan_116 = sc_116.nextLine();
	}

	private Date strToDate_116(String strDate_116) {
		Date date_116 = null;

		SimpleDateFormat sdf_116 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_116 = sdf_116.parse(strDate_116);
		} catch (ParseException e_116) {
			System.out.println("Lỗi định dạng ngày tháng!");
		}

		return date_116;
	}

	// hàm hiển thị
	public void hienThiThongTin() {
		System.out.println("\tHọ tên: " + hoTen_116);
		System.out.println("\tNgày sinh: " + ngaySinh_116);
		System.out.println("\tQuê quán: " + queQuan_116);
	}

	// hàm lấy ra quê quán
	public String getQueQuan() {
		return queQuan_116;
	}

	// hàm lấy ra thông tin về ngày sinh
	public Date getNgaySinh() {
		return ngaySinh_116;
	}
}