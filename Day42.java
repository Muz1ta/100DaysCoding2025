import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double tunjangan = 0;
        double hasil = 0;
        
        System.out.print("Masukkan Gaji Pokok :");
        double gaji = sc.nextDouble();
        sc.nextLine();
        System.out.print("Sudah Menikah (true/false) :");
        boolean nikah = sc.nextBoolean();
        
        if (nikah == true){
             tunjangan += gaji * 10/100;
            System.out.println("Tunjangan :"+tunjangan);
        }else if (nikah == false){
            tunjangan += gaji * 0/100;
            System.out.println("Tunjangan :"+tunjangan);
        }else{
            System.out.println("Tunjangan : 0");
        }
        double kotor = gaji + tunjangan;
        System.out.println("Gaji Kotor :"+kotor);
        
        if (kotor > 7000000 ){
            hasil += kotor * 12/100;
            System.out.println("Pajak : "+hasil);
        }else if (kotor <= 7000000){
             hasil += kotor * 8/100;
            System.out.println("Pajak : "+hasil);
        }else{
            System.out.println("Pajak : 0");
        }
        double be = gaji * 3/100;
        System.out.println("BPJS : "+be);
        
        double bersih = kotor - hasil -  be;
        System.out.println("Gaji Bersih : "+bersih);
        
        }
    }
