package lr6.Task1;

public class Task1 {
    //Два поля: символьное и текстовое
    char ch;
    String str;

    //Если метод вызывается с символьным аргументом, то соответствующее значение присваивается символьному полю.
    public void set(char c) {
        ch = c;
        System.out.print("\n Вызов метода с аргументом char. ch = " + ch);
    }

    //Если метод вызывается с текстовым аргументом, то он определяет значение текстового поля.
    public void set(String s) {
        str = s;
        System.out.print("\n Вызов метода с аргументом string. str = " + str);
    }

    //Если массив состоит из одного элемента, то он определяет значение символьного поля.
    public void set(char[] charArray) {
        if (charArray.length == 1){
            ch = charArray[0];
            System.out.print("\n Вызов метода с массивом char. ch = " + ch);
        } else {
            //Если в массиве больше одного элемента, из символов массива формируется текстовая строка и
            // присваивается значением текстовому полю.
            str = new String(charArray);
            System.out.print("\n Вызов метода с массивом string. str = " + str);
        }
    }

}
