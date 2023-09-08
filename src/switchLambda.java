public class switchLambda {
    public static void main(String[] args){
        var adalah_Huruf = "satu";
        switch (adalah_Huruf) {
            case "satu" -> System.out.println("Aku data huruf");
            default -> {System.out.println("Aku bukan data huruf");}
        }
    }
}