package lr3;

import java.util.Arrays;
public class Example7 {
    public static void main(String[] args) {
        char[] chars = new char[10]; //Создание основного массива с буквами
        int j = 0; //Итератор 2-го уровня для работы с символами

        //Наполнение массива буквами
        for (int i = 0; i < chars.length; i++) {
            for (char ch = 'а'; ch <= 'я'; ch++) {
                if (j % 2 == 0) {
                    chars[i] = ch;
                    j++;
                    i++;
                    if (i == chars.length) {break;}
                } else {j++;}
            }
        }
        System.out.println(Arrays.toString(chars)); //Выводим массив букв
        char[] charsReverse = new char[chars.length];

        //Создаём копию массива для переворота
        for (int i = 0; i < chars.length; i++){
            charsReverse[chars.length - 1 - i] = chars[i];
        }
        System.out.println(Arrays.toString(charsReverse)); //Выводим перевёрнутый массив букв
    }
}

//Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
//Массив заполняется буквами «через одну», начиная с буквы ' а ':
//то есть массив заполняется буквами 'а', 'с', ' е', 'д' и так далее.
//Отобразите массив в консольном окне в прямом и обратном порядке.
//Размер массива задается переменной.