package java_oop.structures;

public class Dynatest {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray(0);
        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(7);
        dynaArray.add(5);
        dynaArray.add(6);
        System.out.println(dynaArray.contains(3));
        LinkedList list = new LinkedList();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        dynaArray.add(list);
        System.out.println(dynaArray);
    }
}
