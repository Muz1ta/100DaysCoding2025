import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        if (angka % 3 == 0 && angka % 5 == 0){
            System.out.println("Angka Merupakan Kelipatan 3 dan 5");
        }else if (angka % 3 == 0){
            System.out.println("Angka Merupakan kelipatan 3");
        }else if (angka % 5 == 0){
            System.out.println("Angka merupakan kelipatan 5");
        }else{
            System.out.println("Angka bukan kelipatan 3 dan 5");
        }
    }
    
}
