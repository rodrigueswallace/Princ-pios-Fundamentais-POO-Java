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
public class Caminhão extends Veiculo {
    
    boolean refrigerado;
    int eixos;
    float tara;
    
    
    // construtor da classe caminhão

public Caminhão(String marca, String modelo, int ano,Boolean refrigerado,int eixos,float tara){
        super(marca,modelo,ano);
        this.refrigerado = refrigerado;
        this.eixos = eixos;
        this.tara = tara;
    }


    public void exibirDadosCaminhão(){
        super.exibirDadosVeiculo(); // invoke
        System.out.println("refrigerado: " + (refrigerado?"Sim":"Não") );
        System.out.println("eixos: " + eixos);
        System.out.println("tara: " + tara);
        System.out.println("=============================");
    }
    
}

