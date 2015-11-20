package CircularArray;

/**
 * Created by ZXM on 11/19/15.
 */
public class RotateArray<T> {

    private T[] array;
    private int head = 0; //the head index of the rotated array


    public RotateArray(int size) {
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


}

/**test
 *                    rotate          head
 *  1,2,3,4,5         2
 *  4,5,1,2,3                   
 *  5,1,2,3,4         4
 *
 *                    
 *
 *
 */

