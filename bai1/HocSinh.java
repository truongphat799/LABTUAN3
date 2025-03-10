package bai1;
import java.util.Scanner;

public class HocSinh {
    private String maSo;
    private String hoTen;
    private double diemTB;

    public HocSinh() {
        this.maSo = "";
        this.hoTen = "";
        this.diemTB = 0.0;
    }

    public HocSinh(String maSo, String hoTen, double diemTB) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public HocSinh(HocSinh tmp) {
        this.maSo = tmp.maSo;
        this.hoTen = tmp.hoTen;
        this.diemTB = tmp.diemTB;
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

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void nhapHocSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        this.maSo = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        this.diemTB = sc.nextDouble();
    }

    public void xuatHocSinh() {
        System.out.println("Ma so: " + maSo + ", Ho ten: " + hoTen + ", Diem TB: " + diemTB);
    }
}