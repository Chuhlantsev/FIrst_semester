package lr7.Task4;

public class SubClassT4B extends SubClassT4A{
    public int int1;

    public SubClassT4B(char ch1, String str1) {
        super(ch1, str1);
    }

    public SubClassT4B(char ch1, String str1, int int1) {
        super(ch1, str1);
        this.int1 = int1;
    }

    public SubClassT4B copySubClassT4B(char ch1, String str1){
        SubClassT4B copySubClassT4B = new SubClassT4B(ch1, str1);
        copySubClassT4B.int1 = this.int1;
        return copySubClassT4B;
    }

    @Override
    public String toString() {
        return "SubClassT4B{" +
                "int1= " + int1 +
                ", str1= '" + str1 + '\'' +
                ", ch1= " + ch1 +
                '}';
    }
}
