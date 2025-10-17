import java.util.Scanner;

public class latihan55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan angka pertama : ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka2 = sc.nextInt();
        System.out.print("Pilih operasi (*,/,+,-) : ");
        String op = sc.next();
        
        if (op.equals("*")){
             System.out.print("Hasil "+angka1 + " x " + angka2+ " : "+ (angka1 * angka2));
        }else if (op.equals("/")){
          if (angka2 != 0){
            System.out.print("Hasil "+angka1 + " : " + angka2+ " : "+ (angka1 / angka2));
          }else{
            System.out.print("Eror ");
          }
        }else if (op.equals("+")){
            System.out.print("Hasil "+angka1 + " + " + angka2+ " : "+ (angka1 + angka2));
        }else if (op.equals("-")){
            System.out.print("Hasil "+angka1 + " - " + angka2+ " : "+ (angka1 - angka2));
        }else{
            System.out.print("Tidak Valid");
          
        }
       
    }
}
