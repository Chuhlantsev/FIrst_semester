package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int result = x / 1000;
        System.out.println("Количество тысяч во введённом числе: " + result);

    }
}
//Напишите программу, которая проверяет,
//сколько тысяч во введенном пользователем числе
//(определяется четвертая цифра справа в десятичном представлении числа).