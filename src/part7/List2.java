package part7;

import java.util.ArrayList;

public class List2 {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(120.43);
        expenses.add(290.34);
        expenses.add(420.1);
        expenses.add(1,100.0);
        System.out.println(expenses);
    }
}
