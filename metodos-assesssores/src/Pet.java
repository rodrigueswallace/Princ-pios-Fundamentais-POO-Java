/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * Classe para demostrar a utilização do Principio do Encapsulamento
 *
 * @author Wallace A. Rodrigues
 */
public class Pet {
    private String raça;
    private String nome;
    private int idade;
    

    public Pet(String raça, String nome, int idade) {
        this.raça = raça;
        this.nome = nome;
        this.idade = idade;
    }
    
    
    // metodo comum para exibir dados em um pet
    public void exibirDadosPet(){
        System.out.println(" Nome " + getNome());
        System.out.println(" Raça " + getRaça());
        System.out.println(" Idade " + getIdade());
    }
    
                                // metodo assessores (set & get)
    
    
    // metodo que garda a informação
    public void setRaça(String raça){
        this.raça = raça;
    }
    
    // metodo busca pela informação
    public String getRaça(){
        return raça;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    
    
    
} // fim da classe
