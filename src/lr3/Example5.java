package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел для расчёта суммы");
        int size = in.nextInt();
        int x = 0;
        Random random = new Random();

        //Создаём и наполняем числами массив
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++){
            boolean iterator = true;
            while (iterator){
                x = random.nextInt(10000);
                if (x % 5 == 2) {
                    iterator = false;
                } else if (x % 3 == 1) {
                    iterator = false;
                }
            }
            nums[i] = x;
        }
        //Считаем сумму чисел в массиве
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //Красиво выводим числа массива по порядку и без пробела в конце
        for (int i = 0; i < nums.length; i++){
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + " ");
            }
        }
        //Выводим сумму чисел массива с новой строки
        System.out.println("\n" + "Сумма чисел равна " + sum);
    }
}

//Напишите программу, в которой вычисляется сумма чисел,
//удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2,
//или при делении на 3 в остатке получается 1. Количество чисел в сумме вводится пользователем.
//Программа отображает числа, которые суммируются, и значение суммы.
//Предложите версии программы, использующие разные операторы цикла.