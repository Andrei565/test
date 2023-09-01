package part4;

public class Tip {
    public  static  void  main(String[] args) {
        int integerNumber = 500;
        checkMethod((byte) integerNumber);
    }
    public  static void checkMethod(byte importantSmallNumber) {
        System.out.println("Метод работает");
        System.out.println(importantSmallNumber);
    }
}
