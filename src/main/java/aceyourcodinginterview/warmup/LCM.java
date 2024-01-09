package aceyourcodinginterview.warmup;

import static aceyourcodinginterview.warmup.GCD.iterativeGCD;

public class LCM {

    static long findLCM(long a, long b) {
        return (a * b / iterativeGCD(a, b));
    }
}
