/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boggle4;

/**
 *
 * @author ikiki
 */
public class Trie {
    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = this.root;
        for (char c : word.toCharArray()) {
            node = node.addChild(c);
            if (node == null)
                return;
        }
        node.setWord(true);
    }

    public TrieNode match(String s) {
        TrieNode node = this.root;
        for (char c : s.toCharArray()) {
            node = node.get(c);
            if (node == null)
                return null;
        }
        return node;
    }
}


