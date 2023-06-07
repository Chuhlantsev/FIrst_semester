package lr7.Task4;

public class SuperClassT4 {
    public char ch1;

    public SuperClassT4(char ch1) {
        this.ch1 = ch1;
    }

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    SuperClassT4(SuperClassT4 copy){
        this.ch1 = copy.ch1;
    }

    @Override
    public String toString() {
        return "SuperClassT4{" +
                "ch1= " + ch1 +
                '}';
    }
}
