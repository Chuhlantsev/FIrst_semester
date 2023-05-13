package lr5.Example5;

public class Example5 {
    private int num;

    public int setNum(int num) {
        this.num = num;
        return num;
    }

    public int setNum() {
        return 0;
    }

    public Example5(int num) {
        this.num = num;
    }

    public Example5() {
    }

    public int getNum() {
        return num;
    }

    public int checkNum() {
        if (num > 100){
            this.num = 100;
        }
        return num;
    }
}
