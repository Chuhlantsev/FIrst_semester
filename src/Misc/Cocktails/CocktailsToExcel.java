package Misc.Cocktails;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CocktailsToExcel {
    public static void main(String[] args) {
        try {
            // Загрузка HTML-страницы
            File file = new File("C:\\Users\\chuhlantsev\\Desktop\\Коктейли\\1.html");
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

            // Создание нового документа Excel
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Cocktails");

            // Создание заголовков столбцов
            Row headerRow = sheet.createRow(0);
            Cell ingredientHeader = headerRow.createCell(0);
            ingredientHeader.setCellValue("Ингредиент");
            Cell cocktailHeader = headerRow.createCell(1);
            cocktailHeader.setCellValue("Коктейли");
            Cell quantityHeader = headerRow.createCell(2);
            quantityHeader.setCellValue("Количество");

            // Заполнение данными
            int rowNum = 1;
            for (Drink drink : drinks) {
                List<String> ingredients = drink.getIngredients();
                List<String> quantities = drink.getQuantities();

                for (int i = 0; i < ingredients.size(); i++) {
                    Row row = sheet.createRow(rowNum);

                    Cell ingredientCell = row.createCell(0);
                    ingredientCell.setCellValue(ingredients.get(i));

                    Cell cocktailCell = row.createCell(1);
                    cocktailCell.setCellValue(drink.getName());

                    Cell quantityCell = row.createCell(2);
                    quantityCell.setCellValue(quantities.get(i));

                    rowNum++;
                }
            }

            // Автоматическая ширина столбцов
            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);

            // Запись в xlsx-файл
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\chuhlantsev\\Desktop\\Коктейли\\Коктейли.xlsx");
            workbook.write(fileOut);
            fileOut.close();

            System.out.println("Данные успешно сохранены в Коктейли.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
