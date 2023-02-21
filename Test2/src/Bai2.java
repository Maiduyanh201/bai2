import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        float x = scanner.nextFloat();
        System.out.println("nhap y");
        float y = scanner.nextFloat();
        System.out.println("nhap z");
        float z = scanner.nextFloat();
        if (x > y && x >z){
            System.out.println("so lon nhat la x = " + x);
        } else if (y > x && y > z ) {
            System.out.println("so lon nhat la y = " + y);
        } else if (z > x && z > y){
            System.out.println("so lon nhat la z = " + z);
        }
    }
}
