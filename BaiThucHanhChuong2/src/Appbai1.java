import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Appbai1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        System.out.println("Nhap so thu nhat: ");
        number1 = sc.nextInt();
        System.out.println("Nhap so thu hai: ");
        number2 = sc.nextInt();
        System.out.println("Tong hai so la: "+(number1+number2));
        System.out.println("Hieu hai so la: "+(number1-number2));
        System.out.println("Tich hai so la: "+(number1*number2));
        System.out.println("Thuong hai so la: "+(number1/number2));
        System.out.println("Chia du cua hai so la: "+(number1%number2));
        if (number1 == number2) {
            System.out.println("Hai so bang nhau.");
        } else if(number1 < number2) {
            System.out.println(number1+" nho hon "+number2);
        }
        else{
            System.out.println(number2+" nho hon "+number1);
        }
    }
}