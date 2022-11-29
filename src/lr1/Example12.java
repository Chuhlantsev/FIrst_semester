package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        int yearNow = Year.now().getValue();
        int birthYear = yearNow - age;
        System.out.println("Год рождения: " + birthYear);
        in.close();
    }
}
//Напишите программу, в которой по возрасту определяется год рождения.