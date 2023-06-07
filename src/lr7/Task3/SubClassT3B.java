package lr7.Task3;

public class SubClassT3B extends SubClassT3A{
    public String str1;

    public SubClassT3B(int x, char ch1) {
        super(x, ch1);
    }

    public void setValue(int x, char ch1, String str1) {
        this.x = x;
        this.ch1 = ch1;
        this.str1 = str1;
    }

    public SubClassT3B(int x, char ch1, String str1) {
        super(x, ch1);
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return "SubClassT3B{" +
                "str1='" + str1 + '\'' +
                ", ch1=" + ch1 +
                ", x=" + x +
                '}';
    }
}
