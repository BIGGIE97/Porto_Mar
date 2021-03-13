/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_mar;

/**
 * Implementação da classe Petroleiro que extende a classe abstrata Navio.
 * <p>
 * @author diogo
 */
public class Petroleiro extends Navio {
  
    private float capacidade_carga;
    
    
    public Petroleiro(String matricula_Navio, String nome, float comprimento, float capacidade_carga) {
        super(matricula_Navio, nome, comprimento );
        this.capacidade_carga = capacidade_carga;
    }
    
    

    @Override
    public float getCapacidade_carga() {
        return capacidade_carga;
    }

   /**
     * Método setter para o número de contentores num Navio.
     * @param capacidade_carga Capacidade de carga de um Navio.
     */
    public void setCapacidade_carga(float capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }
    
    @Override
    public String toString(){
        return super.toString()+ " tipo de navio: Petroleiro " + "capaciade de carga(toneladas): " + capacidade_carga;
    }
    
    
}
