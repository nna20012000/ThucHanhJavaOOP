public class App11 {
    public static void main(String[] args) {
        int m = 10000, h =20000, n = 50000, sum, count=0;
        for (int i= 0; i<=4;i++){
            for(int j = 0; j<=10;j++){
                for(int k = 0; k<=20;k++){
                    sum = n*i + h*j + m*k;
                    if (sum==200000) {
                        System.out.println(i+" to 50000 "+j+" to 20000 "+k+" to 10000 .");
                        count++;
                    }
                }
            }
        }
        System.out.println("Co tat ca cac phuong an la: "+count);
    } 
 }