package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Nguoi {
    private String hoTen_116;
    private Date ngaySinh_116;
    private String ngheNghiep_116;

    public Nguoi() {}

    public Nguoi(String hoTen_116, Date ngaySinh_116, String ngheNghiep_116) {
        this.hoTen_116 = hoTen_116;
        this.ngaySinh_116 = ngaySinh_116;
        this.ngheNghiep_116 = ngheNghiep_116;
    }

    public void nhapThongTin(Scanner sc_116) {
        System.out.print("\tNhap ho ten: ");
        hoTen_116 = sc_116.nextLine();
        System.out.print("\tNhap ngay sinh (dd-MM-yyyy): ");
        String strDate_116 = sc_116.nextLine();
        ngaySinh_116 = strToDate(strDate_116);
        System.out.print("\tNhap nghe nghiep: ");
        ngheNghiep_116 = sc_116.nextLine();
    }

    private Date strToDate(String strDate_116) {
        SimpleDateFormat sdf_116 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return sdf_116.parse(strDate_116);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang! Mac dinh la ngay hien tai.");
            return new Date();
        }
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen_116);
        System.out.println("\tNgay sinh: " + dateToString(ngaySinh_116));
        System.out.println("\tNghe nghiep: " + ngheNghiep_116);
        System.out.println("\tTuoi: " + tinhTuoi());
    }

    private String dateToString(Date date_116) {
        SimpleDateFormat sdf_116 = new SimpleDateFormat("dd-MM-yyyy");
     // Sửa đổi dòng 53 thành:
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    public int tinhTuoi() {
        Calendar sinh = Calendar.getInstance();
        sinh.setTime(ngaySinh_116);
        Calendar now = Calendar.getInstance();
        int tuoi = now.get(Calendar.YEAR) - sinh.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) < sinh.get(Calendar.DAY_OF_YEAR)) {
            tuoi--;
        }
        return tuoi;
    }
}
