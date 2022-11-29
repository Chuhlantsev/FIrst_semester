package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите год рождения: ");
        int birthYear = in.nextInt();
        int yearNow = Year.now().getValue();
        int age = yearNow - birthYear;
        System.out.println(name + ", " + age + " лет");
        in.close();
    }
}
//Напишите программу, в которой Пользователь вводит имя и год рождения,
//в программа отображает сообщение содержащее имя пользователя и его
//возраст