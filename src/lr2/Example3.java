package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int result = x % 4;
        System.out.println("result = " + result);

        if (result == 0){
            if (x > 10){
                System.out.println("Введённое число делится на 4 и оно больше 10");
            } else {
                System.out.println("Введённое число меньше или равно 10");
            }
        } else {
            System.out.println("Введённое число не делится на 4");
        }

    }
}
//Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям:
//число делится на 4, и при этом оно не меньше 10.