package lr7.Task3;

public class SuperClassT3 {
    public int x;

    public void setValue(int x) {
        this.x = x;
    }

    public SuperClassT3(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "SuperClassT3{" +
                "x=" + x +
                '}';
    }
}
