import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Nilai Teori : ");
        int teori = sc.nextInt();
        System.out.print("Masukkan Nilai Praktik : ");
        int praktik = sc.nextInt();
        int rata2 = (teori + praktik)/2;
        System.out.println("Rata rata : "+rata2);
        System.out.println("Status Lulus : "+(teori >= 70 && praktik >= 75));
    }
    }
    
