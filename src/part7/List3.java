package part7;

import java.util.ArrayList;

public class List3 {
    public static void main(String[] args) {
        ArrayList<String> femaleNames = new ArrayList<>();
        femaleNames.add("Екатерина");
        femaleNames.add("Мария");
        femaleNames.add("Анна");
        femaleNames.add(0, "Наталья");
        System.out.println(femaleNames);

    }
}
