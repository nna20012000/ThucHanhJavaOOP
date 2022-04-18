import java.util.Scanner;
public class Appbai8 {
    public static void main(String[] args) {
        int n, sum=0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.println("Nhap so thu "+i+" : ");
            int number = sc.nextInt();
            sum += number;
        }
        System.out.println("Trung binh cong cua "+n+" so nguyen vua nhap la: "+(sum/n));
    }
}