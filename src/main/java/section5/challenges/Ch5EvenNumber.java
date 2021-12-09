package section5.challenges;

public class Ch5EvenNumber {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int total = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            total += 1;
            System.out.println("Even number " + number);
            if (total == 5) {
                break;
            }
        }
        System.out.println(total);
    }

    public static boolean isEvenNumber (int number) {
        boolean isEven = false;

        if (number % 2 == 0) {
            isEven = true;
        }
        return isEven;
    }
}
