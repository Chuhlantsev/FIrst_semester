package lr6.Task7;

import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        char[] chars = {'G','h','b','d','t','n'};
        System.out.println("Исходный массив символов: " + Arrays.toString(chars));
        int[] result = charsToIntsArray(chars);
        System.out.println("Коды символов исходного массива: " + Arrays.toString(result));
    }

    public static int[] charsToIntsArray(char[] charArray){
        int[] resultArray = new int[charArray.length];
        for (int i = 0; i < resultArray.length; i++){
            resultArray[i] = charArray[i];
        }
        return resultArray;
    }
}

//Напишите программу со статическим методом, аргументом которому передастся
//символьный массив, а результатом возвращается ссылка на целочисленным массив,
//состоящий из кодов символов из массива-аргумента.