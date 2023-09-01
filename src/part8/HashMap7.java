package part8;

import java.util.HashMap;

public class HashMap7 {
    public static void main(String[] args) {
        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("S234", "Большой степлер");
        officeTool.put("P342", "Черно-белый принтер");
        officeTool.put("N845", "Острые ножницы");

        for (String inventory : officeTool.keySet()) {
            // if (tool.equals("Острые ножницы")) {
            System.out.println(inventory);
            //}
        }
    }
}
