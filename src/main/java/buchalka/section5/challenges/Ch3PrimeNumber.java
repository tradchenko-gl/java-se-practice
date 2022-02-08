package buchalka.section5.challenges;

public class Ch3PrimeNumber {

    public static void main(String[] args) {
        int j = 0;
        for (int i = 300; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                j++;
            }
            if (j == 3) break;
         }
    }

    public static boolean isPrime (int n) {

        if (n == 1) {
            return false;
        }
        for (int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
