package lr8.Task1.example3;

import java.io.*;
import java.util.Scanner;

public class CharStreamExample_console {
    public static void main(String[] args) {
        String fileName = "src/lr8/Task1/example3/example_file.txt";
        String data;

        //Чтение данных с консоли
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите данные для записи в файл:");
            data = consoleReader.readLine();
            System.out.println("Полученные данные: " + data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Запись данных в файл
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

        //Чтение данных из файла
        try (FileReader reader = new FileReader(fileName)) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        //Удаление файла
        if (new File(fileName).delete()) {
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось отправить файл: " + fileName);
        }
    }
}
