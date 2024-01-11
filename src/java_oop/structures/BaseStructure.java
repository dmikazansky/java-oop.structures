package java_oop.structures;
 public interface BaseStructure {
      void add(int value);

      void add(DynaArray dynaArray);

      void add(int[] array);

      void add(LinkedList list);
      void clear();
      Integer size();
      boolean remove(int value);
      int[] toArray();
      boolean contains(int value);
}
