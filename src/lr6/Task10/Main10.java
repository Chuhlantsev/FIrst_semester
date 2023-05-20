package lr6.Task10;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        int[] arrayInt = getMaxAndMinValue(135360,214320,12330,500,402,405);
        System.out.println(Arrays.toString(arrayInt));
    }

    public static int[] getMaxAndMinValue(int ... v){
        Arrays.sort(v);

        int[] arrayInt = new int[2];

        arrayInt[1] = v[v.length - 1];
        arrayInt[0] = v[0];

        return arrayInt;
    }
}

//Напишите программу со статическим методом, аргументом которому передается
//произвольное количество целочисленных аргументов. Результатом метод возвращает
//массив из двух элементов: это значения наибольшего и наименьшего значений среди
//аргументов, переданных методу.