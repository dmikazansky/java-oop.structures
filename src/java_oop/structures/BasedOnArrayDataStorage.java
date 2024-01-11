package java_oop.structures;

public abstract class BasedOnArrayDataStorage extends BaseDataStorage {
    public int[] result;


    protected BasedOnArrayDataStorage() {
        this(5);
    }

    protected BasedOnArrayDataStorage(int value) {
        result = new int[value];
    }


    @Override
    public final void add(int value) {
        if (result.length == size) {
            int[] current = result;
            result = new int[result.length * 2];
            System.arraycopy(current, 0, result, 0, size);
        }
        result[size] = value;
        size++;
    }

    @Override
    public final int get() {
        if (size > 0) {
            return getIfNotEmpty();
        }
        return 0;
    }

    protected abstract int getIfNotEmpty();
}





