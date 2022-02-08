package buchalka.section11.challenges.series;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 2; i<=n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
