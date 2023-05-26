
package rope;

import java.util.PriorityQueue;

/**
 *
 * @author hp
 */
public class Trie {
    PriorityQueue<String> pq = new PriorityQueue<>();
    PriorityQueue<String> fi = new PriorityQueue<>();
     static final int MAXN = 26;
     String words[] = new String[1000];
     int q=1;
    TrieNode root;
    TrieNode temp;
    int i;
    
    public Trie()

    {
        root = new TrieNode();
    }
    public void find(String str){
        temp = new TrieNode();
        temp = root;
        int level;
        int length = str.length();
        int index;
        for (level = 0; level < length; level++)
        {
            index = str.charAt(level) - 'a';
            if (temp.children[index] == null){
                System.out.print("oops");
                return;
                
            }    
            temp = temp.children[index];
        }
        q=1;
        print(temp);
        
    }
    public void addnumber(String str){
     
        temp = new TrieNode();
        temp = root;
        int level;
        int length = str.length();
        int index;
        for (level = 0; level < length; level++)
        {
            index = str.charAt(level) - 'a';
            if (temp.children[index] == null){
                System.out.print("oops");
                return;
                
            }    
            temp = temp.children[index];
        }
        
       if(temp.word.startsWith(str))
            temp.select++;
      
    }
    public void insert(String str){
        temp = new TrieNode();
        temp = root;
        int level;
        int length = str.length();
        int index;
        for (level = 0; level < length; level++)
        {
            index = str.charAt(level) - 'a';
            if (temp.children[index] == null){
                temp.children[index] = new TrieNode();
                temp.children[index].letter = str.charAt(level);
                temp.children[index].word = temp.word + str.charAt(level);
         
                
            }    
            temp = temp.children[index];
        }
        temp.isWord = true;
    }
    public void print(TrieNode temp){
       
        for(int i=0 ; i<MAXN ; i++){
            if(temp.children[i]!= null){
                print(temp.children[i]);
            }
        }
            if(temp.isWord){
                for(int i=0;i<1000;i++){
                    if(words[i]=="")
                        break;
               }
               pq.add( (9-temp.select) + temp.word);
                
              
                
            }
    }
    public void show(){
        int m=pq.size();
        int h;
        for(int i=0;i<m;i++){
           words[i]=pq.peek(); 
           h=Character.getNumericValue(pq.peek().charAt(0)); 
            System.out.print(i+1 + ". " + pq.poll().substring(1) + "(" + (h-9)*-1 + ")\n");
           
            
        }
    }
}
