import java.util.Scanner;
public class Appbai9 {
    public static void main(String[] args) {
           String chuoi;
           int soKyTuInHoa=0 , soKyTuInThuong = 0, soKyTuSo=0 ;
           Scanner sc = new Scanner(System.in);
           System.out.println("Nhap chuoi bat ky: ");
           chuoi = sc.nextLine();
           for(int i=0; i< chuoi.length();i++){
            if (Character.isUpperCase(chuoi.charAt(i))) {
                soKyTuInHoa++;
            }
            if (Character.isLowerCase(chuoi.charAt(i))) {
                soKyTuInThuong++;
            }
            if (Character.isDigit(chuoi.charAt(i))) {
                soKyTuSo++;
            }
           }
           System.out.println("Tong chuoi "+chuoi+"\n Co "+soKyTuInHoa+" ky tu viet hoa.\n Co "+soKyTuInThuong+" ky tu viet thuong.\n Co "+soKyTuSo+" ky tu so.");
    }
}