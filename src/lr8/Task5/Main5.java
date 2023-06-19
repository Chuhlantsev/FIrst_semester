package lr8.Task5;

import java.io.*;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String fileName = in.nextLine();

        try {
            //Создаём файл
            File file1 = new File("src/lr8/Task5/" + fileName);
            file1.createNewFile(); //Файл создан
            System.out.println("Полный путь до файла: " + file1.getAbsolutePath());
            System.out.println("Введите количество строк для записи в файл: ");
            int n = in.nextInt();

            //Создаём поток для записи с учётом типа данных - DataOutputStream,
            // ему в качетсве аргумента передаётся поток FileOutputStream(file1)
            DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(file1));
            in.nextLine(); // очистка буфера
            for (int i = 0; i < n; i++){
                System.out.println("Введите строку для записи в файл: ");
                String s = in.nextLine();
                dataOut.writeUTF(s + "\n"); //запись в отдельные строки
            }
            dataOut.flush(); //Дописываем данные на диск
            dataOut.close(); //Закрываем поток
            //Чтение и вывод данных из созданного файла
            DataInputStream dataIn = new DataInputStream(new FileInputStream(file1));
            while (true){
                System.out.print(dataIn.readUTF());
            }
        } catch (Exception e){
            System.out.println("" + e);
        }
    }
}
