/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_mar;

/**
 * Implementação da classe PortaContentores que extende a classe abstrata Navio.
 * <p>
 * @author diogo
 */
public class PortaContentores extends Navio {
    
    private int maxContentores;

    public PortaContentores(String matricula_Navio, String nome, float comprimento, int maxContentores) {
        super(matricula_Navio, nome, comprimento);
        this.maxContentores = maxContentores;
        
    }
    
    

    @Override
    public int getMaxContentores() {
        return maxContentores;
    }

    /**
     * Método setter para o número de contentores num navio.
     * @param maxContentores Número de contentores.
     */
    public void setMaxContentores(int maxContentores) {
        this.maxContentores = maxContentores;
    }

public String toString(){
        return super.toString()+ " tipo de navio: Porta Contentores " + "numero de contentores: " + maxContentores;
    }



}
