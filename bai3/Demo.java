package bai3;

public class Demo {
    public static void main(String[] args) {
        Coordinate p1 = new Coordinate();
        System.out.println("Toa do p1 (mac dinh): ");
        p1.xuatToaDo();

        System.out.println("\nNhap toa do cho p1: ");
        p1.nhapToaDo();
        System.out.println("Toa do p1 sau khi nhap: ");
        p1.xuatToaDo();

        Coordinate p2 = new Coordinate(3.0f, 4.0f);
        System.out.println("\nToa do p2 (3.0, 4.0): ");
        p2.xuatToaDo();

        Coordinate p3 = new Coordinate();
        System.out.println("\nNhap toa do cho p3: ");
        p3.xuatToaDo();
        System.out.println("Toa do p3 sau khi nhap: ");
        p3.xuatToaDo();

        float khoangCanh = p1.tinhKhoangCach(p3);
        System.out.println("\nKhoang cach tu p1 den p3: " + khoangCanh);

        float dienTichVuong = p1.tinhDienTichHinhChuNhat(p3);
        System.out.println("Dien tich hinh vuong: " + dienTichVuong);
        
        float dienTichChuNhat = p1.tinhDienTichHinhChuNhat(p3);
        System.out.println("Dien tich hinh chu nhat: " +dienTichChuNhat);

        Coordinate p4 = p1.taoToaDoMoi();
        System.out.println("\nToa do p4 (sao chep tu p1): ");
        p4.xuatToaDo();
    }
}
