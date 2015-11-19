package TypeAhead;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Trie {
    private static Map<Character, Integer> map = new HashMap<>(); //map character to index

    private static Map<Character, Integer> charMap = new HashMap<>(); //map character to index
    public final static int nodeSize = map.size();
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        if (word == null) return;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            int index = map.get(ch);
            if (curr.node[index] == null) {
                curr.node[index] = new TrieNode();
            }
            curr = curr.node[index];
        }
        curr.word = word;
    }

    public void removeWord(String word) {
        removeWordHelper(root, word, 0);
    }

    /**
     * backtracking to check if a path could be deleted
     * @param curr
     * @param word
     * @param index
     * @return
     */

    public boolean removeWordHelper(TrieNode curr, String word, int index) {
        if (index == word.length()) {
            if (curr.word.equals(word)) {
                curr.word = "";
                return isEmptyNode(curr, -1);
            }
            return false;
        }
        int nodeIndex = getNodeIndex(word, index);
        TrieNode next = curr.node[nodeIndex];
        if (next == null) return false;
        if (removeWordHelper(next, word, index + 1)) {
            if (isEmptyNode(curr, nodeIndex)) {
                //remove the path
                curr.node[nodeIndex] = null;
                return true;
            }
        }

        return false;

    }

    private boolean isEmptyNode(TrieNode curr, int expIndex) {
        for (int i = 0; i < nodeSize; i++) {
            if (i == expIndex) continue;
            if (curr.node[i] != null) return false;
        }

        return true;
    }

    private int getNodeIndex(String word, int index) {
        char ch = word.charAt(index);
        if (! map.containsKey(ch))
            throw new IllegalArgumentException("The input is not valid");
        return map.get(ch);
    }

    public void updateWord(String oldWord, String newWord) {
        removeWord(oldWord);
        addWord(newWord);
    }

    public boolean isPrefix(String prefix) {
        if (prefix == null) return false;
        TrieNode curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int nodeIndex = getNodeIndex(prefix, i);
            TrieNode next = curr.node[nodeIndex];
            if (next == null) return false;
            curr = next;
        }

        return true;
    }

    public TrieNode getPrefixNode(String prefix) {
        if (prefix == null) return null;
        TrieNode curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int nodeIndex = getNodeIndex(prefix, i);
            TrieNode next = curr.node[nodeIndex];
            if (next == null) return null;
            curr = next;
        }

        return curr;
    }

    public boolean isWord(String word) {
        if (word == null) return false;
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int nodeIndex = getNodeIndex(word, i);
            TrieNode next = curr.node[nodeIndex];
            if (next == null) return false;
            curr = next;
        }

        return curr.word.equals(word);
    }

    public List<String> containsPrefix(String prefix) {
        List<String> res = new ArrayList<>();
        TrieNode prefixNode = getPrefixNode(prefix);
        if (prefixNode == null) return res;
        findAllWordsStartsWithPrefix(prefixNode, prefix, res);
        return res;
    }

    private void findAllWordsStartsWithPrefix(TrieNode curr, String word, List<String> res) {
        if (curr == null) return;

        if (! curr.word.isEmpty()) {
            res.add(curr.word);
        }


        for (int i = 0; i < nodeSize; i++) {
            TrieNode next = curr.node[i];
            if (next != null) {
                findAllWordsStartsWithPrefix(next, word + charMap.get(i), res);
            }
        }
    }






}
