import java.util.Scanner;

public class App16 {
    public static void main(String[] args) throws Exception {
        HinhTron hinhTron = new App16(). new HinhTron();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();
    }
    class HinhTron{
        final float PI = 3.14f ;
        float r;
        float cv;
        float dt;
        void nhapBanKinh() {
            System.out.println("Hay nhap vao ban kinh: ");
            Scanner sc = new Scanner(System.in);
            r = sc.nextFloat();
        }
        void tinhChuVi() {
            cv = 2*PI*r;
        }
        void tinhDienTich() {
            dt = PI * r * r;
        }
        void inChuVi() {
            System.out.println("Chu vi hinh tron : "+cv);
        }
        void inDienTich() {
            System.out.println("Dien tich hinh tron : "+dt);
        }
    }
}