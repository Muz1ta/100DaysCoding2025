import java.util.*;
public class Day100 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        String cantik = in.nextLine();
        char[] split = cantik.toCharArray();
        boolean M = false;
        boolean Z = false;
        boolean T = false;
        for (int i = 0; i < split.length; i++) {
            if (split[i] == 'I') {
                M = true;

            }
            if (M == true && split[i] == 'S') {
                T = true;

            }
            if (T == true && split[i] == 'C') {
                Z = true;

            }

        }
        if (M && Z && T) {
            System.out.println("CANTIK");

        } else {
            System.out.println("TDK CANTIK");
        }

    }
}
