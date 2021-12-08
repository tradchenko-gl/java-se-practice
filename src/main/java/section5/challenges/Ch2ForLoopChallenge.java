package section5.challenges;

public class Ch2ForLoopChallenge {

    public static void main(String[] args) {
        for (int i=8; i>1; i--) {
            System.out.println("10000 at " + i + " interest = " + calculateInterest(10000, i));
        }


    }



    public static double calculateInterest (double amount, double interestRate) {
        return (amount*(interestRate/100));
    }
}
