package part5;

public class xxx {
    public static void main(String[] args) {
        Byte x = 7;
        x = changeX(x);
        System.out.println(x);
    }

    private static Byte changeX(Byte x) {
        Byte newX = (byte) (x*2);
        return newX;
    }
}
