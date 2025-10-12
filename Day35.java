import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        program menentukan harga tiket beerdasarkan umur
         System.out.println("Masukkan umur : ");
         int umur = sc.nextInt();
         if (umur < 12){
             System.out.println("Rp. 25.000");
         }else if (umur >= 12 && umur < 18){
             System.out.println("Rp. 35.000");
         }else{
             System.out.println("Rp. 50.000 ");
         }
      }   
    }
