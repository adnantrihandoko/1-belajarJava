public class breakLoop {
    public static void main(String[] args){
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke " + counter);
            if(counter >=2){
                break;
            };
            counter++;
        }
    }
}
