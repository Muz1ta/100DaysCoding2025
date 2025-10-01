import java.util.Scanner;
public class luas {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("nilai π = ");
        double pi = sc.nextDouble();
        System.out.print("nilai r² = ");
        int r = sc.nextInt();
        double luas = pi * (r * r);
        System.out.println("Luas lingkaran : " + luas);
    }   
    
}
