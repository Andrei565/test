package part6;

public class bol {
    private static boolean checkZeroOrNegative(int number) {
        boolean isPositive = number > 0;
        return !(isPositive);
    }
    public static void main(String[] args) {
        System.out.println(checkZeroOrNegative(1));
    }
}
