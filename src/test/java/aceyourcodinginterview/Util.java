package aceyourcodinginterview;

public class Util {

    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
