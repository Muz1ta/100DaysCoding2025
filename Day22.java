import java.util.Scanner;
public class Day22 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Panjang sisi = ");
        int sisi = sc.nextInt();
        double luas = sisi * sisi;
        System.out.println("Luas persegi = "+luas);
    }
}
