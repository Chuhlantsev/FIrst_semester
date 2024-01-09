package lr10.Task1.ex1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class CreateXMLFile {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            //Создание корневого элемента
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Library");
            doc.appendChild(rootElement);

            //Добавление первой книги
            Element book1 = doc.createElement("book");
            rootElement.appendChild(book1);

            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("Война и Мир"));
            book1.appendChild(title1);

            Element author1 = doc.createElement("author");
            author1.appendChild(doc.createTextNode("Лев Толстой"));
            book1.appendChild(author1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("1869"));
            book1.appendChild(year1);

            //Добавление второй книги
            Element book2 = doc.createElement("book");
            rootElement.appendChild(book2);

            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("Мастер и Маргарита"));
            book2.appendChild(title2);

            Element author2 = doc.createElement("author");
            author2.appendChild(doc.createTextNode("Михаил Булгаков"));
            book2.appendChild(author2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("1967"));
            book2.appendChild(year2);

            boolean is_New_Book_Needed = true;

            while (is_New_Book_Needed) {

                //Добавление книги от пользователя
                Element bookFromUser = doc.createElement("book");
                rootElement.appendChild(bookFromUser);

                System.out.println("Укажите название книги:");
                Scanner in1 = new Scanner(System.in);
                String titleInput = in1.nextLine();

                Element titleFromUser = doc.createElement("title");
                titleFromUser.appendChild(doc.createTextNode(titleInput));
                bookFromUser.appendChild(titleFromUser);

                System.out.println("Кто автор книги?");
                Scanner in2 = new Scanner(System.in);
                String authorInput = in2.nextLine();

                Element authorFromUser = doc.createElement("author");
                authorFromUser.appendChild(doc.createTextNode(authorInput));
                bookFromUser.appendChild(authorFromUser);

                System.out.println("В каком году вышла книга?");
                Scanner in3 = new Scanner(System.in);
                String yearInput = in3.nextLine();

                Element yearFromUser = doc.createElement("year");
                yearFromUser.appendChild(doc.createTextNode(yearInput));
                bookFromUser.appendChild(yearFromUser);

                System.out.println("Добавить ещё книгу? (Да/Нет)");
                Scanner in4 = new Scanner(System.in);
                String answer = in4.nextLine();

                switch (answer) {
                    case "Да":
                        break;
                    case "Нет":
                        is_New_Book_Needed = false;
                        break;
                    default:
                        System.out.println("Введён некорректный ответ. Добавьте следующую книгу.");
                        break;
                }
            }

            //Запись xml-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result =
                    new StreamResult(new File("src/lr10/Task1/ex1/example.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
