public class methodReturn {
    public static int kalkulator(int value1, String operasi, int value2) {
        var penjumlahan = value1 + value2;
        var pengurangan = value1 - value2;
        var pembagian = value1 / value2;
        var perkalian = value1 * value2;
        switch (operasi) {
            case "+" : return penjumlahan;
            case "-" : return pengurangan;
            case "/" : return pembagian;
            case "*" : return perkalian;
            default  : return 0;
        }
    }
    public static void main(String[] args) {
        var result = kalkulator(100, "+asdf", 3);
        if (result == 0) {
            System.out.println("Operasi tidak valid");
        } else {
            System.out.println(result);
        }
    }
}
