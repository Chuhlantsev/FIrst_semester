package lr7.Task5;

public class SuperClassT5 {
    private String str1;

    public SuperClassT5(String str1) {
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return "SuperClassT5{" +
                "str1= '" + str1 + '\'' +
                '}';
    }

    public void showInfo(){
        System.out.println("SuperClassT5{" +
                "str1= '" + str1 + '\'' +
                '}');
    }
}
