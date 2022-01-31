
import java.util.Scanner;


public class orderOfNumbers {
    public static void main(String[] args) {

        int x, y, z;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz:");
        x = input.nextInt();

        System.out.print("2. sayıyı giriniz:");
        y = input.nextInt();

        System.out.print("3. sayıyı giriniz:");
        z = input.nextInt();

        if ((z < y) && (z < x)) {
            if (y < x) {
                System.out.println(" z < x < y ");
            } else {
                System.out.println(" z < y < x ");
            }
        } else if ((y < z) && (y < x)) {
            if (z < x) {
                System.out.println(" y < z < x");
            } else {
                System.out.println(" y < x < z");
            }
        } else {
            if (y < z){
                System.out.println(" x < y < z");
            }else{
                System.out.println(" x < z < y");
            }

        }
    }
}
