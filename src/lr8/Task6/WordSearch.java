package lr8.Task6;

import java.io.*;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        File folder = new File("src/lr8/Task6/Тексты");
        String[] fileList = folder.list();

        if (fileList.length != 0) {
            //Выводим список файлов в папке, если они есть
            System.out.println("Список файлов в папке:");
            int[] numbers = new int[fileList.length];
            //Цикл для вывода красивого списка файлов
            for (int i = 0; i < fileList.length; i++) {

                System.out.print(i + 1 + ". ");
                System.out.print(fileList[i] + "\n");
            }

            //Запрашиваем название файла
            System.out.println("\n" + "Введите имя или номер файла в списке, чтобы приступить к поиску слова:");
            Scanner in = new Scanner(System.in);
            String fileName1 = in.nextLine();

            //Находим все подходящие файлы по указанному имени
            File[] matchingFiles1 = folder.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.contains(fileName1);
                }
            });

            if (matchingFiles1.length == 1){ //Если нашли только один подходящий файл - приступаем к поиску слова
                System.out.println("Введите слово для поиска: ");




            } else if (matchingFiles1.length > 1) { //Если нашли несколько - выводим их список
                while (true) {
                    System.out.println("Подходящих файлов найдено " + matchingFiles1.length + " шт:");
                    //Выводим красивый список подходящих файлов
                    for (int i = 0; i < matchingFiles1.length; i++) {
                        System.out.print(i + 1 + ". ");
                        System.out.print(matchingFiles1[i] + "\n");
                    }
                    //Снова запрашиваем часть имени или номер файла из списка
                    System.out.println("\n" + "Введите название или номер файла в списке:");
                    String fileName2 = in.nextLine();

                    File[] matchingFiles2 = folder.listFiles(new FilenameFilter() {
                        @Override
                        public boolean accept(File dir, String name) {
                            return name.contains(fileName2);
                        }
                    });
                    if (matchingFiles2.length == 0) {
                        System.out.println("Файл не найден, попробуйте ещё раз.");
                        break;
                    } else if (matchingFiles2.length == 1) {//Если нашли только один подходящий файл - приступаем к поиску слова
                        System.out.println("Введите слово для поиска: ");



                    }
                }

            } else { //Если подходящих файлов не нашли, т.е. 0
                System.out.println("Файл не найден");
            }
        } else {
            System.out.println("В папке нет файлов. Добавьте файлы и повторите попытку");
        }


    }
}
