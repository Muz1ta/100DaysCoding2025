import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan predikat: ");
        char predikat = sc.next().charAt(0);
        
        switch (predikat){
            case 'A' :
                System.out.println("Sangat Baik");
                break;
            case 'B' :
                System.out.println("Baik");
                break;
            case 'C' :
                System.out.println("Cukup");
                break;
            case 'D' :
                System.out.println("Kurang");
                break;
            case 'E' :
                System.out.println("Gagal");
                break;
            default :
                System.out.println("Nilai Tidak Valid");
                break;
        }
        
    }
    
}
