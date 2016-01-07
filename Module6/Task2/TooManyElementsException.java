public class TooManyElementsException extends Exception {
    private int minElements;

    public TooManyElementsException(int minElements) {
        this.minElements = minElements;
    }

    public int getMinElements() {
        return minElements;
    }
}
