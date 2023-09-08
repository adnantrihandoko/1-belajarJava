public class yieldSwitch {
    public static void main(String[] args){
        var nilai = "o";
        var ucapan = switch (nilai){case "a": yield "Kamu lulus ya"; default: yield "Maaf kamu tidak lulus";};
        System.out.println(ucapan);
    }
}