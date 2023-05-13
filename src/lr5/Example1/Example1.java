package lr5.Example1;

public class Example1 {
    private char ch1;

    //Метод для установки значения символа
    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    //Метод для получения кода символа
    public int getCodeSymbol() {
        return ch1;
    }

    //Метод для вывода кода и символа
    public void showCodeAndValue(){
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int) ch1);
    }
}

