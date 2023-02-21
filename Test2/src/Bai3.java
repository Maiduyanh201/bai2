import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        float x = scanner.nextFloat();
        if (x % 2 == 0){
            System.out.println("x la so chan ");
        }else {
            System.out.println("x la so le");
        }
        if (x >= 0){
            System.out.println("x la so duong");
        }else {
            System.out.println("x la so am");
        }
    }
}
