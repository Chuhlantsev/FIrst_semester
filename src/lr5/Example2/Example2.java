package lr5.Example2;

public class Example2 {
    private char ch1;
    private char ch2;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }
    public void setCh2(char ch2) {
        this.ch2 = ch2;
    }
    public char getCh1() {
        return ch1;
    }
    public char getCh2() {
        return ch2;
    }

    public void getAllChars(){
        int int1 = ch1;
        int int2 = ch2;

        if (ch1 > ch2) {
            int1 = ch2;
            int2 = ch1;
        }

        for (int i = int1; i <= int2; i++) {
            System.out.print((char) i + " ");
        }
    }
}
