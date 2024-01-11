package java_oop.structures;

public abstract class BaseDataStorage implements DataStorage {
    int size;
    @Override
    public final int size() {
        return size;
    }
}
