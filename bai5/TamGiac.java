package bai5;

public class TamGiac {
    private int a, b, c;

    public TamGiac(int a, int b, int c) {
        if (kiemTraHopLe(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("Ba canh khong hop le de tao thanh tam giac!");
        }
    }

    private boolean kiemTraHopLe(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public int tinhChuVi() {
        return a + b + c;
    }

    public double tinhDienTich() {
        double p = tinhChuVi() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String loaiTamGiac() {
        if (a == b && b == c) {
            return "Tam giac deu";
        } else if (a == b || a == c || b == c) {
            return "Tam giac can";
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "Tam giac vuong";
        } else {
            return "Tam giac thuong";
        }
    }

    public void hienThiThongTin() {
        System.out.println("Canh a: " + a + ", Canh b: " + b + ", Canh c: " + c);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Dien tich: " + tinhDienTich());
        System.out.println("Loai: " + loaiTamGiac());
        System.out.println("---------------------------");
    }
}