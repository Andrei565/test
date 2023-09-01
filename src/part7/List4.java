package part7;
import java.util.ArrayList;

public class List4 {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        System.out.println("Размер списка: " + expenses.size() + " значений");
        expenses.add(120.43);
        System.out.println("Размер списка: " + expenses.size() + " значений");
        expenses.add(290.5);
        System.out.println("Размер списка: " + expenses.size() + " значений");
        expenses.add(420.49);
        System.out.println("Размер списка: " + expenses.size() + " значений");
    }
}