package bai4;

public class Demo {
    public static void main(String[] args) {
        
        NhanVien nv1 = new NhanVien(); 
        NhanVien nv2 = new NhanVien("NV002", "Nguyen Van A", 5000000, 2.5); // Constructor có tham số
        NhanVien nv3 = new NhanVien(nv2); 
        
        System.out.println("Nhap thong tin cho nv1:");
        nv1.nhapNhanVien();
        System.out.println("Nhap thong tin cho nv2:");
        nv2.nhapNhanVien();
        System.out.println("Nhap thong tin cho nv3:");
        nv3.nhapNhanVien();
     
        System.out.println("\nThong tin 3 nhan vien:");
        nv1.xuatNhanVien();
        System.out.println("Luong nv1: " + nv1.tinhLuong());
        nv2.xuatNhanVien();
        System.out.println("Luong nv2: " + nv2.tinhLuong());
        nv3.xuatNhanVien();
        System.out.println("Luong nv3: " + nv3.tinhLuong());

        nv1.setHoTen("Tran Van B");
        System.out.println("\nSau khi doi ten nv1:");
        nv1.xuatNhanVien();
        System.out.println("Luong nv1: " + nv1.tinhLuong());

        NhanVien maxHeSo = nv1;
        if (nv2.getHeSoLuong() > maxHeSo.getHeSoLuong()) maxHeSo = nv2;
        if (nv3.getHeSoLuong() > maxHeSo.getHeSoLuong()) maxHeSo = nv3;
        System.out.println("\nNhan vien co he so luong cao nhat: ");
        maxHeSo.xuatNhanVien();
        System.out.println("Luong: " + maxHeSo.tinhLuong());

        DanhSachNhanVien ds = new DanhSachNhanVien(5);
        System.out.println("\nNhap danh sach nhan vien:");
        ds.nhapDanhSach();
        ds.xuatDanhSach();

        System.out.println("\nSo luong nhan vien: " + NhanVien.getSoLuongNhanVien());
    }
}

