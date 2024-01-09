package aceyourcodinginterview.warmup;

public class GCD {

    static long recursiveGCD(long a, long b) {
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }

        return recursiveGCD(b, a % b);
    }

    static long iterativeGCD(long a, long b) {
        long temp;
        while (a > 0 && b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }

        return a == 0 ? b : a;
    }
}
