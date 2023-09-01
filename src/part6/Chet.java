package part6;

public class Chet {
    public static void main(String[] args) {
        int numberToCheck = 11;
        isEven(numberToCheck);
    }

    public static void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " - четное");
        } else {
            System.out.println((number + " - нечетное"));
        }
    }
}
