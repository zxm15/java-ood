package TypeAhead;

/**
 * Created by ZXM on 11/19/15.
 * this tree node should contain [a-z0-9] + white space, '.', '@'
 */
public class TrieNode {
    TrieNode[] node = new TrieNode[Trie.nodeSize];
    String word = "";

}
