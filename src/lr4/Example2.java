package lr4;

public class Example2 {
    public static void main(String[] args) {
        int figure = 10; //число строк, которое необходимо вывести
        int i; //число для расчёта кол-ва строк
        int j; //число для расчёта колонок
        int z; //для вывода служебного сообщения о кол-ве символов в строке

        for (i = 1; i<=figure; i++){
            //System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = 1; j <= i; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}

//Напишите программу, которая выводит в консольное окно прямоугольный треугольник;