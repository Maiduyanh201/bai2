import java.util.Scanner;

public class Gptb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a ");
        float a = scanner.nextFloat();
        System.out.println("nhap b ");
        float b = scanner.nextFloat();
        System.out.println("nhap c ");
        float c = scanner.nextFloat();
        float delta = (b*b) - (4*a*c);

        double z = Math.sqrt(delta);
        if (a == 0){
            if (b == 0){
                System.out.println("phuong trinh vo nghiem ");
            }else {
                System.out.println("phuong trinh co 1 nghiem = " + (-c / b));
            }
            return;
        }

        if (delta < 0){
            System.out.println("phuong tring vo nghiem ");
        }else if (delta > 0){
            double x1 = (-b + z)/(2 * a);
            double x2 = (-b - z)/(2 * a);
            System.out.println("phuong trinh co 2 nghiem phan biet x1 =" + x1 + " x2 =" + x2 );
        }else {
            System.out.println("phuong trinh co nghiem kep = " + (-b) / (2 * a));
        }

    }
}
