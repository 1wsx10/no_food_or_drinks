public class NotAOrB implements BinaryBooleanOperation {
    private int internalValue;

    public NotAOrB() {
        this.internalValue = -1;
    }

    public boolean[] getTruthValues() throws Exception {
        if (internalValue == 4) {
            throw new Exception("Too high!");
        }
        boolean[] b = new boolean[3];
        b[0] = (internalValue & 1) == 1 ? true : false;
        b[1] = (internalValue & 2) == 2 ? true : false;
        b[2] = !b[0]||b[1];
        return b;
    }

    // @return: Whether there is a next value
    public boolean nextValue() {
        return ++internalValue < 4;
    }

}
