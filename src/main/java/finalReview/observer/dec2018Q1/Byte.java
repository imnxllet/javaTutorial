package finalReview.observer.dec2018Q1;

public class Byte {
    /**
     * The bits. The least significant bit is at index 7.
     */
    private Bit[] bits = new Bit[8];

    /**
     * A new byte with all zeroes.
     */
    public Byte() {
        // Make the binary representation of 0
        for (int i = 0; i != bits.length; i++) {
            bits[i] = new Bit();
        }

        // Make each bit observe the bit next to it. (Which order should you go in?)
        for (int j = bits.length - 1; j > 0; j--) {
            bits[j].addObserver(bits[j - 1]);
        }
    }

    /**
     * Add one to the bit sequence.
     */
    public void increment() {
        bits[7].flip();
    }

    @Override
    public String toString() {
        String result = "";
        for (Bit bit : bits) {
            result += (bit.isOn() ? 1 : 0);
        }

        return result;
    }

    public static void main(String[] args) {
        Byte b = new Byte();
        System.out.println(b);

        b.increment();
        System.out.println(b);

        b.increment();
        System.out.println(b);

        b.increment();
        System.out.println(b);

        b.increment();
        System.out.println(b);
    }
}