import java.util.Scanner;
public class Day98{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("input n: ");
        int n = x.nextInt();
        int a = 0;
        int b = 1;

        System.out.print("Deretan Fibonacci: ");
        for (int i = 0; a <= n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
