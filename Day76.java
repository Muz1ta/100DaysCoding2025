public class Day76 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        boolean banding = a.equals(b);
        System.out.println(banding);
        
        boolean banding2 = a.equalsIgnoreCase(b);
        System.out.println(banding2);
        
        boolean contain = a.contains(b);
        System.out.println(contain);
        
        boolean empty = a.isEmpty();
        System.out.println(empty);
        

    }
}
