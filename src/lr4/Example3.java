package lr4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int i = in.nextInt(); //число для расчёта кол-ва строк

        System.out.print("Введите количество колонок: ");
        int j = in.nextInt(); //число для расчёта колонок

        int[][] arr = new int[i][j]; //создаём начальный массив

        for (int k = 0; k < i; k++){ //цикл для заполнения строк
            if(k != 0){System.out.println();}
            for (int l = 0; l < j; l++){ //цикл для заполнения колонок и вывода результата
                arr[k][l] = 2;
                System.out.print(arr[k][l]);
            }
        }
    }
}

//Напишите программу, в которой создается двумерный массив,
//который выводит прямоугольник из цифр 2;