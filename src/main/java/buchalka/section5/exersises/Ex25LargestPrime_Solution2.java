package buchalka.section5.exersises;

public class Ex25LargestPrime_Solution2 {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime (int number) {

        if (number > 1) {
            for (int i = number; i > 1; i--) {
                if ((number % i == 0) && (isPrimeNumber(i))) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static boolean isPrimeNumber (int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
