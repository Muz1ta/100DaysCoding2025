import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nilai N :");
        int n = sc.nextInt();
        System.out.print("Nilai M : ");
        int m = sc.nextInt();
        
        int hasil = (int) Math.pow(m, n);
        System.out.println(m+" pangkat "+n+" = "+hasil);
    }
    
}
