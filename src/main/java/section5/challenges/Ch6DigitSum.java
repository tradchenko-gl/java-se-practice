package section5.challenges;

public class Ch6DigitSum {

    public static void main(String[] args) {
        System.out.println(sumDigits(52));

    }

    public static int sumDigits (int number) {
        int sum = 0;

       if (number >= 10) {
           while (number >= 1) {
               sum += (number%10);
               number = number/10;

           }

       } else return -1;

        return sum;
    }
}
