import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();
        
        System.out.println("-PREDIKAT NILAI-");
        
        if (nilai >= 90 ){
            System.out.println("Sangat Baik");
        }else if (nilai >= 80 && nilai < 90){
            System.out.println("Baik");
        }else if (nilai >= 70 && nilai < 80){
            System.out.println("Cukup");
        }else{
            System.out.println("Kurang");
        System.out.println("Tetap Semangat");
        
   
        }
    }
    
}
