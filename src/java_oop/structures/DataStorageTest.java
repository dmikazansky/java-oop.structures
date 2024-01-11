package java_oop.structures;

public class DataStorageTest {
    public static void main(String[] args) {
        DataStorage dataStorage = new QueueBasedOnArray();


        for (int i = 0; i < 10; i++) {
            dataStorage.add(i);
        }


        // 4 3 2 1 0 - for Stack
        // 0 1 2 3 4 - for Queue
        while (dataStorage.size() > 0) {
            System.out.print(dataStorage.get() + " ");
        }
        System.out.println();

        DataStorage dataStorage1 = new StackBasedOnArray();
        for (int i = 0; i < 10; i++) {
            dataStorage1.add(i);
        }

        while (dataStorage1.size() > 0) {
            System.out.print(dataStorage1.get() + " ");
        }
        System.out.println();

        QueueBasedOnLinkedList queueBasedOnLinkedList = new QueueBasedOnLinkedList();
        for (int i = 0; i < 10; i++) {
            queueBasedOnLinkedList.add(i);
        }
        while (queueBasedOnLinkedList.size() > 0) {
            System.out.print(queueBasedOnLinkedList.get() + " ");

        }
        System.out.println();

        StackBasedOnArray stackBasedOnArray = new StackBasedOnArray();
        for (int i = 0; i < 10; i++) {
            stackBasedOnArray.add(i);
        }
        while (stackBasedOnArray.size() > 0) {
            System.out.print(stackBasedOnArray.get() + " ");
        }
    }}
