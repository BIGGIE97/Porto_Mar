/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_mar;

/**
 * Implementação da classe abstrata Navio que recebe todos os atributos
 * partilhados por as subsquentes classes entendidas a partir desta do tipo navio.
 *
 * @author diogo
 * @param
 */
public abstract class Navio {
    
    private String matricula_Navio;
    private String nome;
    private float comprimento;

    public Navio(String matricula_Navio, String nome, float comprimento) {
        this.nome=nome;
        this.matricula_Navio = matricula_Navio;
        this.comprimento = comprimento;
        
    }

    
    /**
     * Método getter para a matricula do Navio.
     * 
     * @return matricula do Navio.
     * 
     */
    public String getMatricula_Navio() {
        return matricula_Navio;
    }

    /**
     * Método getter para o nome do Navio.
     * 
     * @return nome do Navio.
     * 
     */
    public String getNome(String nome) {
        return nome;
    }
    
    /**
     * Método getter para o comprimento do Navio.
     * 
     * @return comprimento do Navio.
     * 
     */
    public float getComprimento(float comprimento) {
        return comprimento;
    }
    
    
    /**
     * Método getter para o número de contentores do Navio.
     * 
     * @return número de contentores do Navio.
     * 
     */
     public int getMaxContentores() {
        return 0;
    }
    
     /**
     * Método getter para a capacidade de carga do Navio.
     * 
     * @return capacidade de carga do Navio.
     * 
     */
    public float getCapacidade_carga() {
        return 0;
    }
    
    
    /**
     * Método setter para o nome do Navio.
     * <p>
     * Atribui o nome do Navio.
     * 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método setter para o comprimento do Navio.
     * <p>
     * Atribui o comprimento ao Navio.
     * 
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
   
    /**
     * Implementação da classe toString().
     * 
     * @returns nome do navio, matricula e comprimento.
     * 
     */
    public String toString(){
        return "nome do navio:" + nome +" Matricula: "+ matricula_Navio + " Comprimento: " + comprimento;
    }
  
}
