package java_oop.structures;

public final class StackBasedOnArray extends BasedOnArrayDataStorage {

    public StackBasedOnArray() {
    }

    public StackBasedOnArray(int value) {
        super(value);
    }

    protected int getIfNotEmpty() {
        int num = result[size - 1];
        int[] current = new int[size - 1];
        System.arraycopy(result, 0, current, 0, size - 1);
        result = current;
        size--;
        return num;
    }

}
