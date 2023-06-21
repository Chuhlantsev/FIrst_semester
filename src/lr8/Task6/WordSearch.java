package lr8.Task6;

import java.io.*;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        File folder = new File("src/lr8/Task6/Тексты");
        File[] fileList = folder.listFiles();
        String[] fileListString = folder.list();

        if (fileListString.length != 0) {
            //Выводим список файлов в папке, если они есть
            System.out.println("Список файлов в папке:");
            //Цикл для вывода красивого списка файлов + кладём номер п/п в массив
            for (int i = 0; i < fileListString.length; i++) {
                fileListString[i] = i + 1 + ". " + fileListString[i];
                System.out.print(fileListString[i] + "\n");
            }

            //Запрашиваем название файла
            System.out.println("\n" + "Введите имя или номер файла в списке, чтобы приступить к поиску слова:");
            Scanner in = new Scanner(System.in);
            String fileName1 = in.nextLine();

            //Находим все подходящие файлы по указанному имени
            int counter = 0;
            int numberOfFiles = 0;
            int finalFileNumber = 0;
            for (String id : fileListString) {
                counter++;
                if (id.contains(fileName1)) {
                    numberOfFiles++;
                    finalFileNumber = counter;
                }
            }
//            Находим все подходящие файлы по указанному имени
//            File[] matchingFiles1 = folder.listFiles(new FilenameFilter() {
//                @Override
//                public boolean accept(File dir, String name) {
//                    return name.contains(fileName1);
//                }
//            });
            if (numberOfFiles > 1) { //Если нашли несколько - выводим их список
                System.out.println("Подходящих файлов найдено " + numberOfFiles + " шт:");
                counter = 0;
                int matchingFilesCounter = 0;
                for (String id : fileListString) {
                    counter++;
                    if (id.contains(fileName1)) {
                        System.out.println(fileListString[counter - 1]);
                        matchingFilesCounter = counter;
                    }
                }

                while (true) {
//                    System.out.println("Подходящих файлов найдено " + numberOfFiles + " шт:");
//                    //Выводим красивый список подходящих файлов
//                    for (int i = 0; i < numberOfFiles; i++) {
//                        System.out.print(i + 1 + ". ");
//                        System.out.print(fileListString[i] + "\n");
//                    }

                    //Снова запрашиваем часть имени или номер файла из списка
                    System.out.println("\n" + "Введите номер файла в списке:");
                    int fileName2 = in.nextInt();
//                    File[] matchingFiles2 = folder.listFiles(new FilenameFilter() {
//                        @Override
//                        public boolean accept(File dir, String name) {
//                            return name.contains(fileName2);
//                        }
//                    });
                    if (fileName2 > matchingFilesCounter) {
                        System.out.println("Файл не найден, попробуйте ещё раз.");
//                        continue;
                    }
                    counter = 0;
                    numberOfFiles = 0;
                    finalFileNumber = 0;
                    for (String id : fileListString) {
                        counter++;
                        if (id.contains(Integer.toString(fileName2))) {
                            System.out.println("Вы выбрали файл " + fileListString[counter - 1]);
                            numberOfFiles++;
                            finalFileNumber = counter;
                        }
                    }
                    File finalFile = new File(String.valueOf(fileList[finalFileNumber - 1]));
                    String finalFileName = finalFile.getName();


                    break;
                }
            }
            if (numberOfFiles == 1) { //Если нашли только один подходящий файл - приступаем к поиску слова
                File finalFile = new File(String.valueOf(fileList[finalFileNumber - 1]));
//                String finalFileName = finalFile.getName();

                System.out.println("\n" + "Введите слово для поиска: ");
                Scanner word = new Scanner(System.in);
                word.nextLine();
                Scanner scanner = null;
                try {
                    scanner = new Scanner(finalFile);
                    int lineCount = 0;
                    while (scanner.hasNextLine()) {
                        if (word.equals(scanner.nextLine().split(" ", 0))) { //Никак не может проверить наличие слова в строке!
                            lineCount++;
                            System.out.println(scanner);
                            continue;
                        } else {
//                            System.out.println("Найдено " + lineCount + " строк с указанным словом.");
                            continue;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка при чтении файла: " + e.getMessage());
                }
            } else if (numberOfFiles == 0) { //Если не нашли подходящих файлов
                System.out.println("Файл не найден, попробуйте ещё раз.");
            }
        } else {
            System.out.println("В папке нет файлов. Добавьте файлы и повторите попытку");
        }
    }
}
