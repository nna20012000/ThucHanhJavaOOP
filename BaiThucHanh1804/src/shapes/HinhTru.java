package shapes;

import java.util.Scanner;
public class HinhTru extends HinhTron {
    
    public float chieuCao;

    //Constructor
    public HinhTru() {
        ten = "Hình Trụ";
    }
    
    public void nhapChieuCao() {
        nhapBanKinh();

        System.out.println("chiều cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao; 
    }
}