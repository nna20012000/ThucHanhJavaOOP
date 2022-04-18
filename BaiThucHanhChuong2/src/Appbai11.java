import java.util.Scanner;
public class Appbai11 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap so phan tu cua mang:");
        n = sc.nextInt();
        int A[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("NHap phan tu thu "+i+" :");
            A[i] = sc.nextInt();
        }
        System.out.println("Mang ban dau:");
        for(int i= 0; i<n; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("\n-------------------------");
        System.out.println("Mang theo thu tu tang dan");
        for(int i = 0; i < n-1; i++){
           for(int j = i+1; j<=n-1; j++){
              if (A[i]>A[j]) {
                  int temp = A[i];
                  A[i] = A[j];
                  A[j] = temp;
              }
           }
        }
        for(int i = 0; i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
}