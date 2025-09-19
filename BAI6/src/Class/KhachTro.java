package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// Thuộc tính
	private int soNgayTro_116;
	private String loaiPhong_116;
	private double giaPhong_116;

	// Phương thức
	// Hàm khởi tạo không đối số
	public KhachTro() {
		super();
	}

	// Hàm khởi tạo có đối số
	// Thêm hàm khởi tạo này vào lớp KhachTro
	public KhachTro(String hoTen_116, String CMND_116, int soNgayTro_116, String loaiPhong_116, double giaPhong_116) {
	    super(hoTen_116, CMND_116);
	    this.soNgayTro_116 = soNgayTro_116;
	    this.loaiPhong_116 = loaiPhong_116;
	    this.giaPhong_116 = giaPhong_116;
	}
	// Hàm nhập thông tin khách trọ
	@Override
	public void nhapThongTin(Scanner sc_116) {
		super.nhapThongTin(sc_116);
		
		System.out.print("\tNhập số ngày trọ: ");
		this.soNgayTro_116 = sc_116.nextInt();
		sc_116.nextLine(); // Bắt newline sau khi nhập số nguyên

		System.out.print("\tNhập loại phòng: ");
		this.loaiPhong_116 = sc_116.nextLine();

		System.out.print("\tNhập giá phòng: ");
		this.giaPhong_116 = sc_116.nextDouble();
		sc_116.nextLine(); // Bắt newline sau khi nhập số thực
	}

	// Hàm hiển thị thông tin khách trọ
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSố ngày trọ: " + this.soNgayTro_116);
		System.out.println("\tLoại phòng: " + this.loaiPhong_116);
		System.out.println("\tGiá phòng: " + this.giaPhong_116);
	}

	// Hàm lấy thông tin số ngày trọ
	public int getSoNgayTro() {
		return soNgayTro_116;
	}

	// Hàm lấy thông tin giá phòng
	public double getGiaPhong() {
		return giaPhong_116;
	}
}