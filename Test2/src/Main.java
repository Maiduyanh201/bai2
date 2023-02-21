import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap diem toan ");
        float a = scanner.nextFloat();
        System.out.println("nhap diem mon ly");
        float b = scanner.nextFloat();
        System.out.println("nhap diem mon anh");
        float c = scanner.nextFloat();
        float d = (a + b + c)/3;
//        float delta = (b * b) - (4 * a * c);
//        double z = Math.sqrt(delta);
//        float x;
//
//        if (delta > 0) {
//            double x1 = (-b + z)/(2*a);
//            double x2 = (-b - z)/(2*a);
//            System.out.println("phuong trinh co 2 nghiem la " + x1 + x2);
//        } else if (delta == 0){
//            System.out.println("phuong trinh co nghiep kep " + (x = -b/2*a));
//        }else {
//            System.out.println("phuong trinh vo nghiem ");
//        }

        if (d <5 ){
            System.out.println("hoc sinh duoi trung binh");
        }else if (d >= 5 && d < 8){
            System.out.println("hoc sinh kha");
        }else if (d< 10 && d >= 8) {
            System.out.println("hoc sinh gioi");
        }else
            System.out.println("khong thuc hien");
    }
}