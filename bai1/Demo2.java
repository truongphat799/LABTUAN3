package bai1;

public class Demo2 {
    public static void main(String[] args) {
 
        DanhSachHocSinh ds = new DanhSachHocSinh(10);
       
        ds.nhapDanhSach();
      
        ds.sapXepGiamDan();
      
        System.out.println("\nDanh sach sau khi sap xep:");
        ds.inDanhSach();
    }
}
