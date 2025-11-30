public class Day84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int hasil = 1;
        
        for (int i = 1; i <= 10; i++) {
            hasil = i * n;
            System.out.println(i + " * " + n + " = " + hasil);
        }
        
    }
    
}
