package lr4;

public class Example4 {
    public static void main(String[] args) {
        int n = 5; // количество строк в треугольнике
        char[][] triangle = new char[n][n]; // создаем двумерный массив символов

        // заполняем массив символами "+"
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '+';
            }
        }

        // выводим треугольник в консоль
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Напишите программу, в которой создается двумерный массив,
//который выводит прямоугольный треугольник