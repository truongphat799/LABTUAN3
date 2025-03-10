package bai1;
import java.util.Scanner;

public class DanhSachHocSinh {
    private HocSinh[] ds;
    private int soLuong;

    public DanhSachHocSinh(int size) {
        ds = new HocSinh[size];
        soLuong = 0;
    }

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        soLuong = sc.nextInt();
        ds = new HocSinh[soLuong];
        
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ":");
            ds[i] = new HocSinh();
            ds[i].nhapHocSinh();
        }
    }

    public void inDanhSach() {
        System.out.println("Danh sach hoc sinh:");
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatHocSinh();
        }
    }

    public void sapXepGiamDan() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (ds[i].getDiemTB() < ds[j].getDiemTB()) {
                    HocSinh temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }    
}
