package lr9.Task1;

public class ex8 {
//    public class Main {
        public static int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println(e);
            }
            finally {
                System.out.println("1");
            }
            return 0;
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
//    }
}
