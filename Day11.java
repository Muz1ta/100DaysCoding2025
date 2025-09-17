import java.util.Scanner;
public class Day11 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    String nama;
    int jumlah;
    double Harga;
        double total;
    System.out.print("Masukkan Nama : ");
    nama = scanner.nextLine();
    System.out.print("Jumlah tiket : ");
    jumlah = scanner.nextInt ();
     System.out.print("Harga 1 tiket = " + "Rp.");
        Harga = scanner.nextDouble ();
    total = jumlah * Harga;
        System.out.print("Total Pembayaran = " + "Rp." + total);
        
    
    
}
}
