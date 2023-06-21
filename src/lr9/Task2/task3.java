package lr9.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte[] biteMe = null;
        int sum = 0;

        try {
            biteMe = new byte[5];
            //Запрашиваем элементы массива
            System.out.println("Введите данные для массива:");
            for (int i = 0; i < biteMe.length; i++) {
                biteMe[i] = in.nextByte();
            }

            //Вычисляем сумму элементов массива
            for (int i = 0; i < biteMe.length; i++) {
                if (biteMe[i] > 0) {
                    sum += biteMe[i];
                }
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Ошибка: введённые данные не могут быть преобразованы в byte");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива");
        }
        if (biteMe != null) {
            System.out.println("Сумма элементов массива: " + sum);
        }
    }
}
