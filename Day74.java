import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int pilih;
        
        do {
            System.out.println("MENU");
            System.out.println("1. Merah");
            System.out.println("2. Kuning");
            System.out.println("3. Pink");
            System.out.println("4. Keluar");
            
            System.out.print("Pilih menu : ");
           pilih = sc.nextInt();
           
           switch (pilih){
               case 1 :
                   System.out.println("Merah");
                   break;
                   
               case 2 :
                   System.out.println("Kuning");
                   break;
                   
               case 3 :
                   System.out.println("Pink");
                   break;
                   
               case 4 :
                   System.out.println("Keluar");
                   break;
                   
               default :
                   System.out.println("Not Valid");
           
           }
        } while (pilih != 4);
    }
}
