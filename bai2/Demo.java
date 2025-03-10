package bai2;
public class Demo {
    public static void main(String[] args) {
     
        PhanSo p1 = new PhanSo();
        System.out.println("Phan so p1 (mac dinh): ");
        p1.xuatPhanSo();
  
        System.out.println("\nNhap thong tin cho p1:");
        p1.nhapPhanSo();
        System.out.println("Phan so p1 sau khi nhap: ");
        p1.xuatPhanSo();

        PhanSo p2 = new PhanSo(4, 16);
        System.out.println("\nPhan so p2 (4/16): ");
        p2.xuatPhanSo();

        PhanSo p3 = new PhanSo();
        System.out.println("\nNhap thong tin cho p3:");
        p3.nhapPhanSo();
 
        PhanSo ketQuaCong = p1.cong(p3);
        System.out.println("\nKet qua p1 + p3: ");
        ketQuaCong.xuatPhanSo();

        PhanSo p4 = new PhanSo(ketQuaCong);
        System.out.println("\nPhan so p4 (sao chep tu ket qua cong): ");
        p4.xuatPhanSo();

        PhanSo ketQuaNhan = p4.nhan(p2);
        System.out.println("\nKet qua p4 * p2: ");
        ketQuaNhan.xuatPhanSo();
    }
}

