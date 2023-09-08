public class switchJava {
    public static void main(String[] args){
        var tinggiBadan = 160;
        switch (tinggiBadan) {
            case 160:
            case 170:
                System.out.println("Tinggi Anda mencukupi");
                break;
            default:
            System.out.println("Tinggi Anda kurang");
                break;
        }
    }
}
