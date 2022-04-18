package shapes;
import java.util.Scanner;

public class HinhChuNhat {
    Scanner sc = new Scanner(System.in);
    float chieuDai;
    float chieuRong;
    float chuVi;
    float dienTich;
    public void nhapChieuDai(){
        System.out.println("Nhap chieu dai: ");
        chieuDai = sc.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.println("Nhap chieu rong: ");
        chieuRong = sc.nextFloat();
    }
    public float tinhChuVi(){
       return chuVi = (chieuDai + chieuRong)*2;
    }
    public float tinhDienTich(){
       return dienTich = chieuDai*chieuRong;
    }
    public void inChuVi(){
        System.out.println("Chu vi hinh chu nhat la : "+chuVi);
    }
    public void inDienTich(){
        System.out.println("Dien tich hinh chu nhat la: "+dienTich);
    }
}