public class forEach {
    public static void main(String[] args) {
        //Mengakses array menggunakan for loop
        String[] namaku = {"Adnan ", "Tri ", "Handoko"};
        for (int i = 0; i < namaku.length; i++) {
            System.out.println(namaku[i]);
        }

        System.out.println("Menggunakan ForEach");
        //Mengakses array menggunakan forEach
        for (String nama : namaku) {
            System.out.println(nama);
        }
    }
}