package part7;
import java.util.ArrayList;

public class List9 {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(120.23);
        expenses.add(290.32);
        expenses.add(420.03);
        expenses.clear();
        if (expenses.isEmpty()) {
            System.out.println("Нет сохраненных трат");
        } else {
            System.out.println("Трат в списке - " + expenses.size());
        }
    }
}
