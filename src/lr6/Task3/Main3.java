package lr6.Task3;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int number = in.nextInt();
        if (number <= 0){
            System.out.println("Массив пуст");
        } else {
            System.out.println("Случайный массив:");
            int[] nums = new int[number];
            for (int i = 0; i < nums.length; i++){
                nums[i] = random.nextInt(100);
                System.out.print(nums[i] + " ");
            }
            Task3.Method(nums);
        }
    }
}

//Напишите программу с классом, в котором есть статические методы, которым можно передавать произвольное количество
// целочисленных аргументов (или целочисленный массив). Методы, на основании переданных аргументов или массива,
// позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее значение из набора чисел.