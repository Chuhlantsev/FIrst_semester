package lr7.Task2;

public class SuperClassT2 {
    private String str1;

    public SuperClassT2(String str1) {
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public int getStringLength(){
        if (this.str1 == null){
            return 0;
        }
        return this.str1.length();
    }
}
