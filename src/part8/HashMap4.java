package part8;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMap4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> orders = new HashMap<>();

        ArrayList<Integer> ordersNum = new ArrayList<>();
        ordersNum.add(1);
        ordersNum.add(5);
        ordersNum.add(6);
        orders.put("Иван И. ", ordersNum);

        ordersNum = new ArrayList<>();
        ordersNum.add(2);
        ordersNum.add(4);
        ordersNum.add(3);
        orders.put("Ольга С. ", ordersNum);

        ArrayList<Integer> customerOrders = orders.get("Ольга С. ");

        for (int orderNum : customerOrders) {
            System.out.println("Заказ № " + orderNum);
        }
    }
}
