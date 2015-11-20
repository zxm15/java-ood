package CircularArray;

import java.util.Iterator;

/**
 * Created by ZXM on 11/19/15.
 */
public class CircularArray<T> implements Iterable<T> {

    private T[] array;
    private int head = 0; //the head index of the rotated array

    public Iterator<T> iterator() {
        return new CircularArrayIterator<T>(this);
    }

    private class CircularArrayIterator<T> implements Iterator<T> {

        private T[] items;
        private int current = -1;

        public CircularArrayIterator(CircularArray<T> items) {
            this.items = items.array;
        }
        public boolean hasNext() {
            return current < items.length - 1;
        }

        public T next() {
            current++;
            T item = items[convert(current)];
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    public CircularArray(int size) {
        array = (T[]) new Object[size];
    }

    public int convert(int index) {
        if (index < 0) {
            index += array.length;
        }
        return (head + index) % array.length;
    }

    public void rotate(int shiftRight) {
        head = convert(shiftRight);
    }

    public T get(int i) {
        if (i < 0 || i >= array.length)
            throw new IndexOutOfBoundsException();
        return array[convert(i)];
    }

    public void set(int i, T item) {
        array[convert(i)] = item;
    }

    public static void main(String[] args) {
        int size = 5;
        CircularArray<Integer> solution = new CircularArray<Integer>(size);
        for (int i = 0; i < size; i++) {
            solution.set(i, i + 1);
        }
        System.out.println(solution.get(0));
        solution.rotate(2);
        System.out.println(solution.get(0));

        for (Integer i : solution.array) {
            System.out.print(i);
        }
        System.out.println();
    }
}

/**test
 * note that now he said shift to the right means moving element from left end
 *                    rotate          head
 *  1,2,3,4,5         2
 *  3,4,5,1,2         4
 *  2,3,4,5,1
 *
 *                    
 *
 *
 */

