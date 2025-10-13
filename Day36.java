import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        menentukan keadaan air berdasarkan suhu
         System.out.print("Masuukan suhu : ");
         int suhu = sc.nextInt();
         
         if (suhu <= 0){
             System.out.println("Beku");
         }else{
             if(suhu < 100 ){
                 System.out.println("Cair");
             }else{
                 System.out.println("Mendidih");
             }
         }
    }
}
