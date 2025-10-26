import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan angka : ");
        int nilai = sc.nextInt();
      
        String hasil = (nilai >= 74) ? "LULUS" : "TIDAK LULUS";
        System.out.println("Hasil : "+hasil);
    }
    
}
