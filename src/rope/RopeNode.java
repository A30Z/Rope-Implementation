/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rope;

/**
 *
 * @author hp
 */
public class RopeNode {
       
    RopeNode left, right , parent;
    String data;
    int weight;    

    public RopeNode(String data)

    {
        this.data = data;
        
        this.left = null;
        this.right = null;
        this.weight = data.length();
    }

    public RopeNode()

    {
        this.data = "";
        this.left = null;
        this.right = null;
        this.weight = 0;
    }
    

    
    
    
    
}
