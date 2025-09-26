public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value > 0) {
            this.value -= 1;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public static void main(String[] main) {
        DecreasingCounter number = new DecreasingCounter(10);

        number.decrement();
        number.reset();
        number.decrement();
        number.printValue();
    }
}
