import java.util.Scanner;
public class Appbai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhap so thu nhat: ");
        number = sc.nextInt();
        if (number%2==0) {
            System.out.println("So vua nhap vao la so chan.");
        }
        else{
            System.out.println("So vua nhap vao la so le.");
        }
    }
}