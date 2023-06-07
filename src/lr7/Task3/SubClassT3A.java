package lr7.Task3;

public class SubClassT3A extends SuperClassT3 {
    public char ch1;

    public SubClassT3A(int x) {
        super(x);
    }

    public void setValue(int x, char ch1) {
        this.x = x;
        this.ch1 = ch1;
    }

    public SubClassT3A(int x, char ch1) {
        super(x);
        this.ch1 = ch1;
    }

    @Override
    public String toString() {
        return "SubClassT3A{" +
                "ch1=" + ch1 +
                ", x=" + x +
                '}';
    }
}
