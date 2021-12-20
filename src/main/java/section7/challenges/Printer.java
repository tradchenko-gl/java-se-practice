package section7.challenges;

public class Printer {
    private int tonerLever;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLever, boolean isDuplex) {
        if (tonerLever < 0 || tonerLever > 100) {
            this.tonerLever = 100;
        } else this.tonerLever = tonerLever;
        this.isDuplex = isDuplex;
        this.numberOfPagesPrinted = 0;
    }

    public void fillUpToner(int fillUpLevel) {
        if (fillUpLevel <= 0) {
            System.out.println("Invalid amount");
        } else {
            if (this.tonerLever == 100) {
                System.out.println("Toner is full");
            } else {
                if (fillUpLevel + this.tonerLever > 100) {
                    this.tonerLever = 100;
                    System.out.println("Toner is filled up, toner level is " + this.tonerLever);
                } else {
                    this.tonerLever += fillUpLevel;
                    System.out.println("Toner is filled up, toner level is " + this.tonerLever);
                }
            }
        }
    }

    public void print (int numberOfPages) {
        this.numberOfPagesPrinted += numberOfPages;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
