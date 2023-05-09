package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        //Добавляем сканер
        Scanner in = new Scanner(System.in);

        //Получаем текст на вход
        System.out.println("Введите текст для шифрования");
        String value = in.nextLine();

        //Получаем ключ для шифрования
        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();

        //Объявляем массивы символов и вспомогательный для ключа
        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        System.out.println("chars до преобразования" + Arrays.toString(chars));

        //Цикл шифрования символов
        for(int i = 0; i < chars.length; i ++){
            ints[i] = chars[i] + key;
        }

        System.out.println("ints после преобразования" + Arrays.toString(ints));

        //Цикл для записи значений символов
        for(int i = 0; i < chars.length; i ++){
            chars[i] = (char) ints[i];
        }

        System.out.println("chars после преобразования" + Arrays.toString(chars));

        //Преобразуем массив символов в строку
        System.out.println(String.copyValueOf(chars));

    }
}
