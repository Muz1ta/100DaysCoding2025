import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        
        int total = 0;
        int jumlah = 0;
        
        int max = 0;
        int min = 0;
        
        while (true) {
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        
        if (angka > 0){
        total += angka;
        jumlah++;
        
        if (max == 0 || angka > max){
          max = angka;
        }
        if (min == 0 || angka < min){
            min = angka;
        }
        
        }else if (angka < 0){
            break;
        }else{
            
            System.out.println("Angka 0 diabaikan");
           continue;
        }
        }
            
    
        System.out.println("==== HASIL ====");
        
    if (jumlah == 0){
            System.out.println("Tidak ada data dihitung");
    }else{
        double rata = total / jumlah;
        
        System.out.println("Total penjumlahan : "+total);
        System.out.println("Rata-rata : "+rata);
        System.out.println("Jumlah angka valid : "+jumlah);
        System.out.println("Angka maxsimum : "+max);
        System.out.println("Angka minimum : "+min);
        
    }
    
    
}
    }
