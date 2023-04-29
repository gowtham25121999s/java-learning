public class Jags {
    public static void main(String[] args) {
        int number = 17;
        boolean prime = false;
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                prime = true;
                break;
            }
        }
        if (!prime) {
            System.out.println(number + "is prime number");
        } else {
            System.out.println(number + "is not a prime number");

        }
    }
}
