public class Day13 {
    public static void main(String[] args) {
        System.out.println("Variabel sebelum update");
        char a = '&';
        char b = '$';
        char c = '@';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        System.out.println("Variabel setelah update");
        char temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}
