import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah elemen array : ");
        int a = sc.nextInt();
        
        
        int angka [] = new int [a];
        
        for (int i = 0; i < a; i++) {
          System.out.print("Masukkan elemen array "+(i+1)+": ");
           int angkaa = sc.nextInt();
            
            if (angkaa < 0){
                angka[i] = 0;
            }else{
                angka[i] = angkaa;
            }
        }
          int total = 0;
          int nol = 0;
          
          System.out.println("ISI ARRAY");
          for (int i = 0; i < a; i++) {
              System.out.println(angka[i] + " ");
              
              total += angka[i];
              if (angka[i] == 0){
                  nol++;
            
        }
            
        }
        double rata = (a > 0) ? (double) total / a : 0;
        System.out.println("Total nilai Array : "+(int)total);
        System.out.println("Rata-Rata nilai : "+rata);
        System.out.println("Jumlah nilai nol : "+nol);
    }
}
