package part8;
import java.util.HashMap;

public class HashMap5 {
    public static void main(String[] args) {
        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("S234", "Большой степлер");
        officeTool.put("P342", "Черно-белый принтер");
        officeTool.put("N845", "Острые ножницы");

        for (String tool : officeTool.values()) {
           // if (tool.equals("Острые ножницы")) {
                System.out.println(tool);
            //}
        }
    }
}
