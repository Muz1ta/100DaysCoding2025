import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //menampilkan kata berulang
        
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
       
        System.out.println(" ");
        
        for (int i = 1; i < angka; i++) {
            if (i %2 != 0){
            System.out.println(i+". Cumlaude di Informatika.");
            }else{
                System.out.println(i+". Banyak Duit Halal.");
            }
        }
        System.out.println("======Aaminn======");
    }
}
