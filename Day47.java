import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan Ankga : ");
        int angka = sc.nextInt();
        
        switch (angka) {
            case 1 :
                System.out.println("SENIN");
                break;
            case 2 : 
                System.out.println("SELASA");
                break;
            case 3 :
                System.out.println("RABU");
                break;
            case 4 :
                System.out.println("KAMIS");
                break;
            case 5 :
                System.out.println("JUMAT");
                break;
            case 6 :
                System.out.println("SABTU");
                break;
            case 7 :
                System.out.println("MINGGU");
                break;
            default :
                System.out.println("TIDAK VALID");
                break;
        }
    }
    
}
