package lr7.Task1;

public class SuperClassT1 {
    //закрытое текстовое поле
    private String str1;

    //конструктор с текстовым аргументом

    public SuperClassT1(String strEx) {
        this.str1 = strEx;
    }

    SuperClassT1(){
    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str1 = " + this.getStr1();

        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
