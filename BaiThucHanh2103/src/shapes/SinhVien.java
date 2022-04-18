package shapes;
import java.util.Scanner;
import java.util.Date;

public class SinhVien {
    String MaSinhVien;
    String HoTen;
    Boolean GioiTinh;
    String DiaChi;
    String NgaySinh;
    Scanner sc = new Scanner(System.in);
    public void NhapMaSinhVien(){
        System.out.println("Nhap ma sinh vien: ");
        MaSinhVien = sc.nextLine();
    }
    public void NhapHoTen(){
        System.out.println("Nhap ho va ten: ");
        HoTen = sc.nextLine();
    }
    public void NhapDiaChi(){
        System.out.println("Nhap dia chi:");
        DiaChi = sc.nextLine();
    }
    public void NhapNgaySinh(){
        System.out.println("Ngay sinh:");
        NgaySinh = sc.nextLine();
    }
    public void NhapGioiTinh(){
        System.out.println("Gioi tinh:");
        GioiTinh = sc.nextBoolean();
    }
    public void inThongTin(){
        System.out.println("Ma sinh vien: "+MaSinhVien);
        System.out.println("Ho va ten: "+HoTen);
        System.out.println("Dia chi: "+DiaChi);
        System.out.println("Ngay sinh: "+NgaySinh);
        if (GioiTinh==true) {
            System.out.println("Gioi tinh: Nam");
        }
        else{
            System.out.println("Gioi tinh: Nu");
        }
    }
}