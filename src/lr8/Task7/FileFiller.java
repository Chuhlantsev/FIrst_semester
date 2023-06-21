package lr8.Task7;

import java.io.*;
import java.util.Scanner;

public class FileFiller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String fileName = "src/lr8/Task7/" + in.nextLine();
        String data;

        //Чтение данных с консоли
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите текст для записи в файл:");
            data = consoleReader.readLine();
            System.out.println("Полученные данные: " + data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Запись данных в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
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
            System.out.println("Количество символов: " + charRead);
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

// Создайте приложение, которое будет запрашивать у пользователя название файла и текст,
// который нужно записать в этот файл.
// После записи текста в файл программа должна выводить на экран количество
// записанных символов.