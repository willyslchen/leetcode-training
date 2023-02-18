package yclass.c02;

public class C0202_pow {
    public static void main(String[] args) {
        System.out.println(pow(3, 8));
        System.out.println(pow(4, -3));

        System.out.println(optimizedPow(3, 8));
        System.out.println(optimizedPow(4, -3));
    }

    public static double pow(double x, int n) {
        double answer = 1;
        boolean negative = false;

        if (n == Integer.MIN_VALUE) {
            // -2147483648
            x = x * x;
            n = n / 2;
        }
        if (n < 0) {
            negative = true;
            n = (-1) * n;
        }

        for (int i = 0; i < n; i++) {
            answer *= x;
        }

        if (negative) {
            answer = 1 / answer;
        }
        return answer;
    }

    public static double optimizedPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == Integer.MIN_VALUE) {
            // -2147483648
            x = x * x;
            n = n / 2;
        }
        if (n < 0) {
            n = n * (-1);
            x = 1 / x;
        }

        if (n % 2 == 0) {
            return optimizedPow(x * x, n / 2);
        } else {
            return x * optimizedPow(x * x, n / 2);
        }
    }
}
