import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nilai N : ");
        int n = sc.nextInt();
        int total = 1;
        
        for (int i = 1; i < n; i++) {
        total *= i;
        }
        System.out.print("Total : "+total + " ");
            
        }
    }
