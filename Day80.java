import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = sc.nextInt();
        int array [] = new int [elemen];
        
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Indeks"+i+" : ");
            array[i] = sc.nextInt();
        }
            System.out.println("TAMPILAN");
            for (int i = 0; i < elemen; i++) {
                System.out.print(array[i]+" ");
            }
            
        }
    }
