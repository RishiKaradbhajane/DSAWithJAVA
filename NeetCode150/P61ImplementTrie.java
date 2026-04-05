package NeetCode150;
/*
LEETCODE 208 */
public class P61ImplementTrie {
    class TrieNode{
    private TrieNode[] links;

    private final int R = 26;

    private boolean isEnd;

    public TrieNode(){
        links = new TrieNode[R];
    }
    public boolean containsKey(char ch){
        return links[ch-'a'] != null;
    }
    public TrieNode get(char ch){
        return links[ch-'a'];
    } 
    public void put(char ch, TrieNode node){
        links[ch-'a'] = node;
    }
    public void setEnd(){
        isEnd = true;
    }
    public boolean isEnd(){
        return isEnd;
    }
}
class Trie {
    public TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for(int i=0; i<word.length();i++){
            char currChar = word.charAt(i);
            if(!node.containsKey(currChar)){
                node.put(currChar, new TrieNode());
            }
            node = node.get(currChar);
        }
        node.setEnd();
    }
    public TrieNode searchPrefix(String word){
        TrieNode node = root;
        for(int i=0; i<word.length();i++){
            char currChar = word.charAt(i);
            if(node.containsKey(currChar)){
                node = node.get(currChar);
            }else{
                return null;
            }
        }
        return node;
    }
    
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();

    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }
}
}
