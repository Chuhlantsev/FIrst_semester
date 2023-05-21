package lr6.Task5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Введите число, до которого считаем сумму квадратов:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        number = squareSum(number);
        System.out.println("Сумма квадратов = " + number);
    }

    public static int squareSum(int n){
        int num = 0;
        for (int i = 1; i <= n; i++){
            num += Math.pow(i,2);
        }
        return num;
    }
}

//Напишите программу со статическим методом, которым вычисляется сумма квадратов
//натуральных чисел 1^2 + 2^2 + 3^2 + ... + п^2. Число п передается аргументом методу. Для
//проверки результата можно использовать формулу 1^2 + 2^2 +3^2+…+n^2=(n+1)(2n + 1)/6