/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_mar;

import java.util.HashMap;
import porto_mar.Navio;

/**
 *
 * @author diogo
 */
public class Porto {
    
    
    HashMap<String, Navio> navios;
    
    
    public Porto(){
        
        this.navios= new HashMap<String, Navio>();
        
    }
    
    public void AddNavio(Navio n) throws Exception {
        
        String matricula= n.getMatricula_Navio();
        if(this.navios.get(matricula)==null){
            this.navios.put(matricula, n);
        }else throw new Exception("Navio com matricula já existente");
        }
    

    public int quant_contentores(){
        int total= 0;
        for (Navio i : navios.values()) {
            total += i.getMaxContentores();
            }
        return total;
    }

    public float capacidade_total(){
       
        float total= 0;
        for (Navio i : navios.values()) {
            int aux=i.getMaxContentores();
            
            if(aux==0){
                total += i.getCapacidade_carga();
            } else total += aux*10;
            }
        return total;
        
        
    }





}
