public class Day86 {
    public static void main(String[] args) {
        int angka [] = {3,7,37,73,27};
        int min = angka[0];
        
        System.out.print("Isi Array : ");
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] < min){
                min = angka[i];
            }
            System.out.print(angka[i]+" ");
        }
        System.out.println("\nAngka Minimum : "+min);
    }
}
