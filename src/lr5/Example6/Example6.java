package lr5.Example6;

public class Example6 {
    private int min;
    private int max;

    public Example6(int a){
        if (a > 0) {      // Самое большое из значений присваивается полю max, а самое маленькое из значений присваивается полю min.
            this.max = a;
            this.min = 0;
        } else {
            this.max = 0;
            this.min = a;
        }
    }
    // сравниваются текущие значения полей и значения аргументов, переданных методу.
    // Самое большое из значений присваивается полю max, а самое маленькое из значений присваивается полю min.
    public Example6(int a, int b) {
        if (a > b) {
            int c = b;
            b = a;
            a = c;
        }
        this.min = a;
        this.max = b;
    }
    //конструктор, который работает по тому же принципу, что и метод для присваивания значений полям
    public void setValues(int a, int b) {
        if (a > b) {
            int c = b;
            b = a;
            a = c;
        }
        if (a < this.min) {
            this.min = a;
        }
        if (b > this.max) {
            this.max = b;
        }
    }
    //конструктор, который работает по тому же принципу, что и метод для присваивания значений полям
    public void setValue(int a) {
        if (a > this.max) {
            this.max = a;
        }
        if (a < this.min) {
            this.min = a;
        }
    }
    //метод, отображающий в консольном окне значения полей объекта.
    public void print() {
        System.out.println(this.min + " " + this.max);
    }
}
