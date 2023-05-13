package lr5.Example2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Example2 example2 = new Example2();

        System.out.println("Введите первый символ:");
        String str1 = in.nextLine();
        char char1 = str1.charAt(0);
        example2.setCh1(char1);

        System.out.println("Введите второй символ:");
        String str2 = in.nextLine();
        char char2 = str2.charAt(0);
        example2.setCh2(char2);

        System.out.print("Список символов от " + example2.getCh1() + " до " + example2.getCh2() + ": ");
        example2.getAllChars();
    }
}

//Напишите программу с классом, у которого есть два символьных поля и метод.
// Он возвращает результат, и у него нет аргументов.
// При вызове метод выводит в консольное окно все символы из кодовой таблицы, которые находятся «между» символами,
// являющимися значениями полей объекта (из которого вызывается метод).
// Например, если полям объекта присвоены значения ‘A’ и ‘D’, то при вызове метода в консольное окно
// должны выводиться все символы от ‘A’ до ‘D’ включительно.