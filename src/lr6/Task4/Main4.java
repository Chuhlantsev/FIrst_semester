package lr6.Task4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Введите число для вычисления двойного факториала:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        number = doubleFactorial(number);
        System.out.println("Двойной факториал = " + number);
    }

    public static int doubleFactorial(int n){
        int num = n;
        for (int i = 0; i <= n; i += 2){
            num = num * (n - 2);
            n -= 2;
        }
        return num;
    }
}

//  Напишите программу, в которой описан статический метод для вычисления двойного
//  факториала числа, переданного аргументом методу. По определению, двойной факториал
//  числа п (обозначается как n!!) — это произведение через одно всех чисел, не больших
//  числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для нечетного п
//  и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.