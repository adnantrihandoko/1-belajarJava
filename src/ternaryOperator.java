public class ternaryOperator {
    public static void main(String[] args){
        var tinggiBadan = 159;
        var lulus = tinggiBadan>170 ? "Selamat Kamu Lulus!" : tinggiBadan>165 ? "Selamat Kamu lulus untuk wanita" : "Minum susu lagi ya";
        System.out.println(lulus);
    }
}
