package section11.challenges.scope;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        X x = new X();
        x.x(x());
    }

    public static int x() {
        System.out.println("Enter integer number:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        return x;
    }

}
