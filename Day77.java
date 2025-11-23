public class Day77 {
    public static void main(String[] args) {
        String nama = "Muzita Ainung";
        
        String sub = nama.substring(3,7);
        String rep = nama.replace("Ainung", "Reski");
        String tri = nama.trim();
      
        System.out.println(sub);
        System.out.println(rep);
        System.out.println(tri);
    }
    
}
