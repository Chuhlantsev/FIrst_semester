package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int[][] array = new int[5][10]; //Создаём массив
        Random random = new Random(); //Создаём объект рандома

        System.out.println("Исходный массив:");
        //Заполняем массив случайными числами до 100 и выводим в виде матрицы
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // создаем копию массива с удаленной строкой и столбцом
        int[][] arrayCopy = new int[array.length - 1][array[0].length - 1];
        int rowToDelete = random.nextInt(array.length); // выбираем случайную строку для удаления
        int colToDelete = random.nextInt(array[0].length); // выбираем случайный столбец для удаления
        int copyRow = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == rowToDelete) {
                continue; // пропускаем строку, которую нужно удалить
            }
            int copyCol = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (j == colToDelete) {
                    continue; // пропускаем столбец, который нужно удалить
                }
                arrayCopy[copyRow][copyCol] = array[i][j];
                copyCol++;
            }
            copyRow++;
        }

        //Выводим новый массив с указанием удалённой
        System.out.println("\nКопия массива с удаленной строкой " + (rowToDelete + 1) + " и столбцом " + (colToDelete + 1) + ":");
        for (int i = 0; i < arrayCopy.length; i++){
            for (int j = 0; j < arrayCopy[i].length; j++){
                System.out.print(arrayCopy[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

//Напишите программу, в которой создается и инициализируется двумерный числовой массив.
//Затем из этого массива удаляется строка и столбец (создается новый массив, в котором по сравнению с исходным
//удалена одна строка и один столбец). Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью
//генератора случайных чисел.