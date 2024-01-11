package java_oop.structures;

public final class QueueBasedOnArray extends BasedOnArrayDataStorage {
    public QueueBasedOnArray() {
    }

    public QueueBasedOnArray(int value) {
        super(value);
    }

    @Override
    protected int getIfNotEmpty() {
        int num = result[0];
        int[] current = new int[size - 1];
        System.arraycopy(result, 1, current, 0, size - 1);
        result = current;
        size--;
        return num;
    }
}

