public class Fibonacciseries {
    public void fibonacciseries() {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= 5; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(a);
        }
    }
}
