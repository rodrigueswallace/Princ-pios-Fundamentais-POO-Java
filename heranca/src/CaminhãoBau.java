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
public class CaminhãoBau extends Caminhão {
    
    int volume;
    boolean rasteira;
    boolean portalama;
    String tipoBau;
    
    //  construtor do objeto CaminhãoBau

    public CaminhãoBau(String marca, String modelo, int ano, Boolean refrigerado, int eixos, float tara,int volume, boolean rasteira, boolean portalama, String tipoBau) {
        super(marca, modelo, ano, refrigerado, eixos, tara);
        this.volume = volume;
        this.rasteira = rasteira;
        this.portalama = portalama;
        this.tipoBau = tipoBau;
    }
    
    
    // metodo comum para exibir os dados de um veiculo
     public void exibirDadosCaminhãoBau(){
        super.exibirDadosVeiculo(); // invoke
        System.out.println("Volume: " + volume );
        System.out.println("rasteira: " + rasteira);
        System.out.println("Portarlama: " + portalama);
        System.out.println("tipoBau: " + tipoBau);
        System.out.println("=============================");
    }
    
    
    
    
    
} // fim da classe