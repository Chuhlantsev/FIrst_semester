package lr7.Task2;

public class SubClassT2 extends SuperClassT2 {
    public int int1;

    public SubClassT2(String str1) {
        super(str1);
    }

    public SubClassT2(String str1, int int1) {
        super(str1);
        this.int1 = int1;
    }

    @Override
    public String getStr1() {
        return super.getStr1();
    }

    @Override
    public void setStr1(String str1) {
        super.setStr1(str1);
    }

    public int getInt1(int x) {
        return int1 + x;
    }

    public int getInt1() {
        return int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }
}
