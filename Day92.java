import java.util.Scanner;
public class Day92 {
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan nama: ");
    String nama = scanner.nextLine();

    System.out.print("Masukkan umur: ");
    int umur = scanner.nextInt();
    scanner.nextLine(); // Tambahkan ini untuk menghandle keyboard return

    System.out.print("Masukkan alamat: ");
    String alamat = scanner.nextLine();

    System.out.println("Nama: " + nama);
    System.out.println("Umur: " + umur);
    System.out.println("Alamat: " + alamat);
  }
}

    
