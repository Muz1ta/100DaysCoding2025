import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();
        
        System.out.println("Nilai Dari 1-N");
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("\nNilai Dari N-1");
        for (int i = n; i >= 1; i--) {
            System.out.print(i+" " );
           
        }
    }
    
}
