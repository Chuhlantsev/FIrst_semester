package Misc.Cocktails;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class CocktailsJSONParser {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("C:\\Users\\Dezmo\\Desktop\\Cocktails\\Коктейли.json"));
            JSONObject jsonObject1 = (JSONObject) obj;
//            System.out.println("Корневой элемент: "
//                    + jsonObject.keySet().iterator().next());
            JSONObject jsonObject2 = (JSONObject) jsonObject1.get("Data");
            JSONArray jsonArray = (JSONArray) jsonObject2.get("Rows");

            double sum = 0;
            for (Object o : jsonArray) {
                JSONObject row = (JSONObject) o;
                System.out.println("\nТекущий элемент: " + row.get("ProductId"));
                System.out.println("Закупочная сумма: " + row.get("Misc.TotalBuySum"));
                sum = sum + ((double) row.get("Misc.TotalBuySum"));
//                System.out.println("Автор: " + row.get("author"));
//                System.out.println("Год издания: " + row.get("year"));
            }
            System.out.println("\nОбщая сумма по накладной: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
