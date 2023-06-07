package lr7.Task4;

public class SubClassT4A extends SuperClassT4 {
    public String str1;

    public SubClassT4A(char ch1) {
        super(ch1);
    }

    public void setValue(char ch1, String str1) {
        super.ch1 = ch1;
        this.str1 = str1;
    }

    public SubClassT4A(char ch1, String str1) {
        super(ch1);
        this.str1 = str1;
    }

    public SubClassT4A copySubClassT4A(char ch1){
        SubClassT4A copySubClassT4A = new SubClassT4A(ch1);
        copySubClassT4A.str1 = this.str1;
        return copySubClassT4A;
    }

    @Override
    public String toString() {
        return "SubClassT4A{" +
                "str1= '" + str1 + '\'' +
                ", ch1= " + ch1 +
                '}';
    }
}
