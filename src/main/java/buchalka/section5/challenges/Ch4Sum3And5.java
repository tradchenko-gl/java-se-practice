package buchalka.section5.challenges;

public class Ch4Sum3And5 {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for (int i = 1; i <=1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " can be divided by 3 and 5");
                count++;
                sum = sum + i;
                if (count == 5) {
                    System.out.println(sum + " is a sum of 5 numbers divided by 3 and 5");
                    break;
                }
            }
        }
    }
}
