
package rope;

import java.io.File;
import java.util.Scanner;
import java.io.*;

public class RopeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       Rope test = new Rope();
        Trie tes = new Trie();
        int m=0;
		File file = new File(
			"C:\\Users\\hp\\Desktop\\test.txt");

		BufferedReader br
			= new BufferedReader(new FileReader(file));

		
		String st;
		
		while ((st = br.readLine()) != null){
                 m=0;
                   for(int i=0;i<st.length();i++){
                       if(st.charAt(i)==' ')
                          
                           break;
                       m++;
                   }
                       tes.insert(st.substring(0,m));
                }
	


       
        
        Scanner input = new Scanner(System.in);
        String command ="";
        while(!command.startsWith("close")){
        
           command=input.next();
            
           
           if(command.startsWith("status")){
                test.status();    
                System.out.print("\n\n");
            }
           
           
           else if(command.startsWith("new")){
                String n1 = input.next();
               test.add(n1.substring(1 , n1.length()-1));
            }
           
           
           else if (command.startsWith("index")){
                int n1 = input.nextInt();
                int n2 = input.nextInt();
                test.index(n1, n2);
                System.out.print("\n\n");
            }
           
           
           else if (command.startsWith("concat")){
                int n1 = input.nextInt();
                int n2 = input.nextInt();                
                test.concat(n1, n2);               
            }
      
           
           else if (command.startsWith("insert")){
                int n1 = input.nextInt();
                int i = input.nextInt();
                int n2 = input.nextInt();
                test.insert(n1, i, n2);
            }  
         
           
           else if (command.startsWith("delete")){
                int n1=input.nextInt();
                int i=input.nextInt();
                int n2=input.nextInt();
                test.delete(n1, i, n2);
            }  
          
           
           else if (command.startsWith("split")){
               
            }  
           
           
           else if(command.startsWith("add")){
                String n1 = input.next();
                tes.insert(n1);
            }
            
           
           else if(command.startsWith("autocomplete")){
                String n1 = input.next();
                tes.find(n1);
                tes.show();
                System.out.print("\n\n");
                int add = input.nextInt();
                test.add(tes.words[add-1].substring(1));
                tes.addnumber(tes.words[add-1].substring(1));
                for(int i=0;i<1000;i++)
                    tes.words[i]="";
                
            }
            
            
        
        
        }
        
        

    }
    
}
