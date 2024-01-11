package java_oop.structures;

public abstract class BaseDataStructure implements BaseStructure {
    protected int count;

    @Override
    public final Integer size() {
        return count;
    }

    @Override
    public void clear() {
        count = 0;
    }


    @Override
    public void add(DynaArray dynaArray) {
        add(dynaArray.toArray());
    }

    @Override
    public void add(int[] array) {
        for (int i = 0; i < array.length; i++) {
            add(array[i]);
        }
    }

    @Override
    public void add(LinkedList list) {
        add(list.toArray());
    }
}
