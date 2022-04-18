package shapes;
import java.util.Scanner;

public class Person {
    String PersonId;
    String PersonName;
    Boolean Gender;
    String Address;
    Scanner sc = new Scanner(System.in);
    public void PersonId() {
        System.out.println("Nhap ID: ");
        PersonId = sc.nextLine();
    }
    public void PersonName() {
        System.out.println("Nhap Ho va Ten: ");
        PersonName = sc.nextLine();
    }
    public void Gender(){
        System.out.println("Gioi tinh: ");
        Gender = sc.nextBoolean();
    }
    public void Address() {
        System.out.println("Nhap dia chi: ");
        Address = sc.nextLine();
    }
    public void inID(){
        System.out.println("ID cua ban la: "+PersonId);
    }
    public void inName(){
        System.out.println("Ten cua ban la: "+PersonName);
    }
    public void inGender(){
        if(Gender==true){
            System.out.println("Gioi tinh: Nam");
        }
        else{
            System.out.println("Gioi tinh: Nu");
        }
    }
    public void inAddress(){
        System.out.println("Dia chi: "+Address);
    }
}