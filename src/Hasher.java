import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZXM on 11/19/15.
 */
class LinkedListNode<K, V> {
    LinkedListNode<K, V> prev;
    LinkedListNode<K, V> next;
    K key;
    V value;

    public LinkedListNode(K key, V Value) {
        this.value = value;
        this.key = key;
    }
}
public class Hasher<K, V> {

    private ArrayList<LinkedListNode<K, V>> arr;
    public Hasher(int capacity) {
        //the reason why we need this is due to getIndexForKey. Otherwise, array.size would be too small or even 0
        arr = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            arr.add(null);
        }
    }

    public void put(K key, V value) {
        LinkedListNode<K, V> node = getNodeForKey(key);
        if (node != null) {
            node.value = value;
            return;
        }
        node = new LinkedListNode<>(key, value);
        int index = getIndexForKey(key);
        LinkedListNode<K, V> head = arr.get(index);
        if (head == null) {
            arr.set(index, node);
        } else {
            node.next = head;
            head.prev = node;
        }
    }

    public V get(K key) {
        LinkedListNode<K, V> node = getNodeForKey(key);
        return node == null ? null : node.value;
    }

    // this part has not been finished
    public void remove(K key) {
        LinkedListNode<K, V> node = getNodeForKey(key);
        if (node == null) return;
        LinkedListNode prevNode = node.prev;
        LinkedListNode nextNode = node.next;
        if (prevNode != null) {
            prevNode.next = nextNode;
        }
    }

    private LinkedListNode<K, V> getNodeForKey(K key) {
        int index = getIndexForKey(key);
        LinkedListNode<K, V> curr = arr.get(index);
        while (curr != null) {
            if (curr.key == key) {
                return curr;
            }
            curr = curr.next;
        }

        return null;
    }
    private int getIndexForKey(K key) {
        return key.hashCode() % arr.size();
    }



}
