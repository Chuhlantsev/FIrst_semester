package lr5.Example3;

public class Main3 {
    public static void main(String[] args) {
        Example3 ex1 = new Example3();
        System.out.println("Без аргументов: " + ex1.int1 + " " + ex1.int2);

        Example3 ex2 = new Example3(1);
        System.out.println("Один аргумент: " + ex2.int1 + " " + ex2.int2);

        Example3 ex3 = new Example3(1, 2);
        System.out.println("Два аргумента: " + ex3.int1 + " " + ex3.int2);
    }
}

//Напишите программу с классом, у которого есть два целочисленных поля. В классе должны быть описаны конструкторы,
// позволяющие создавать объекты без передачи аргументов, с передачей одного аргумента и с передачей двух аргументов.