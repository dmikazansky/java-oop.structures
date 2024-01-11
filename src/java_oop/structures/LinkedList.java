/*
 * Copyright 2019. http://devonline.academy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package java_oop.structures;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public final class LinkedList extends BaseDataStructure {

    private Item first;

    private Item last;

    @Override
    public void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = last = item;
        } else {
            last.next = item;
            last = item;
        }
        count++;
    }


    @Override
    public void add(LinkedList list) {
        if (list.count > 0) {
            if (first == null) {
                first = list.first;
            } else {
                last.next = list.first;
            }
            last = list.last;
            count += list.count;
        }
    }
    @Override
    public int[] toArray() {
        int[] array = new int[count];
        Item current = first;
        for (int i = 0; i < array.length; i++) {
            array[i] = current.value;
            current = current.next;
        }
        return array;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder().append("[");
        Item current = first;
        while (current != null) {
            stringBuilder.append(current.value);
            if (current.next != null) {
                stringBuilder.append(", ");
            }
            current = current.next;
        }
        return stringBuilder.append("]").toString();
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        super.clear();
    }
    @Override
    public boolean remove(int value) {
        var flag = false;
        Item current = first;
        Item result = null;
        while (current != null) {
            if (current.value == value) {
                result = current;
                flag = true;
                count--;
            }
            current = current.next;
        }
        if (result != null) {
            current = first;
            while (current != null) {
                if (result == first) {
                    first = first.next;
                    break;
                } else if (current.next.value == result.value) {
                    current.next = result.next;
                    break;
                }
                current = current.next;
            }
        }
        return flag;
    }

    @Override
    public boolean contains(int value) {
        Item current = first;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    private static class Item {

        private int value;

        private Item next;
        {}

        private Item(int value) {
            this.value = value;
        }
    }
}


