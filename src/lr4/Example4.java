package lr4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину высоты треугольника: ");
        int i = in.nextInt(); //число для расчёта кол-ва строк

        System.out.print("Введите длину основания треугольника: ");
        int j = in.nextInt(); //число для расчёта колонок

        char[][] arr = new char[i][j]; //сздаём начальный массив

        for (int k = 0; k < i; k++){ //цикл для заполнения строк
            if(k != 0){System.out.println();}
            for (int l = 0; l < arr[k].length; l++){ //цикл для заполнения колонок и вывода результата
                arr[k][l] = '+';
                System.out.print(arr[k][l]);
            }
        }
    }
}

//Напишите программу, в которой создается двумерный массив,
//который выводит прямоугольный треугольник