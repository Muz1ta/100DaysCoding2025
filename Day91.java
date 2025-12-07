import java.util.Scanner;
public class Day91 {
   
        public static void biodata (String nama, int umur){
            System.out.println("Nama : "+nama);
            System.out.println("Umur : "+umur);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            String nama = sc.nextLine();
            int umur = sc.nextInt();
            biodata(nama,umur);
    }
    }
