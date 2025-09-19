package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    // thuoc tinh
    private ArrayList<ThiSinh> dsts_116;

    // phuong thuc
    public TuyenSinh() {
        dsts_116 = new ArrayList<ThiSinh>(10);
    }

    // ham them 1 thi sinh
    public void themThiSinh(ThiSinh ts_116) {
        dsts_116.add(ts_116);
    }

    // nhap danh sach
    public void nhapDanhSach(Scanner sc_116) {
        ThiSinh ts_116;
        int chon_116;

        System.out.print("Nhap vao so luong thi sinh: ");
        int n_116 = sc_116.nextInt();
        sc_116.nextLine();

        for (int i = 0; i < n_116; i++) {
            System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
            chon_116 = sc_116.nextInt();

            switch (chon_116) {
            case 1:
                ts_116 = new KhoiA("Toan", "Ly", "Hoa");
                break;
            case 2:
                ts_116 = new KhoiB("Toan", "Hoa", "Sinh");
                break;
            case 3:
                ts_116 = new KhoiC("Van", "Su", "Dia");
                break;
            default:
                ts_116 = new KhoiA("Toan", "Ly", "Hoa");
                break;
            }

            ts_116.nhapThongTin(sc_116);
            themThiSinh(ts_116);
        }
    }

    // ham hien thi
    public void hienThiDanhSach() {
        int n_116 = dsts_116.size();
        for (int i = 0; i < n_116; i++) {
            System.out.println("Thi sinh thu " + (i + 1) + " la:");
            dsts_116.get(i).hienThiThongTin();
        }
    }

    // tim kiem thi sinh theo so bao danh
    public void timKiemThiSinh(int soBaoDanh_116) {
        for (ThiSinh ts_116 : dsts_116) {
            if (ts_116.getSoBD_116() == soBaoDanh_116) {
                ts_116.hienThiThongTin();
            }
        }
    }
}
