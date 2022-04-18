package shapes;
import shapes.HinhChuNhat;
import shapes.Person;
import java.util.Scanner;



public class App2103 {
    public static void main(String[] args) {
        //Khoi tao hinh chu nhat
    HinhChuNhat hcn = new HinhChuNhat();
    hcn.nhapChieuDai();
    hcn.nhapChieuRong();
    hcn.tinhChuVi();
    hcn.tinhDienTich();
    hcn.inChuVi();
    hcn.inDienTich();
    System.out.println("\n");
    System.out.println("------------------");
    //Khoi tao person
    Person p = new Person();
    p.PersonId();
    p.PersonName();
    p.Address();
    p.Gender();
    p.inID();
    p.inName();
    p.inGender();
    p.inAddress();
    
    System.out.println("\n");
    System.out.println("------------------");
    //khoi tao SinhVien
    SinhVien sv = new SinhVien();

    sv.NhapMaSinhVien();
    sv.NhapHoTen();
    sv.NhapDiaChi();
    sv.NhapNgaySinh();
    sv.NhapGioiTinh();
    sv.inThongTin();

    System.out.println("\n");
    System.out.println("------------------");
    PhuongTrinhBacHai ptbh = new PhuongTrinhBacHai();
    ptbh.nhapHeSo();
    ptbh.delta();
    ptbh.inPhuongTrinh();

    }
}