import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;
public class Appbai5 {
    public static void main(String[] args) {
        int number, sum =0;
        Scanner sc = new Scanner(System.in);
        while(sum <100){
            System.out.println("Nhap so nguyen: ");
            number = sc.nextInt();
            sum += number;
        }
        System.out.println("Tong = "+sum);
    }
}