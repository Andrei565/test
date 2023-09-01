package part7;
import java.util.ArrayList;

public class List8 {
    public static void main(String[] args) {
        ArrayList<Integer> speeds = new ArrayList<>();
        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        int sum = 0;
        for (Integer speed : speeds) {
            sum = sum + speed;
        }
        int averageSpeed = sum / speeds.size();
        int proverka = 120+75+42+60+110+20;
        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч" + (proverka/6));
    }
}
