package shapes;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    int a,b,c,delta;
    Scanner sc = new Scanner(System.in);
    public void nhapHeSo(){
        System.out.println("Nhap he so a: ");
        a = sc.nextInt();
        System.out.println("Nhap he so b: ");
        b = sc.nextInt();
        System.out.println("Nhap he so c: ");
        c = sc.nextInt();
    }
    int delta(){
        delta = (b*b)-4*(a*c);
        return delta;
    }
    public void inPhuongTrinh(){
        System.out.println("Phuong trinh co dang:");
        System.out.println(a+"x^2 + "+b+"x +"+c+"= 0");
        if (delta == 0 ) {
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 ="+ (-b/2*a));
        }else if(delta >0){
            System.out.println("Phuong trinh co 2 nghiem: x1 = "+(-b +Math.sqrt(delta)/2*a)+" , x2 = "+(-b - Math.sqrt(delta)/2*a));
        }else{
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
}