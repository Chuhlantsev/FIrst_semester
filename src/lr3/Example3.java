package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел для последовательности Фибоначчи");
        int size = in.nextInt();

        int[] fibo = new int[size];

        for (int i = 0; i < fibo.length; i++){
            fibo[0] = 1;
            fibo[1] = 1;
            if (i >= 2){
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
        }
        for (int i = 0; i < fibo.length; i++){
            if (i == fibo.length - 1) {
                System.out.print(fibo[i]);
            } else {
                System.out.print(fibo[i] + " ");
            }
        }
    }
}

//Напишите программу, которая выводит последовательность чисел Фибоначчи.
//Первые два числа в этой последовательности равны 1, а каждое следующее число равно сумме двух предыдущих
//(получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
//Количество чисел в последовательности вводится пользователем.
//Предложите версии программы, использующие разные операторы цикла.