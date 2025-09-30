import java.util.Scanner;
public class Day22 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Panjang = ");
        int panjang = sc.nextInt();
        System.out.print("Lebar = ");
        int lebar = sc.nextInt();
        double luas = panjang * lebar;
        System.out.println("Luas = "+luas + " cm²");
    }
}
