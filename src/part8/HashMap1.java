package part8;
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,String> statesCapitals = new HashMap<>();
        statesCapitals.put("Канада", "Торонто");
        statesCapitals.put("Ирак", "Багдад");
        statesCapitals.put("Австрия", "Вена");
        statesCapitals.put("Канада", "Оттава");

        System.out.println(statesCapitals);
    }
}
