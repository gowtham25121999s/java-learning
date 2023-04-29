public class Leapyear {
    public static void main(String[] args) {
        int year = 2023;
        if (year % 400 == 0) {
            System.out.println(year + "is leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + "is leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + "is leap year");
        } else {
            System.out.println(year + "is not  leap year");
        }
    }
}
