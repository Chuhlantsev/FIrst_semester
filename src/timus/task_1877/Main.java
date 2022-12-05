package timus.task_1877;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chet = in.nextInt();
        int nechet = in.nextInt();

        if (chet % 2 == 0){
            System.out.println("yes");
        } else if (nechet % 2 == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        }
    }
