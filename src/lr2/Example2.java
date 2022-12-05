package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int result1 = x % 5;
        int result2 = x % 7;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        if (result1 == 2){
            if (result2 == 1){
                System.out.println("Введённое число делится на 5 с остатком 2, а на 7 - с остатком 1");
            } else {
                    System.out.println("Введённое число не делится на 7 с остатком 1");
            }
        } else {
            System.out.println("Введённое число не делится на 5 с остатком 2, а на 7 - с остатком 1");
        }

    }
}
//Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям:
//при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1.