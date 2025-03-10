package bai3;

import java.util.Scanner;

public class Coordinate {
    private float x;
    private float y;

    public Coordinate() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Coordinate(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Coordinate(Coordinate c) {
        this.x = c.x;
        this.y = c.y;
    }
    public void nhapToaDo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hoanh do x: ");
        this.x = sc.nextFloat();
        System.out.print("Nhap tung do y: " );
        this.y = sc.nextFloat();
    }
    public void xuatToaDo() {
        System.out.println("(" + x + "," + y + ")");
    }
    public float getY() {
        return y;
    }
    public float tinhKhoangCach(Coordinate c) {
        float dx = this.x - c.x;
        float dy = this.y - c.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
    public float tinhDienTichHinhVuong(Coordinate c) {
        float khoangCanh = tinhKhoangCach(c);
        return khoangCanh * khoangCanh;
    }
    public float tinhDienTichHinhChuNhat(Coordinate c) {
        float chieuDai = Math.abs(this.x - c.x);
        float chieuRong = Math.abs(this.y - c.y);
        return chieuDai * chieuRong;
    }
    public Coordinate taoToaDoMoi() {
        return new Coordinate(this.x, this.y);
    }

}
