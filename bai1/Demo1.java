package bai1;

public class Demo1 {
    public static void main(String[] args) {

        HocSinh hs1 = new HocSinh(); 
        HocSinh hs2 = new HocSinh("HS002", "Nguyen Van Hai", 7.8); 
        HocSinh hs3 = new HocSinh(hs2); 

        System.out.println("Nhap thong tin cho hoc sinh 1:");
        hs1.nhapHocSinh();

        System.out.println("\nThong tin 3 hoc sinh:");
        hs1.xuatHocSinh();
        hs2.xuatHocSinh();
        hs3.xuatHocSinh();

        hs1.setHoTen("Nguyen Van Ba");
        System.out.println("\nSau khi doi ten hs1:");
        hs1.xuatHocSinh();

        HocSinh max = hs1;
        if (hs2.getDiemTB() > max.getDiemTB()) max = hs2;
        if (hs3.getDiemTB() > max.getDiemTB()) max = hs3;
        System.out.println("\nHoc sinh co diem TB cao nhat: " + max.getHoTen());
    }
}
