import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Angka ke");
        int a = sc.nextInt();
        
        System.out.println("");
        
        while (a <= 10){
            a++;
            if (a == 5){
                break;
            }
            System.out.println("Angka ke"+a);
        }
    }
    
}
