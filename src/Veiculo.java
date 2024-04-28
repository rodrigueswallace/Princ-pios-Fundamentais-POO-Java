/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wallace Rodrigues
 * @since 21/03/2024
 */
public class Veiculo {
    String marca;
    String modelo;
    int ano;
    
    // Construtor objeto em memoria
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    // metodo comum para exibir os dados de um veiculo
     public void exibirDadosVeiculo(){
         System.out.println("================");
         System.out.println("Marca:" + marca);
         System.out.println("Modelo:" + modelo);
         System.out.println("Ano:" + ano);
         System.out.println("================");

     }

    
    
} // fim da classe
