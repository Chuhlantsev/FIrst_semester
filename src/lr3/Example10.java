package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();

        int[] nums = new int[size];

        Random random = new Random();

        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(10000);
        }

        Arrays.sort(nums);

        int[] numsReverse = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            numsReverse[nums.length - 1 - i] = nums[i];
        }
        System.out.println(Arrays.toString(numsReverse));
    }
}

//Напишите программу, в которой создается целочисленный
//массив, заполняется случайными числами и после этого значения элементов в
//массиве сортируются в порядке убывания значений.