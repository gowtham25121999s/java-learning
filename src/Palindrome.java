public class Palindrome {
    public static void main(String[] args) {
        String str = "amma";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
            if (str==rev) {
                System.out.println(" is palindrome");
            } else {
                System.out.println("is not  palindrom");
            }

    }
}
