
package rope;


public class TrieNode {
    static final int MAXN = 26;
    TrieNode[] children = new TrieNode[MAXN];
    char letter; 
    boolean isWord;
    int level;
    String word;
    int select;
    public TrieNode(char letter)

    {
        isWord = false;
        for (int i = 0; i < MAXN; i++)
        this.children[i] = null;
        this.letter = letter;  
         this.word = "";
       this.select = 0;
    }
    public TrieNode()

    {
        isWord = false;
        for (int i = 0; i < MAXN; i++)
            children[i] = null;
        this.letter = ' ';  
        this.word = "";
        this.select = 0;
    }
    
    
        
        
}
