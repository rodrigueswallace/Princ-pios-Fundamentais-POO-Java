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
public class CaminhãoCeg extends Caminhão {
    
    int qndCarro;
    float altura;
    boolean segundoPiso;
    
    
    //  construtor do objeto CaminhãoBau

    public CaminhãoCeg(String marca, String modelo, int ano, Boolean refrigerado, int eixos, float tara,int qndCarro, float altura, boolean segundoPiso) {
        super(marca, modelo, ano, refrigerado, eixos, tara);
        this.qndCarro = qndCarro;
        this.altura = altura;
        this.segundoPiso = segundoPiso;
    }

    
    
    
    
    
    // metodo comum para exibir os dados de um veiculo
     public void exibirDadosCaminhãoCeg(){
        super.exibirDadosVeiculo(); // invoke
        System.out.println("Quantidade de Carros: " + qndCarro );
        System.out.println("Altura: " + altura);
        System.out.println("Segundo Piso: " + segundoPiso);
        System.out.println("=============================");
    }
    
    
    
    
    
} // fim da classe