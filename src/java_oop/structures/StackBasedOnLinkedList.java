package java_oop.structures;

public class StackBasedOnLinkedList extends BasedOnLinkedListDataStorage{
    @Override
    protected void adNextItem(Item item){
        item.next = fist;
        fist = item;
    }

}
