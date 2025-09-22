import java.util.Scanner;
public class Day15 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int a,b,hasil;
        
        System.out.print("A = ");
        a = sc.nextInt();
        System.out.print("B = ");
        b = sc.nextInt();
        hasil = (a + b);
        System.out.println("A + B = " + hasil);
        
        System.out.print("A = ");
        a = sc.nextInt();
        System.out.print("B = ");
        b = sc.nextInt();
        hasil = (a - b);
        System.out.print("A - B = " + hasil);
        
        
    }
}
