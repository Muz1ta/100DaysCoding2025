import java.util.Scanner;
public class Day21 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("a mula = ");
        byte a = sc.nextByte();
        System.out.print("b mula = ");
        byte b = sc.nextByte();
        
        a =(byte) (a + b);
        b =(byte) (a - b);
        a =(byte) (a - b);
        
        System.out.println("a setelah = " + a);
        System.out.println("b setelah = " + b);
    
}
}
