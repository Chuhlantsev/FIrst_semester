package lr7.Task4;

public class Main4 {
    public static void main(String[] args) {
        SuperClassT4 superClassT4 = new SuperClassT4('F');
        System.out.println(superClassT4);

        SubClassT4A subClassT4A = new SubClassT4A('A');
        subClassT4A.str1 = "Привет";

        subClassT4A.copySubClassT4A('B');
        System.out.println(subClassT4A);


        SubClassT4B subClassT4B = new SubClassT4B('C', "Пока");
        subClassT4B.int1 = 3;

        subClassT4B.copySubClassT4B('D', "Пока-пока");
        System.out.println(subClassT4B);
    }
}

//Напишите программу, в которой использована цепочка наследования из трех классов. В первом
//классе есть открытое символьное поле. Во втором классе появляется открытое текстовое поле. В
//третьем классе появляется открытое целочисленное поле. В каждом из классов должен быть
//конструктор, позволяющий создавать объект на основе значений полей, переданных аргументами
//конструктору, а также конструктор создания копии.