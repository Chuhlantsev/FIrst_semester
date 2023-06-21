package lr9.Task2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int[][] matrix = new int[3][5];

            //Запрашиваем элементы массива
            System.out.println("Введите данные для массива:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++){
                    matrix[i][j] = in.nextInt();
                }
            }

            System.out.println("Введите номер столбца для вывода:");
            int col = in.nextInt();

            //Вывод столбца
            System.out.println("Столбец " + col + ":");
            for (int i = 0; i < 3; i++) {
                System.out.println(matrix[i][col]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введённые данные не являются числом");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенные данные не являются целым числом");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: такого столбца не существует");
        }
    }
}
