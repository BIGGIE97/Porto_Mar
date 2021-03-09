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
public class PortaContentores extends Navio {
    
    private int maxContentores;

    public PortaContentores(String matricula_Navio, String nome, float comprimento, int maxContentores) {
        super(matricula_Navio, nome, comprimento);
        this.maxContentores = maxContentores;
        
    }
    
    

    public int getMaxContentores() {
        return maxContentores;
    }

    public void setMaxContentores(int maxContentores) {
        this.maxContentores = maxContentores;
    }
}
