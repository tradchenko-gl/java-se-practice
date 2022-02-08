package buchalka.section5.exersises;

public class Ex25LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime1(15));
    }

    public static int getLargestPrime1 (int number) {
        if (number > 1) {
            boolean isPrime = true;
            for (int i = number; i > 1; i--) {
                //find divisors
                if (number % i == 0) {
                    //check is divisor is a prime number
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    } if (isPrime) {
                        return i;
                    } else isPrime = true;
                }
            }
        }

        return -1;

    }
}
