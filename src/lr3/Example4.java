package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = in.nextInt();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        int size = 0;

        if (num1 > num2){
            size = num1 - num2 + 1;
        } else if (num1 == num2){
            System.out.println(num1 + " " + num2);
        } else {
            size = num2 - num1 + 1;
        }

        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++){
            nums[0] = Math.min(num1, num2);
            nums[size-1] = Math.max(num1, num2);
            if (i > 0){
                nums[i] = nums[i-1] + 1;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + " ");
            }
        }
    }
}

//Напишите программу, в которой пользователем вводится два целых числа.
//Программа выводит все целые числа — начиная с наименьшего (из двух введенных чисел)
//и заканчивая наибольшим (из двух введенных чисел).
//Предложите разные версии программы (с использованием разных операторов цикла).