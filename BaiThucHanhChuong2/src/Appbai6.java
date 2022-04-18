import java.util.Scanner;
public class Appbai6 {
    public static void main(String[] args) {
        int number,giai_thua = 1;
        System.out.println("Nhap so nguyen n: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for(int i = 1; i <= number; i++)
        {
            giai_thua = giai_thua * i;
        }
        System.out.println("Giai thừa của "+number+" là: "+giai_thua);

    }
}