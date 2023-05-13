package lr5.Example4;

import static java.lang.Math.floor;

public class Example4 {
    private char ch1;
    private int num;

    public Example4(char ch1, int num) {
        this.ch1 = ch1;
        this.num = num;
    }

    public char getCh1() {
        return ch1;
    }

    public int getNum() {
        return num;
    }

    public Example4(double trouble){
        this.ch1 = (char) floor(trouble);
        this.num = (int) (trouble * 100) % 100;
    }
}
