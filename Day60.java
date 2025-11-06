import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nilai N :");
        int n = sc.nextInt();
        
           
        for (int i = n; i > 0; i--) {
            if (i % 2 == 0){
            System.out.print(i+" ");
        }
        }
        System.out.println(" ");
        for (int i = n; i > 0; i--) {
            if (i % 2 != 0){
            System.out.print(i+" ");
            }
            
        }
        }
}
