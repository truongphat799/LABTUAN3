package bai4;

import java.util.Scanner;

public class NhanVien {
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    private static int soLuongNhanVien = 0;

    public NhanVien() {
        this.maSo = "";
        this.hoTen = "";
        this.luongCoBan = 0.0;
        this.heSoLuong = 0.0;
        soLuongNhanVien++;
    }
    public NhanVien(String maSo, String hoTen, double luongCoBan, double heSoLuong) {
    this.maSo = maSo;
    this.hoTen = hoTen;
    this.luongCoBan = luongCoBan;
    this.heSoLuong = heSoLuong;
    soLuongNhanVien++;
    }
    public NhanVien(NhanVien nv) {
        this.maSo = nv.maSo;
        this.hoTen = nv.hoTen;
        this.luongCoBan = nv.luongCoBan;
        this.heSoLuong = nv.heSoLuong;
        soLuongNhanVien++;
    }
    public String getMaSo() {
        return maSo;
    }
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public static int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }
    public void nhapNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        this.maSo = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        this.luongCoBan = sc.nextDouble();
        System.out.println("Nhap he so luong: ");
        this.heSoLuong = sc.nextDouble();
        sc.nextLine();
    }
    public void xuatNhanVien() {
        System.out.println("Ma so: " + maSo + ", Ho ten: " + hoTen + ", Luong co ban: " + luongCoBan + ", He so luong: " + heSoLuong);
    }
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
}
