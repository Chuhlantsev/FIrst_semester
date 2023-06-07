package lr7.Task5;

public class SubClassT5A extends SuperClassT5 {
    protected int int1;

    public SubClassT5A(String str1) {
        super(str1);
    }

    public void setValue(String str1, int int1) {
        super.getStr1();
        this.int1 = int1;
    }

    public SubClassT5A(String str1, int int1){
        super(str1);
        this.int1 = int1;
    }

    @Override
    public String toString() {
        return "SubClassT5A{" +
                "str1= '" + getStr1() + '\'' +
                ", int1= " + int1 +
                '}';
    }
    @Override
    public void showInfo(){
        System.out.println("SubClassT5A{" +
                "str1= '" + getStr1() + '\'' +
                ", int1= " + int1 +
                '}');
    }
}
