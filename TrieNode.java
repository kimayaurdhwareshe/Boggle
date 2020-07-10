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
public class TrieNode {
    private final TrieNode[] children;
    private boolean isWord = false;

    public TrieNode() {
        this.children = new TrieNode[26];
    }

    public TrieNode addChild(char child) {
        if (child < 'a' || child > 'z')
            return null;

        int offset = child - 'a';
        if (this.children[offset] == null) {
            this.children[offset] = new TrieNode();
        }
        return this.children[offset];
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean isWord) {
        this.isWord = isWord;
    }

    public TrieNode get(char c) {
        int offset = c - 'a';
        return this.children[offset];
    }
}


