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
public abstract class Navio {
    
    private String matricula_Navio;
    private String nome;
    private float comprimento;

    public Navio(String matricula_Navio, String nome, float comprimento) {
        this.nome=nome;
        this.matricula_Navio = matricula_Navio;
        this.comprimento = comprimento;
        
    }

    public String getMatricula_Navio() {
        return matricula_Navio;
    }

    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
    public int getMaxContentores() {
        return 0;
    }
    
    public float getCapacidade_carga() {
        return 0;
    }

    
    
}
