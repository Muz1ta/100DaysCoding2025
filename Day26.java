import java.util.Scanner;
public class Day26 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Angka1 semula = ");
        int angka1 = sc.nextInt();
        System.out.print("Angka2 semula = ");
        int angka2 = sc.nextInt();
        
        angka1 += 5;
        angka2 -= 5;
        System.out.println("angka1 setelah penugasan tambah = "+ angka1);
        System.out.println("Angka2 setelah penugasan kurang = "+ angka2);
        
        angka1 *= 3;
        angka2 /= 2;
        System.out.println("Angka1 setelah penugasan kali = "+ angka1);
        System.out.println("Angka2 setelah penugasan bagi = "+ angka2);
        
        angka2 %= 2;
        System.out.println("Angka1 setelah penugasan modulus = "+ angka2);
    } 
}
