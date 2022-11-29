package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год рождения: ");
        int birthYear = in.nextInt();
        int yearNow = Year.now().getValue();
        int age = yearNow - birthYear;
        System.out.println("Возраст: " + age + " лет");
        in.close();
    }
}
// Напишите программу, в которой по году рождения определяется возраст
//пользователя.