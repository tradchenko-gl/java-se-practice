package additionalTasks.t11CharsWithTheMostAppearence;

public class Pair <Character, Integer>{
    private char ch;
    private int count;

    public Pair(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }

    public char getCh() {
        return ch;
    }

    public int getCount() {
        return count;
    }
}
