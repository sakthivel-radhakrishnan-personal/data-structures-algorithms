package aceyourcodinginterview.warmup.fibonacci;

import java.math.BigInteger;

public class FibonacciNumbers {

    static int fibonacciRecursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    static long fibonacciWithTempArrayDP(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        long[] fib = new long[n + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    static long fibonacciMemOptimised(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        long previous = 0;
        long current = 1;

        long temp;

        for (int i = 2; i < n + 1; i++) {
            temp = previous;
            previous = current;
            current = current + temp;
        }
        return current;
    }

    static BigInteger lastDigitOfFibonacci(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.valueOf(n);
        }

        BigInteger previous = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;

        BigInteger temp;

        for (int i = 2; i < n + 1; i++) {
            temp = previous;
            previous = current;
            current = current.add(temp);
        }
        return current.mod(BigInteger.TEN);
    }

    static long lastDigitOfFibonacciNumberMemOptimised(long n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciNumberModuloM(n, 10);
    }

    static long hugeFibonacciNumber(long n, int m) {
        if (n <= 1) {
            return n;
        }

        long pisanoPeriod = pisanoPeriod(m);

        return fibonacciNumberModuloM((int) (n % pisanoPeriod), m);
    }

    static long fibonacciNumberModuloM(long n, int m) {
        if (n <= 1) {
            return n;
        }

        long previous = 0;
        long current = 1;
        long temp;

        for (int i = 2; i < n + 1; i++) {
            temp = previous;
            previous = current;
            current = (current + temp) % m;
        }
        return current;
    }

    // https://cogniterra.org/lesson/28332/step/1?unit=20586
    static long fibonacciSumLastDigit(long n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacciNumberModuloM(((n + 2) % 60) - 1, 10) % 10;
    }

    static long pisanoPeriod(long m) {
        if (m == 1) {
            return 1;
        }

        long prev = 0;
        long curr = 1;
        long period = 0;
        long temp;

        while (true) {
            temp = curr;
            curr = (prev + curr) % m;
            prev = temp;

            if (prev == 0 && curr == 1) {
                return period + 1;
            }

            period++;
        }
    }


    public static void main(String[] args) {
        System.out.println(fibonacciRecursion(1));
        System.out.println(fibonacciWithTempArrayDP(1));
        System.out.println(fibonacciMemOptimised(1));
        System.out.println(lastDigitOfFibonacci(1));
        System.out.println(lastDigitOfFibonacciNumberMemOptimised(1));
    }
}
