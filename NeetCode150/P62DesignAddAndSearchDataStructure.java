package NeetCode150;
/*
LEETCODE 211
      ADD    SEARCH
SC    O(N)   O(26^N)
TC    O(N)   O(26*N)
*/
import java.util.HashMap;

public class P62DesignAddAndSearchDataStructure {
    class TrieNode{
    HashMap<Character, TrieNode> children = new HashMap<>();
    boolean word = false;
    public TrieNode(){}
}
class WordDictionary {
    TrieNode trie;

    public WordDictionary() {
        trie = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node = trie;
        for(char ch: word.toCharArray()){
            if(!node.children.containsKey(ch)){
                node.children.put(ch, new TrieNode());
            }
            node = node.children.get(ch);
        }
        node.word = true;
    }
    public boolean searchInNode(String word, TrieNode node){
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch=='.'){
                for(char x :node.children.keySet()){
                    TrieNode child = node.children.get(x); 
                    if(searchInNode(word.substring(i+1),child)){
                        return true;
                    }
                }
                return false;
            }
            if(!node.children.containsKey(ch)){
                return false;
            }
            node = node.children.get(ch);
        }
        return node.word;
    }

    public boolean search(String word) {
        return searchInNode(word, trie);
    }
}
}
