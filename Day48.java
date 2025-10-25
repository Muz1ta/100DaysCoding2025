import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("1. Perkalian");
        System.out.println("2. Pembagian");
        System.out.println("3. Pertambahan");
        System.out.println("4. Pengurangan");
        
        System.out.print("Pilih operasi : ");
        int pilih = sc.nextInt();
        
        System.out.print("Masukkan angka pertama :");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka kedua :");
        int angka2 = sc.nextInt();
        
        switch (pilih){
            case 1 :
                System.out.println("Hasil Perkalian : "+(angka1 * angka2));
                break;

            case 2 :
                if (angka2 != 0){
                System.out.println("Hasil Pembagian : "+(angka1 / angka2));
                }else{
                    System.out.println("Tidak bisa Dibagi 0");
                }
                break;
                
            case 3 :
                System.out.println("Hasil Pertambahan : "+(angka1 + angka2));
                break;
                
            case 4 :
                System.out.println("Hasil Pengurangan : "+(angka1 - angka2));
                break;
                
             default :
                 System.out.println("Tidak Valid");
                 break;
                    
                
                    
                }
        }
    }
