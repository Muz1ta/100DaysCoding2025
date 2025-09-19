import java.util.Scanner;
public class Day12 {
    public static void main(String[] args){
    Scanner muz = new Scanner(System.in);
        
        System.out.print("Nama Lengkap : " );
        String nama = muz.nextLine();
        System.out.print("Nama Panggilan : ");
        String nm = muz.nextLine();
        System.out.print("Tempat");
        String tempt = muz.nextLine();
        System.out.print("Tanggal lahir : ");
        String tgl = muz.nextLine();
        System.out.print("Makanan Fav : ");
        String fav = muz.nextLine();
        
        System.out.println("==========================BIODATA==============================");
        
        System.out.println("Nama lengkap : " + nama);
        System.out.println("Nama Panggilan : " + nm);
        System.out.println("Tempat,Tanggal lahir : " + tempt + tgl );
        System.out.println("Makanan Favorite : " + fav);
        
        
}
}
