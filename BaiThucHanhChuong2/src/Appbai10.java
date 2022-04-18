import java.util.Scanner;
public class Appbai10 {
    public static void main(String[] args) {
        String chuoi; 
        char kytu;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap chuoi bat ky: ");
            chuoi = sc.nextLine();

        }while(chuoi.length()>80);
        System.out.println("Nhap vao ky tu can dem: ");
        kytu = sc.next().charAt(0);
        int count=0;
        for(int i = 0 ; i < chuoi.length() ; i++){
            if (kytu == chuoi.charAt(i)) {
                count++;
            }
        }
        System.out.println("Ky tu "+kytu+" xuat hien "+count+" lan trong chuoi");
    }
}