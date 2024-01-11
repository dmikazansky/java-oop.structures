package java_oop.structures;

public abstract class BasedOnLinkedListDataStorage extends BaseDataStorage {
    protected Item fist;


   @Override
    public void add(int value) {
        Item item = new Item(value);
        if (fist == null) {
            fist = item;
        } else {
            adNextItem(item);
        }
        size++;
    }

    protected abstract void adNextItem(Item item);

    @Override
    public int get() {
        if (size > 0) {
            int num = fist.value;
            fist = fist.next;
            size--;
            return num;
        }
        return 0;
    }
    protected class Item {
        protected int value;

        protected Item next;

        private Item(int value) {
            this.value = value;
        }
    }
}
