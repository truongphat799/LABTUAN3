package bai2;
import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        this.tu = 0;
        this.mau = 1; 
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        if (mau != 0) {
            this.mau = mau;
        } else {
            this.mau = 1; 
        }
    }

    public PhanSo(PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        this.tu = sc.nextInt();
        System.out.print("Nhap mau so: ");
        int mauInput = sc.nextInt();
        if (mauInput != 0) {
            this.mau = mauInput;
        } else {
            System.out.println("Mau so khong the bang 0, gan mac dinh mau = 1");
            this.mau = 1;
        }
    }
 
    public void xuatPhanSo() {
        System.out.println(tu + "/" + mau);
    }

    private int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void rutGon() {
        int ucln = UCLN(tu, mau);
        tu = tu / ucln;
        mau = mau / ucln;
        if (mau < 0) { 
            tu = -tu;
            mau = -mau;
        }
    }

    public PhanSo cong(PhanSo p) {
        PhanSo ketQua = new PhanSo();
        ketQua.tu = this.tu * p.mau + p.tu * this.mau;
        ketQua.mau = this.mau * p.mau;
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo tru(PhanSo p) {
        PhanSo ketQua = new PhanSo();
        ketQua.tu = this.tu * p.mau - p.tu * this.mau;
        ketQua.mau = this.mau * p.mau;
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo chia(PhanSo p) {
        PhanSo ketQua = new PhanSo();
        ketQua.tu = this.tu * p.mau;
        ketQua.mau = this.mau * p.tu;
        if (ketQua.mau != 0) {
            ketQua.rutGon();
        } else {
            System.out.println("Khong the chia cho 0, gan mac dinh ket qua = 0/1");
            ketQua.tu = 0;
            ketQua.mau = 1;
        }
        return ketQua;
    }
 
    public PhanSo nhan(PhanSo p) {
        PhanSo ketQua = new PhanSo();
        ketQua.tu = this.tu * p.tu;
        ketQua.mau = this.mau * p.mau;
        ketQua.rutGon();
        return ketQua;
    }
}

