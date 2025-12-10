import java.util.Scanner;

public class Day94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
       String nama = sc.nextLine();
       int umur = sc.nextInt();
       cetakNama(nama);
       cetakUmur(umur);
    }
    public static void cetakNama (String nama){
        System.out.println("Nama : "+nama);
    }
    public static void cetakUmur (int umur){
        System.out.println("Umur : "+umur+" tahun");
    }
}
