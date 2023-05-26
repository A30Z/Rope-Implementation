package rope;

public class Rope {
    int i;
    RopeNode root;

    public Rope()

    {
        root = new RopeNode("");
    }

    public void makeEmpty()

    {
        root = new RopeNode("");
    }
    
    public void printPreorder(RopeNode node)
    {
        if(node==root)
         i=1;
        if (node == null)
            return;
        if(node.data != "" && node.data != " ")
        System.out.print(i++ + ". " + node.data + "\n");        
        printPreorder(node.left);
        printPreorder(node.right);
    }
    public RopeNode findNode(int t){
         RopeNode node = root;
         i=1;
        node=root.right;
        while(node.right!=null){
            if(node.left==null){
                return node;                
            }
            if(node.left.data=="")
                i--;
            if(i==t)
                return node.left;
            i++;
            node=node.right;
        }
        
       return node;
        
        
    } 
    
    public void delete (int s , int m , int n){
        RopeNode n1 = findNode(s);
        n1.data = n1.data.substring(0,m) + n1.data.substring(n);
    }
    
    public void split(int s , int m){
        RopeNode n1 = findNode(s);
        
    }
    public void concat(int s1 , int s2){
        RopeNode n1 = findNode(s1);
        RopeNode n2 = findNode(s2);
        n1.data = n1.data + n2.data;
        n2.data=" ";
    }
    
    public void insert(int s1,int i , int s2){
        RopeNode n1 = findNode(s1);
        RopeNode n2 = findNode(s2);
        n1.data = n1.data.substring(0, i) + n2.data + n1.data.substring(i);
        
    }
    public void status(){
      printPreorder (root);
    }
    
    public void add(String str){
    RopeNode temp = root;
    RopeNode ne = new RopeNode() ;
    RopeNode nel = new RopeNode() ;
    if(temp.right!=null){
        while(temp.data==""){
            temp=temp.right;
        }
        ne.data=str;
        ne.parent=temp;
        ne.weight=str.length();
        ne.parent=temp;
        temp.right = ne;
        nel.data = temp.data;
        nel.weight = temp.weight;
        nel.parent = temp;
        temp.left=nel;
        temp.data="";
    }
    else{
      ne.data=str;  
      ne.parent=temp;
      temp.right=ne;
              }
        
    }
    
    public void index(int s , int m){
      
        RopeNode node = findNode(s);
        System.out.print(node.data.charAt(m-1) + "\n");
    }
   
   

   

 
}
