package part6;

public class d {

    public static void main(String[] args) {
        int a = 13;
        int b = 3;

        a = a + 1;
        int c = a % b;
        b = b + 1;
        a = a - c;

        /*a = ++a - a % b++;*/
        System.out.println(a + " и " + b);
    }
} /*a = ++a - a % b++;*/
