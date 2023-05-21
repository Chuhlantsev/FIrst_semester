package lr6.Task8;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Исходный массив целых чисел: " + Arrays.toString(ints));
        double result = average(ints);
        System.out.println("Среднее значение массива равно " + result);
    }

    public static double average(int[] intArray){
        int sum = 0;
        for (int i = 0; i < intArray.length; i++){
            sum += intArray[i];
        }
        System.out.println(intArray.length);
        double avg = (double) sum / intArray.length;
        return avg;
    }
}

//Напишите программу со статическим методом, аргументом которому передается
//целочисленный массив, а результатом возвращается среднее значение для элементов
//массива (сумма значений элементов, деленная на количество элементов в массиве).