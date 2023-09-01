package part5;

public class var {
    public static void main(String[] args) {
        Integer number = 7;
        changeVariable(number);
        System.out.println(number);

    }
    private static void changeVariable(Integer variable) {
        Integer newValue = variable + 10;
        variable = newValue;
    }
}
