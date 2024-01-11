package java_oop.structures;

public class QueueBasedOnLinkedList extends BasedOnLinkedListDataStorage {
    private Item last;
   @Override
    protected void adNextItem(Item item){
       if (last == null) {
           last = fist;
       }
       last.next = item;
       last = item;
    }
    @Override
    public int get() {
        int result = super.get();
        if (size == 0) {
            last = null;
        }
        return result;
    }
}
