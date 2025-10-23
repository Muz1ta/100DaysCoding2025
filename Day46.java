import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //menu menggunakan switch case
        
        int harga = 0;
        int total = 0;
        
        System.out.println("==== KEDAI MUZ =====");
        System.out.println("1. Pisang Nugget :Rp.5000/porsi");
        System.out.println("2. Salad Buah    :Rp.10.000/porsi");
        System.out.println("3. Mochimi       :Rp.8000/pcs");
        System.out.println("4. Donat Topping :Rp.15000/porsi");
        System.out.print("Pilih menu : ");
        int menu = sc.nextInt();
        
        switch (menu){
            case 1 :
                System.out.print("Jumlah pembelian :");
                int jumlah = sc.nextInt();
                harga += 5000;
                total = harga * jumlah;
                System.out.println("Anda Membeli "+jumlah+" porsi Pisang Nugget");
                System.out.println("Total bayar :"+total);
                break;
        
            case 2 :
                System.out.print("Jumlah pembelian :");
                jumlah = sc.nextInt();
                harga += 10000;
                total = harga * jumlah;
                System.out.println("Anda Membeli "+jumlah+" porsi Salad Buah");
                System.out.println("Total bayar :"+total);
                break;
                
            case 3 :
                System.out.print("Jumlah pembelian :");
                jumlah = sc.nextInt();
                harga += 8000;
                total = harga * jumlah;
                System.out.println("Anda Membeli "+jumlah+" pcs Mochimi");
                System.out.println("Total bayar :"+total);
                break;
                
            case 4 :
                System.out.print("Jumlah pembelian :");
                jumlah = sc.nextInt();
                harga += 15000;
                total = harga * jumlah;
                System.out.println("Anda Membeli "+jumlah+" porsi Donat Topping");
                System.out.println("Total bayar :"+total);
                break;
                
            default :
                System.out.println("TIDAK VALID");
                
        }
        System.out.println("Enjoy your meal !!!");
    }
    
}
