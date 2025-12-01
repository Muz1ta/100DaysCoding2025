public class Day85 {
    public static void main(String[] args) {
        int angka [] = {3,7,37,73,27};
        int max = angka[0];
        
        System.out.print("Angka Array : ");
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > max){
                max = angka[i];
            }
            System.out.print(angka[i]+" ");
        }
        System.out.println("\nNilai Maxsimal : "+max);
    }
}
