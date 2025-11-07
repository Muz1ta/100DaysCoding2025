import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nilai N : ");
        int n = sc.nextInt();
        System.out.print("Nilai M : ");
        int m = sc.nextInt();
        
        for (int i = m; i <= n; i+= m) {
            System.out.print(i+" ");
        }
    }
    
}
