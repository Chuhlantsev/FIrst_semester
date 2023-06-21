package lr9.Task2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int[] ints = new int[5]; //Создаём массив

            //Запрашиваем элементы массива
            System.out.println("Введите данные для массива:");
            for (int i = 0; i < ints.length; i++) {
                ints[i] = in.nextInt();
            }

            // Вычисление среднего значения
            int sum = 0;
            int count = 0;
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] > 0) {
                    sum += ints[i];
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Отсутствуют положительные элементы в массиве");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение: " + average);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введённые данные не являются числом");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенные данные не являются целым числом");
        } catch (NullPointerException e) {
            System.out.println("Ошибка: массив не был инициализирован");
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка: не были введены значения");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

// В программе, вычисляющей среднее значение среди положительных элементов одномерного массива (тип элементов int),
// вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//–	ввод строки вместо числа;
//–	несоответствие числового типа данных;
//–	положительные элементы отсутствуют.