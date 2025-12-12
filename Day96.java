import java.util.Scanner;
public class Day96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan angka1 : ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka2 : ");
        int b = sc.nextInt();
        
        System.out.println("================");
        
        System.out.println("Pertambahan : "+jumlah(a,b));
        System.out.println("Pengurangan : "+kurang(a,b));
        System.out.println("Perkalian   : "+kali(a,b));
        System.out.println("Pembagian   : "+bagi(a,b));
        
    }
    public static int jumlah(int a, int b){
       return a + b;
    }
    public static int kurang(int a, int b){
         return a - b;
    }
      public static int kali(int a, int b){
         return a * b;
    }
        public static int bagi(int a, int b){
         return a / b;
        }
}
