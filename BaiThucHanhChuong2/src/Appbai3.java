import java.util.Scanner;
public class Appbai3 {
    public static void main(String[] args) {
        String name;
        int tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho va ten: ");
        name = sc.nextLine();
        System.out.println("Tuoi: ");
        tuoi = sc.nextInt();
        if(tuoi<16){
            System.out.println("Ban "+name+" o tuoi vi thanh nien.");
        }
        else if(tuoi<=18){
            System.out.println("Ban "+name+" o do tuoi truong thanh.");
        }
        else{
            System.out.println("Ban "+name+" da gia");
        }
}
}