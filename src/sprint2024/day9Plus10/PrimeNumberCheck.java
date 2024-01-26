package sprint2024.day9Plus10;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num = 5;
        boolean isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if ((num % i) == 0) {
                System.out.println(num + " is not prime");
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime");
        }

    }
}
