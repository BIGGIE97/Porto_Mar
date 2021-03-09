/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_mar;

/**
 *
 * @author diogo
 */
public class Main {

    public static void main(String[] args) {

        try {
            Porto p = new Porto();
            Petroleiro n = new Petroleiro("abc", "Luisinho", 45, 100);
            Petroleiro h = new Petroleiro("abc", "Viana do Castelo", 63, 134);
            PortaContentores a = new PortaContentores("dch", "Rua", 73, 100);
            
            
            p.AddNavio(n);
           
            p.AddNavio(a);
        
        
            System.out.println(p.toString());
        
             p.AddNavio(h);
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
        
    
    
    
    }

}
