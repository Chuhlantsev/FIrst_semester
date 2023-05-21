package lr6.Task9;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        char[] chars = {'П', 'р', 'и', 'в', 'е', 'т'};
        System.out.println("Исходные массив: " + Arrays.toString(chars));
        char[] result = changePlaces(chars);
        System.out.println("После смены мест: " + Arrays.toString(result));
    }


    public static char[] changePlaces(char[] charArray){
        char[] charsCopy = new char[charArray.length];
        for (int i = 0; i < charsCopy.length; i++){
            charsCopy[i] = charArray[charArray.length - 1 - i];
        }
        return charsCopy;
    }
}

//Напишите программу со статическим методом, аргументом которому передается
//одномерный символьный массив. В результате вызова метода элементы массива попарно
//меняются местами: первый — с последним, второй — с предпоследним и так далее.