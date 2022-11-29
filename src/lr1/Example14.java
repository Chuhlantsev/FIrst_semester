package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = in.nextInt();
        int num2 = num1 - 1;
        int num3 = num1 + 1;
        int num4 = (num1 + num2 + num3) * (num1 + num2 + num3);
        System.out.println(num2 + " " + num1 + " " + num3 + " " + num4);
        in.close();
    }
}
//Напишите программу, в которой пользователь вводит число, а программой
//отображается последовательность из четырех чисел: число, на единицу
//меньше введённого, введенное число и число, на единицу больше введенного.
//Четвертое число должно быть квадратом суммы первых трех чисел.