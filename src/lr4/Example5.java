package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][5]; //Создаём первый массив
        Random random = new Random(); //Вводим рандом

        System.out.println("Массив:");
        //Цикл для заполнения первого массива рандомными числами и вывод этого массива
        for (int i = 0; i < 3; i++){
            if(i != 0){System.out.println();}
            for (int j = 0; j < 5; j++){
                arr1[i][j] = random.nextInt(100); //Заполняем массив рандоными числами
                System.out.print(arr1[i][j] + " "); //Выводим массив
            }
        }
        System.out.println("\n\nПеревёрнутый массив: ");
        int[][] arr2 = new int[arr1[0].length][arr1.length]; //Создаём новый массив

        //Цикл для заполнения второго массива
        for (int i = 0; i < arr1.length; i++) {
            //if (i != 0){System.out.println();}
            for (int j = 0; j < arr1[i].length; j++) {
                arr2[j][i] = arr1[i][j]; //Заполняем массив обратными данными первому массиву
                //System.out.println(arr2[i][j] + " "); //Выводим второй массив
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Напишите программу, в которой создается двумерный целочисленный массив. Он заполняется случайными числами.
//Затем в этом массиве строки и столбцы меняются местами: первая строка становится первым столбцом,
//вторая строка становится вторым столбцом и так далее.
//Например, если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив из 5 строк и 3 столбцов.