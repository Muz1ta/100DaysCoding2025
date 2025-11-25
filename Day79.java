import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "";
        String password = "";
        
        System.out.println("Buat Akun");
        System.out.print("Masukkan username: ");
        username = sc.nextLine();
        System.out.print("Masukkan password: ");
        password = sc.nextLine();
      
        boolean loginBerhasil = false;
        while (!loginBerhasil) {
            System.out.println("Login ke Akun");
            System.out.print("Masukkan username: ");
            String inputUsername = sc.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = sc.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Berhasil Login");
                loginBerhasil = true;
            } else {
                System.out.println("Username atau password tidak valid, coba lagi.");
            }
        }
    }
}
