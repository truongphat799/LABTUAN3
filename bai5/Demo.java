package bai5;
public class Demo {
        public static void main(String[] args) {
            try {
                TamGiac tg1 = new TamGiac(3, 4, 5);
                tg1.hienThiThongTin();
    
                TamGiac tg2 = new TamGiac(5, 5, 5);
                tg2.hienThiThongTin();
    
                TamGiac tg3 = new TamGiac(7, 7, 10);
                tg3.hienThiThongTin();
                
                TamGiac tg4 = new TamGiac(6, 8, 10);
                tg4.hienThiThongTin();
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    

