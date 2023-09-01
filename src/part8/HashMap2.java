package part8;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Double>> menu = new HashMap<>();
        ArrayList<Double> mohitoPrice = new ArrayList<>();
        mohitoPrice.add(350.0);
        mohitoPrice.add(15.50);
        mohitoPrice.add(13.20);
        menu.put("Коктейль Mojito", mohitoPrice);

        ArrayList<Double> tiramisuPrice = new ArrayList<>();
        tiramisuPrice.add(120.0);
        tiramisuPrice.add(4.00);
        tiramisuPrice.add(3.20);
        menu.put("Тирамису", tiramisuPrice);

        ArrayList<Double> ramenPrice = new ArrayList<>();
        ramenPrice.add(230.0);
        ramenPrice.add(8.50);
        ramenPrice.add(7.00);
        menu.put("Рамен", ramenPrice);

        System.out.println(menu);
    }
}
