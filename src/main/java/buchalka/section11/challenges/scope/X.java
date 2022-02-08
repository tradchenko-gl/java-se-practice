package buchalka.section11.challenges.scope;

public class X {
    private int x = 1;

    public void x(int x) {
        while (this.x <= 12){
            System.out.println(x + " times " + this.x + " is " + x*this.x);
            this.x++;
        }
    }
}
