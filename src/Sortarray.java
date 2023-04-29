public class Sortarray {
    public static void main(String[] args) {
        int a[] = {10, 80, 50, 28, 2, 88};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
