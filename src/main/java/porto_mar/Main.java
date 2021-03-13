/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_mar;

/**
 *Este programa implementa uma solução para o registo de navios num porto de
mar, que nos retorna no ecrã:
* <p>
* •A quantidade máxima total de contentores de todos os navios porta contentores
atracados no porto;
* <p>
* • A capacidade total de carga de todos os navios porta contentores e petroleiros
atracados no porto, sabendo que um contentor tem capacidade para 10 toneladas;
 *<p>
 * 
 * Cria também um porto com um navio petroleiro e um navio porta contentores, garantindo
 * que as matrículas dos navios não se repetem.
 * 
 * 
 * 
 * @author diogo
 * @version 2.0
 * @since 09/03/2021
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
