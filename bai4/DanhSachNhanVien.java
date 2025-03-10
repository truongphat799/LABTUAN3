package bai4;
import java.util.Scanner;

public class DanhSachNhanVien {
    private NhanVien[] ds;
    private int soLuong;

    public DanhSachNhanVien(int size) {
        ds = new NhanVien[size];
        soLuong = 0;
    }

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        soLuong = sc.nextInt();
        ds = new NhanVien[soLuong];

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            ds[i] = new NhanVien();
            ds[i].nhapNhanVien();
        }
    }

    public void xuatDanhSach() {
        System.out.println("Danh sach nhan vien:");
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatNhanVien();
            System.out.println("Luong: " + ds[i].tinhLuong());
        }
    }
}

