package part7;

import java.util.ArrayList;

public class List10 {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(120.23);
        /*expenses.add(290.32);*/
        expenses.add(420.03);
        boolean isExp = expenses.contains(290.32);
        if (isExp == false) {
            expenses.add(1,290.32);
            System.out.println("Трата " + expenses.get(1) + " рублей доставлена!");
        } else {
            System.out.println("Все расходы учтены!");
        }
    }
}

