package lr7.Task3;

public class Main3 {
    public static void main(String[] args) {
        SuperClassT3 superClassT3 = new SuperClassT3(1);
        String className = superClassT3.toString();
        System.out.println(className);

        SubClassT3A subClassT3A = new SubClassT3A(2, 'A');
        String subClassParams = subClassT3A.toString();
        System.out.println(subClassParams);

        SubClassT3B subClassT3B = new SubClassT3B(3, 'B', "Привет");
        String subClassParams2 = subClassT3B.toString();
        System.out.println(subClassParams2);
    }
}

//Напишите программу, в которой на основе суперкласса создается подкласс, а на основе этого
//подкласса создается еще один подкласс (цепочка наследования из трех классов). В первом
//суперклассе есть открытое целочисленное поле, метод с одним параметром для присваивания
//значения полю и конструктор с одним параметром. Во втором классе появляется открытое
//символьное поле, метод с двумя параметрами для присваивания значения полям (перегрузка
//метода из суперкласса) и конструктор с двумя параметрами. В третьем классе появляется
//открытое текстовое ноле, метод с тремя аргументами для присваивания значений полям
//(перегрузка метода из суперкласса) и конструктор с тремя параметрами. Для каждого класса
//определите метод toString () так, чтобы он возвращал строку с названием класса и значениями
//всех полей объекта.