public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int array[] = {50,60,39,20,34};
        System.out.print("Cari : ");
        int n = inp.nextInt();
        boolean hasil = true;
        for (int i = 0; i < array.length; i++) {
            if(n == array[i]){
                hasil = true;
                break;
            }else{
                hasil = false;
            }
        }
        System.out.println(hasil);
