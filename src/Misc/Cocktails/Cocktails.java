package Misc.Cocktails;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cocktails {
    public static void main(String[] args) {
        try {
            //Получаем HTML-код страницы
            File file = new File("C:\\Users\\Dezmo\\Desktop\\Cocktails\\1.html");
            Document doc = Jsoup.parse(file, "UTF-8", "https://giftdev.ru/");

// Получение элементов coc-card__name
            Elements names = doc.getElementsByClass("coc-card__name");

            // Создание списка для хранения данных
            List<Drink> drinks = new ArrayList<>();

            // Для каждого элемента coc-card__name сохраняем соответствующие элементы coc-card__ingredient и coc-card__quantity
            for (Element name : names) {
                Drink drink = new Drink();
                drink.setName(name.text());
                Element parent = name.parent();
                Elements ingredients = parent.getElementsByClass("coc-card__ingredient");
                Elements quantities = parent.getElementsByClass("coc-card__quantity");

                List<String> ingredientList = new ArrayList<>();
                List<String> quantityList = new ArrayList<>();

                for (int i = 0; i < ingredients.size(); i++) {
                    Element ingredient = ingredients.get(i);
                    Element quantity = quantities.get(i);
                    ingredientList.add(ingredient.text());
                    quantityList.add(quantity.text());
                }

                drink.setIngredients(ingredientList);
                drink.setQuantities(quantityList);

                drinks.add(drink);
            }

            // Создание объекта Gson
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Преобразование списка в JSON
            String json = gson.toJson(drinks);

            // Запись JSON в файл
            FileWriter writer = new FileWriter("C:\\Users\\Dezmo\\Desktop\\Cocktails\\Коктейли.json");
            writer.write(json);
            writer.close();

            System.out.println("Данные успешно сохранены в Коктейли.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
