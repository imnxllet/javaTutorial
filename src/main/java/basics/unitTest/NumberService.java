package basics.unitTest;

public class NumberService {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public void throwException() {
        throw new RuntimeException("Error!");
    }
}
