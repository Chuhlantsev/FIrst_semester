package lr5.Example1;

public class Main1 {
    public static void main(String[] args) {
        Example1 example1 = new Example1(); //Создаём объект класса Example1
        example1.setCh1('A'); //Устанавливаем значение символа
        System.out.println("getCodeSymbol " + example1.getCodeSymbol()); //Выводим код символа
        example1.showCodeAndValue(); //Используем метод для вывода кода и символа
    }
}

//Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода.
//Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа.
//Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.