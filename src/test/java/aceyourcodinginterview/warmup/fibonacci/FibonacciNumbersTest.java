package aceyourcodinginterview.warmup.fibonacci;


import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static aceyourcodinginterview.Util.generateRandomNumber;
import static aceyourcodinginterview.warmup.fibonacci.FibonacciNumbers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumbersTest {
    private static final int MIN_N = 0;
    private static final int MAX_N = 92;
    private static final int MAX_N_FOR_LAST_DIGIT = 10_000;
    private static final int RECURSION_MAX_N = 40;

    @Test
    void testFibonacciRecursion() {
        assertEquals(0, fibonacciRecursion(0));
        assertEquals(1, fibonacciRecursion(1));
        assertEquals(1, fibonacciRecursion(2));
        assertEquals(2, fibonacciRecursion(3));
        assertEquals(3, fibonacciRecursion(4));
        assertEquals(5, fibonacciRecursion(5));
        assertEquals(8, fibonacciRecursion(6));
        assertEquals(13, fibonacciRecursion(7));
        assertEquals(21, fibonacciRecursion(8));
        assertEquals(34, fibonacciRecursion(9));
        assertEquals(55, fibonacciRecursion(10));
        assertEquals(89, fibonacciRecursion(11));
        assertEquals(144, fibonacciRecursion(12));
        assertEquals(233, fibonacciRecursion(13));
        assertEquals(377, fibonacciRecursion(14));
        assertEquals(610, fibonacciRecursion(15));
        assertEquals(987, fibonacciRecursion(16));
        assertEquals(1597, fibonacciRecursion(17));
        assertEquals(2584, fibonacciRecursion(18));
        assertEquals(4181, fibonacciRecursion(19));
        assertEquals(6765, fibonacciRecursion(20));
        assertEquals(10946, fibonacciRecursion(21));
        assertEquals(17711, fibonacciRecursion(22));
        assertEquals(28657, fibonacciRecursion(23));
        assertEquals(46368, fibonacciRecursion(24));
        assertEquals(75025, fibonacciRecursion(25));
        assertEquals(121393, fibonacciRecursion(26));
        assertEquals(196418, fibonacciRecursion(27));
        assertEquals(317811, fibonacciRecursion(28));
        assertEquals(514229, fibonacciRecursion(29));
        assertEquals(832040, fibonacciRecursion(30));
        assertEquals(1346269, fibonacciRecursion(31));
        assertEquals(2178309, fibonacciRecursion(32));
        assertEquals(3524578, fibonacciRecursion(33));
        assertEquals(5702887, fibonacciRecursion(34));
        assertEquals(9227465, fibonacciRecursion(35));
        assertEquals(14930352, fibonacciRecursion(36));
        assertEquals(24157817, fibonacciRecursion(37));
        assertEquals(39088169, fibonacciRecursion(38));
        assertEquals(63245986, fibonacciRecursion(39));
        assertEquals(102334155, fibonacciRecursion(40));
    }

    @Test
    void testFibonacciWithTempArrayDP() {
        assertEquals(0, fibonacciWithTempArrayDP(0));
        assertEquals(1, fibonacciWithTempArrayDP(1));
        assertEquals(1, fibonacciWithTempArrayDP(2));
        assertEquals(2, fibonacciWithTempArrayDP(3));
        assertEquals(3, fibonacciWithTempArrayDP(4));
        assertEquals(5, fibonacciWithTempArrayDP(5));
        assertEquals(8, fibonacciWithTempArrayDP(6));
        assertEquals(13, fibonacciWithTempArrayDP(7));
        assertEquals(21, fibonacciWithTempArrayDP(8));
        assertEquals(34, fibonacciWithTempArrayDP(9));
        assertEquals(55, fibonacciWithTempArrayDP(10));
        assertEquals(89, fibonacciWithTempArrayDP(11));
        assertEquals(144, fibonacciWithTempArrayDP(12));
        assertEquals(233, fibonacciWithTempArrayDP(13));
        assertEquals(377, fibonacciWithTempArrayDP(14));
        assertEquals(610, fibonacciWithTempArrayDP(15));
        assertEquals(987, fibonacciWithTempArrayDP(16));
        assertEquals(1597, fibonacciWithTempArrayDP(17));
        assertEquals(2584, fibonacciWithTempArrayDP(18));
        assertEquals(4181, fibonacciWithTempArrayDP(19));
        assertEquals(6765, fibonacciWithTempArrayDP(20));
        assertEquals(10946, fibonacciWithTempArrayDP(21));
        assertEquals(17711, fibonacciWithTempArrayDP(22));
        assertEquals(28657, fibonacciWithTempArrayDP(23));
        assertEquals(46368, fibonacciWithTempArrayDP(24));
        assertEquals(75025, fibonacciWithTempArrayDP(25));
        assertEquals(121393, fibonacciWithTempArrayDP(26));
        assertEquals(196418, fibonacciWithTempArrayDP(27));
        assertEquals(317811, fibonacciWithTempArrayDP(28));
        assertEquals(514229, fibonacciWithTempArrayDP(29));
        assertEquals(832040, fibonacciWithTempArrayDP(30));
        assertEquals(1346269, fibonacciWithTempArrayDP(31));
        assertEquals(2178309, fibonacciWithTempArrayDP(32));
        assertEquals(3524578, fibonacciWithTempArrayDP(33));
        assertEquals(5702887, fibonacciWithTempArrayDP(34));
        assertEquals(9227465, fibonacciWithTempArrayDP(35));
        assertEquals(14930352, fibonacciWithTempArrayDP(36));
        assertEquals(24157817, fibonacciWithTempArrayDP(37));
        assertEquals(39088169, fibonacciWithTempArrayDP(38));
        assertEquals(63245986, fibonacciWithTempArrayDP(39));
        assertEquals(102334155, fibonacciWithTempArrayDP(40));
        assertEquals(165580141, fibonacciWithTempArrayDP(41));
        assertEquals(267914296, fibonacciWithTempArrayDP(42));
        assertEquals(433494437, fibonacciWithTempArrayDP(43));
        assertEquals(701408733, fibonacciWithTempArrayDP(44));
        assertEquals(1134903170, fibonacciWithTempArrayDP(45));
        assertEquals(1836311903, fibonacciWithTempArrayDP(46));
        assertEquals(2971215073L, fibonacciWithTempArrayDP(47));
        assertEquals(4807526976L, fibonacciWithTempArrayDP(48));
        assertEquals(7778742049L, fibonacciWithTempArrayDP(49));
        assertEquals(12586269025L, fibonacciWithTempArrayDP(50));
        assertEquals(20365011074L, fibonacciWithTempArrayDP(51));
        assertEquals(32951280099L, fibonacciWithTempArrayDP(52));
        assertEquals(53316291173L, fibonacciWithTempArrayDP(53));
        assertEquals(86267571272L, fibonacciWithTempArrayDP(54));
        assertEquals(139583862445L, fibonacciWithTempArrayDP(55));
        assertEquals(225851433717L, fibonacciWithTempArrayDP(56));
        assertEquals(365435296162L, fibonacciWithTempArrayDP(57));
        assertEquals(591286729879L, fibonacciWithTempArrayDP(58));
        assertEquals(956722026041L, fibonacciWithTempArrayDP(59));
        assertEquals(1548008755920L, fibonacciWithTempArrayDP(60));
        assertEquals(2504730781961L, fibonacciWithTempArrayDP(61));
        assertEquals(4052739537881L, fibonacciWithTempArrayDP(62));
        assertEquals(6557470319842L, fibonacciWithTempArrayDP(63));
        assertEquals(10610209857723L, fibonacciWithTempArrayDP(64));
        assertEquals(17167680177565L, fibonacciWithTempArrayDP(65));
        assertEquals(27777890035288L, fibonacciWithTempArrayDP(66));
        assertEquals(44945570212853L, fibonacciWithTempArrayDP(67));
        assertEquals(72723460248141L, fibonacciWithTempArrayDP(68));
        assertEquals(117669030460994L, fibonacciWithTempArrayDP(69));
        assertEquals(190392490709135L, fibonacciWithTempArrayDP(70));
        assertEquals(308061521170129L, fibonacciWithTempArrayDP(71));
        assertEquals(498454011879264L, fibonacciWithTempArrayDP(72));
        assertEquals(806515533049393L, fibonacciWithTempArrayDP(73));
        assertEquals(1304969544928657L, fibonacciWithTempArrayDP(74));
        assertEquals(2111485077978050L, fibonacciWithTempArrayDP(75));
        assertEquals(3416454622906707L, fibonacciWithTempArrayDP(76));
        assertEquals(5527939700884757L, fibonacciWithTempArrayDP(77));
        assertEquals(8944394323791464L, fibonacciWithTempArrayDP(78));
        assertEquals(14472334024676221L, fibonacciWithTempArrayDP(79));
        assertEquals(23416728348467685L, fibonacciWithTempArrayDP(80));
        assertEquals(37889062373143906L, fibonacciWithTempArrayDP(81));
        assertEquals(61305790721611591L, fibonacciWithTempArrayDP(82));
        assertEquals(99194853094755497L, fibonacciWithTempArrayDP(83));
        assertEquals(160500643816367088L, fibonacciWithTempArrayDP(84));
        assertEquals(259695496911122585L, fibonacciWithTempArrayDP(85));
        assertEquals(420196140727489673L, fibonacciWithTempArrayDP(86));
        assertEquals(679891637638612258L, fibonacciWithTempArrayDP(87));
        assertEquals(1100087778366101931L, fibonacciWithTempArrayDP(88));
        assertEquals(1779979416004714189L, fibonacciWithTempArrayDP(89));
        assertEquals(2880067194370816120L, fibonacciWithTempArrayDP(90));
        assertEquals(4660046610375530309L, fibonacciWithTempArrayDP(91));
        assertEquals(7540113804746346429L, fibonacciWithTempArrayDP(92));
    }

    @Test
    void testFibonacciMemOptimised() {
        assertEquals(0, fibonacciMemOptimised(0));
        assertEquals(1, fibonacciMemOptimised(1));
        assertEquals(1, fibonacciMemOptimised(2));
        assertEquals(2, fibonacciMemOptimised(3));
        assertEquals(3, fibonacciMemOptimised(4));
        assertEquals(5, fibonacciMemOptimised(5));
        assertEquals(8, fibonacciMemOptimised(6));
        assertEquals(13, fibonacciMemOptimised(7));
        assertEquals(21, fibonacciMemOptimised(8));
        assertEquals(34, fibonacciMemOptimised(9));
        assertEquals(55, fibonacciMemOptimised(10));
        assertEquals(89, fibonacciMemOptimised(11));
        assertEquals(144, fibonacciMemOptimised(12));
        assertEquals(233, fibonacciMemOptimised(13));
        assertEquals(377, fibonacciMemOptimised(14));
        assertEquals(610, fibonacciMemOptimised(15));
        assertEquals(987, fibonacciMemOptimised(16));
        assertEquals(1597, fibonacciMemOptimised(17));
        assertEquals(2584, fibonacciMemOptimised(18));
        assertEquals(4181, fibonacciMemOptimised(19));
        assertEquals(6765, fibonacciMemOptimised(20));
        assertEquals(10946, fibonacciMemOptimised(21));
        assertEquals(17711, fibonacciMemOptimised(22));
        assertEquals(28657, fibonacciMemOptimised(23));
        assertEquals(46368, fibonacciMemOptimised(24));
        assertEquals(75025, fibonacciMemOptimised(25));
        assertEquals(121393, fibonacciMemOptimised(26));
        assertEquals(196418, fibonacciMemOptimised(27));
        assertEquals(317811, fibonacciMemOptimised(28));
        assertEquals(514229, fibonacciMemOptimised(29));
        assertEquals(832040, fibonacciMemOptimised(30));
        assertEquals(1346269, fibonacciMemOptimised(31));
        assertEquals(2178309, fibonacciMemOptimised(32));
        assertEquals(3524578, fibonacciMemOptimised(33));
        assertEquals(5702887, fibonacciMemOptimised(34));
        assertEquals(9227465, fibonacciMemOptimised(35));
        assertEquals(14930352, fibonacciMemOptimised(36));
        assertEquals(24157817, fibonacciMemOptimised(37));
        assertEquals(39088169, fibonacciMemOptimised(38));
        assertEquals(63245986, fibonacciMemOptimised(39));
        assertEquals(102334155, fibonacciMemOptimised(40));
        assertEquals(165580141, fibonacciMemOptimised(41));
        assertEquals(267914296, fibonacciMemOptimised(42));
        assertEquals(433494437, fibonacciMemOptimised(43));
        assertEquals(701408733, fibonacciMemOptimised(44));
        assertEquals(1134903170, fibonacciMemOptimised(45));
        assertEquals(1836311903, fibonacciMemOptimised(46));
        assertEquals(2971215073L, fibonacciMemOptimised(47));
        assertEquals(4807526976L, fibonacciMemOptimised(48));
        assertEquals(7778742049L, fibonacciMemOptimised(49));
        assertEquals(12586269025L, fibonacciMemOptimised(50));
        assertEquals(20365011074L, fibonacciMemOptimised(51));
        assertEquals(32951280099L, fibonacciMemOptimised(52));
        assertEquals(53316291173L, fibonacciMemOptimised(53));
        assertEquals(86267571272L, fibonacciMemOptimised(54));
        assertEquals(139583862445L, fibonacciMemOptimised(55));
        assertEquals(225851433717L, fibonacciMemOptimised(56));
        assertEquals(365435296162L, fibonacciMemOptimised(57));
        assertEquals(591286729879L, fibonacciMemOptimised(58));
        assertEquals(956722026041L, fibonacciMemOptimised(59));
        assertEquals(1548008755920L, fibonacciMemOptimised(60));
        assertEquals(2504730781961L, fibonacciMemOptimised(61));
        assertEquals(4052739537881L, fibonacciMemOptimised(62));
        assertEquals(6557470319842L, fibonacciMemOptimised(63));
        assertEquals(10610209857723L, fibonacciMemOptimised(64));
        assertEquals(17167680177565L, fibonacciMemOptimised(65));
        assertEquals(27777890035288L, fibonacciMemOptimised(66));
        assertEquals(44945570212853L, fibonacciMemOptimised(67));
        assertEquals(72723460248141L, fibonacciMemOptimised(68));
        assertEquals(117669030460994L, fibonacciMemOptimised(69));
        assertEquals(190392490709135L, fibonacciMemOptimised(70));
        assertEquals(308061521170129L, fibonacciMemOptimised(71));
        assertEquals(498454011879264L, fibonacciMemOptimised(72));
        assertEquals(806515533049393L, fibonacciMemOptimised(73));
        assertEquals(1304969544928657L, fibonacciMemOptimised(74));
        assertEquals(2111485077978050L, fibonacciMemOptimised(75));
        assertEquals(3416454622906707L, fibonacciMemOptimised(76));
        assertEquals(5527939700884757L, fibonacciMemOptimised(77));
        assertEquals(8944394323791464L, fibonacciMemOptimised(78));
        assertEquals(14472334024676221L, fibonacciMemOptimised(79));
        assertEquals(23416728348467685L, fibonacciMemOptimised(80));
        assertEquals(37889062373143906L, fibonacciMemOptimised(81));
        assertEquals(61305790721611591L, fibonacciMemOptimised(82));
        assertEquals(99194853094755497L, fibonacciMemOptimised(83));
        assertEquals(160500643816367088L, fibonacciMemOptimised(84));
        assertEquals(259695496911122585L, fibonacciMemOptimised(85));
        assertEquals(420196140727489673L, fibonacciMemOptimised(86));
        assertEquals(679891637638612258L, fibonacciMemOptimised(87));
        assertEquals(1100087778366101931L, fibonacciMemOptimised(88));
        assertEquals(1779979416004714189L, fibonacciMemOptimised(89));
        assertEquals(2880067194370816120L, fibonacciMemOptimised(90));
        assertEquals(4660046610375530309L, fibonacciMemOptimised(91));
        assertEquals(7540113804746346429L, fibonacciMemOptimised(92));

    }

    @Test
    void compareFibonacciRecursionWithFibonacciWithTempArrayDP() {
        for (int i = 0; i <= 100; i++) {
            int n = generateRandomNumber(MIN_N, RECURSION_MAX_N);
            assertEquals(fibonacciRecursion(n), fibonacciWithTempArrayDP(n));
        }
    }

    @Test
    void compareFibonacciRecursionWithFibonacciMemOptimised() {
        for (int i = 0; i <= 100; i++) {
            int n = generateRandomNumber(MIN_N, RECURSION_MAX_N);
            assertEquals(fibonacciRecursion(n), fibonacciMemOptimised(n));
        }
    }

    @Test
    void compareFibonacciWithTempArrayDPWithFibonacciMemOptimised() {
        for (int i = 0; i <= 1_000_00; i++) {
            int n = generateRandomNumber(MIN_N, MAX_N);
            assertEquals(fibonacciWithTempArrayDP(n), fibonacciMemOptimised(n));
        }
    }

    @Test
    void testLastDigitOfFibonacci() {
        assertEquals(BigInteger.valueOf(0), lastDigitOfFibonacci(0));
        assertEquals(BigInteger.valueOf(1), lastDigitOfFibonacci(1));
        assertEquals(BigInteger.valueOf(1), lastDigitOfFibonacci(2));
        assertEquals(BigInteger.valueOf(2), lastDigitOfFibonacci(3));
        assertEquals(BigInteger.valueOf(3), lastDigitOfFibonacci(4));
        assertEquals(BigInteger.valueOf(5), lastDigitOfFibonacci(5));
        assertEquals(BigInteger.valueOf(8), lastDigitOfFibonacci(6));
        assertEquals(BigInteger.valueOf(3), lastDigitOfFibonacci(7));
        assertEquals(BigInteger.valueOf(1), lastDigitOfFibonacci(8));
        assertEquals(BigInteger.valueOf(4), lastDigitOfFibonacci(9));
        assertEquals(BigInteger.valueOf(5), lastDigitOfFibonacci(10));
        assertEquals(BigInteger.valueOf(9), lastDigitOfFibonacci(11));
        assertEquals(BigInteger.valueOf(4), lastDigitOfFibonacci(12));
        assertEquals(BigInteger.valueOf(3), lastDigitOfFibonacci(13));
        assertEquals(BigInteger.valueOf(7), lastDigitOfFibonacci(14));
        assertEquals(BigInteger.valueOf(0), lastDigitOfFibonacci(15));
        assertEquals(BigInteger.valueOf(7), lastDigitOfFibonacci(16));
        assertEquals(BigInteger.valueOf(7), lastDigitOfFibonacci(17));
        assertEquals(BigInteger.valueOf(4), lastDigitOfFibonacci(18));
        assertEquals(BigInteger.valueOf(1), lastDigitOfFibonacci(19));
        assertEquals(BigInteger.valueOf(5), lastDigitOfFibonacci(20));
        assertEquals(BigInteger.valueOf(6), lastDigitOfFibonacci(21));
        assertEquals(BigInteger.valueOf(1), lastDigitOfFibonacci(22));
        assertEquals(BigInteger.valueOf(7), lastDigitOfFibonacci(23));
        assertEquals(BigInteger.valueOf(8), lastDigitOfFibonacci(24));
        assertEquals(BigInteger.valueOf(5), lastDigitOfFibonacci(25));
        assertEquals(BigInteger.valueOf(3), lastDigitOfFibonacci(26));
        assertEquals(BigInteger.valueOf(8), lastDigitOfFibonacci(27));
        assertEquals(BigInteger.valueOf(1), lastDigitOfFibonacci(28));
        assertEquals(BigInteger.valueOf(9), lastDigitOfFibonacci(29));
        assertEquals(BigInteger.valueOf(0), lastDigitOfFibonacci(30));
    }

    @Test
    void testLastDigitOfFibonacciNumberMemOptimised() {
        assertEquals(0, lastDigitOfFibonacciNumberMemOptimised(0));
        assertEquals(1, lastDigitOfFibonacciNumberMemOptimised(1));
        assertEquals(1, lastDigitOfFibonacciNumberMemOptimised(2));
        assertEquals(2, lastDigitOfFibonacciNumberMemOptimised(3));
        assertEquals(3, lastDigitOfFibonacciNumberMemOptimised(4));
        assertEquals(5, lastDigitOfFibonacciNumberMemOptimised(5));
        assertEquals(8, lastDigitOfFibonacciNumberMemOptimised(6));
        assertEquals(3, lastDigitOfFibonacciNumberMemOptimised(7));
        assertEquals(1, lastDigitOfFibonacciNumberMemOptimised(8));
        assertEquals(4, lastDigitOfFibonacciNumberMemOptimised(9));
        assertEquals(5, lastDigitOfFibonacciNumberMemOptimised(10));
        assertEquals(9, lastDigitOfFibonacciNumberMemOptimised(11));
        assertEquals(4, lastDigitOfFibonacciNumberMemOptimised(12));
        assertEquals(3, lastDigitOfFibonacciNumberMemOptimised(13));
        assertEquals(7, lastDigitOfFibonacciNumberMemOptimised(14));
        assertEquals(0, lastDigitOfFibonacciNumberMemOptimised(15));
        assertEquals(7, lastDigitOfFibonacciNumberMemOptimised(16));
        assertEquals(7, lastDigitOfFibonacciNumberMemOptimised(17));
        assertEquals(4, lastDigitOfFibonacciNumberMemOptimised(18));
        assertEquals(1, lastDigitOfFibonacciNumberMemOptimised(19));
        assertEquals(5, lastDigitOfFibonacciNumberMemOptimised(20));
        assertEquals(6, lastDigitOfFibonacciNumberMemOptimised(21));
        assertEquals(1, lastDigitOfFibonacciNumberMemOptimised(22));
        assertEquals(7, lastDigitOfFibonacciNumberMemOptimised(23));
        assertEquals(8, lastDigitOfFibonacciNumberMemOptimised(24));
        assertEquals(5, lastDigitOfFibonacciNumberMemOptimised(25));
        assertEquals(3, lastDigitOfFibonacciNumberMemOptimised(26));
        assertEquals(8, lastDigitOfFibonacciNumberMemOptimised(27));
        assertEquals(1, lastDigitOfFibonacciNumberMemOptimised(28));
        assertEquals(9, lastDigitOfFibonacciNumberMemOptimised(29));
        assertEquals(0, lastDigitOfFibonacciNumberMemOptimised(30));
    }

    @Test
    void compareLastDigitOfFibonacciWithLastDigitOfFibonacciNumberMemOptimised() {
        for (int i = 0; i <= 10_000; i++) {
            int n = generateRandomNumber(MIN_N, MAX_N_FOR_LAST_DIGIT);
            assertEquals(lastDigitOfFibonacci(n).intValue(), lastDigitOfFibonacciNumberMemOptimised(n));
        }
    }

    @Test
    void pisanoPeriodTest() {
        assertEquals(1, pisanoPeriod(1));
        assertEquals(3, pisanoPeriod(2));
        assertEquals(8, pisanoPeriod(3));
        assertEquals(6, pisanoPeriod(4));
        assertEquals(20, pisanoPeriod(5));
        assertEquals(24, pisanoPeriod(6));
        assertEquals(16, pisanoPeriod(7));
        assertEquals(12, pisanoPeriod(8));
        assertEquals(24, pisanoPeriod(9));
        assertEquals(60, pisanoPeriod(10));
    }

    @Test
    void testHugeFibonacciNumber() {
        assertEquals(1, hugeFibonacciNumber(1, 239));
        assertEquals(885, hugeFibonacciNumber(115, 1000));
        assertEquals(151, hugeFibonacciNumber(2816213588L, 239));
        assertEquals(0, hugeFibonacciNumber(9999999999999L, 2));
    }

    @Test
    void testFibonacciSumLastDigit() {
        assertEquals(0, fibonacciSumLastDigit(0));
        assertEquals(1, fibonacciSumLastDigit(1));
        assertEquals(4, fibonacciSumLastDigit(3));
        assertEquals(5, fibonacciSumLastDigit(100));
        assertEquals(9, fibonacciSumLastDigit(1000000000000000L));
    }
}
