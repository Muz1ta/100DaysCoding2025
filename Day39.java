package day;

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Manu Kedai MUZ : ");
        System.out.println("1. Food ");
        System.out.println("2. Drink ");
        System.out.println("3. Dessert ");
        System.out.println("4. Done");
       
        
        System.out.print("Menu : ");
        int pilih = sc.nextInt();
        
        if (pilih == 1){
            System.out.println("Chhose Food : ");
            System.out.println("1. Fried Rice ");
            System.out.println("2. Fried Noodles ");
            System.out.println("3. Mixed Rice ");
            int food = sc.nextInt();
            
            if (food == 1){
                System.out.println("Fried Rice ");
            }else if (food == 2){
           System.out.println("Fried Noodles ");
            }else if (food == 3){
                System.out.println("Mixed Rice ");
            }else{
                System.out.println("NOT AVAILABLE");
                
            }
            
            System.out.print("Order Menu  : ");
        int pilihh = sc.nextInt();
        
        if (pilihh == 2){
            System.out.println("Choose Drink : ");
            System.out.println("1. Le Mineral");
            System.out.println("2. Avocado Juice");
            System.out.println("3. Orange Juice");
            System.out.println("4. Ice Tea");
            int drink = sc.nextInt();
            
            if (drink == 1){
                System.out.println("Le Mineral ");
            }else if (drink == 2){
                System.out.println("Avocado Juice ");
            }else if (drink == 3){
                System.out.println("Orange Juice ");
            }else if (drink == 4){
                System.out.println("Ice Tea ");
            }else{
                System.out.println("NOT AVAILABLE");
            }
            System.out.println("Order Menu : ");
            int pilihhh = sc.nextInt();
            
            if (pilihhh == 3){
                System.out.print("Choose Dessert : ");
                System.out.println("1. Pudding ");
                System.out.println("2. Banana Nugget Toping ");
                System.out.println("3. Mini Brownies ");
                System.out.println("4. Fruit Salad ");
                int des = sc.nextInt();
            if (des == 1){
                System.out.println("Pudding");
            }else if (des == 2){
                System.out.println("Banana Nugget Toping");
            }else if (des == 3){
                System.out.println("Mini Brownies");
            }else if (des == 4){
                System.out.println("Fruit Salad");
            }
        
                }else if (pilih == 4 ){
                        System.out.println("Close");
                
    }else{
            System.out.println("UNAVAILABLE");
}
         System.out.println("THANKYOU FOR YOUR ORDER AND ENJOY YOUR MEAL");
}   
}
    }
}
