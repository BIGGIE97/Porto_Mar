/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_mar;

import java.util.HashMap;
import porto_mar.Navio;

/**
 *Implementação da classe porto onde é implementado as funcionalidades necessárias do nosso programa.
 * @author diogo
 */
public class Porto {
    
    
    HashMap<String, Navio> navios;
    
    
    public Porto(){
        
        this.navios= new HashMap<String, Navio>();
        
    }
    
    /**
     * Método AddNavio que adiciona um novo navio ao HashMap
     * e através de um ciclo if atribui e verifica se já existe
     * um navio com uma matrícula, caso exista, lança uma exceção.
     * 
     * @param n Novo navio criado no HashMap.
     * @throws Exception se existir 2 navios com a mesma matrícula.
     */
    
    public void AddNavio(Navio n) throws Exception {
        
        String matricula= n.getMatricula_Navio();
        if(this.navios.get(matricula)==null){
            this.navios.put(matricula, n);
        }else throw new Exception("Navio com matricula já existente (" + matricula + ")." );
        }
    
    /**
     * Método quant_contentores que usando um ciclo for vai buscar
     * através do método getMaxContentores() o número de contentores do Navio.
     * 
    * 
    * @return total de contentores do Navio.
    */
    public int quant_contentores(){
        int total= 0;
        for (Navio i : navios.values()) {
            total += i.getMaxContentores();
            }
        return total;
    }

    /**
     * Método capacidade_total que usando um ciclo for vai buscar
     * através do método getMaxContentores() o número de contentores do Navio.
     * <p>
     * Garante também se não existir Navios porta-contentores no porto o total
     * vai ser só a capacidade do navio petroleiro e caso exista porta-contentores
     * o total vai ser a capacidade do navio petroleiro mais os contentores do navio
     * vezes 10, pois cada contentor pesa 10 toneladas.
     * 
    * 
    * @return total de contentores do Navio.
    */
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

    /**
     * Implementaçã da método toString() para nos devolver o resultado do programa,
     * ou seja, a quantidade de contentores e a capacidade total dos navios no Porto.
     * @return 
     */
    public String toString(){
        String resultado = "Porto:\n";
        
        for (Navio i : navios.values()) {
            resultado += i.toString() + "\n";
        }
        resultado += "quantidade de contentores: " + this.quant_contentores() + "\n";
        resultado += "capacidade total : " + this.capacidade_total() + " toneladas \n";
        
        return resultado;
    }



}
