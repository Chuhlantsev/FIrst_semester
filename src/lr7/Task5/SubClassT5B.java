package lr7.Task5;

public class SubClassT5B extends SuperClassT5 {
    protected char ch1;

    public SubClassT5B(String str1) {
        super(str1);
    }

    public void setValue(String str1, char ch1) {
        super.getStr1();
        this.ch1 = ch1;
    }

    public SubClassT5B(String str1, char ch1) {
        super(str1);
        this.ch1 = ch1;
    }

    @Override
    public String toString() {
        return "SubClassT5B{" +
                "str1= '" + getStr1() + '\'' +
                ", ch1= " + ch1 +
                '}';
    }

    @Override
    public void showInfo(){
        System.out.println("SubClassT5B{" +
                "str1= '" + getStr1() + '\'' +
                ", ch1= " + ch1 +
                '}');
    }
}
