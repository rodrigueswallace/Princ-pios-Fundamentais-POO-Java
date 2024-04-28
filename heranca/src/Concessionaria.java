/**
 * 
 *  Classe 
 * @author Wallace Rodrigues
 * @since 21/03/2024
 */


public class Concessionaria {
    public static void main(String []args){
        Veiculo v1,v2;
        Carro c1;
        CaminhãoBau cb1;
        CaminhãoCeg cg1;
        
        v1 = new Veiculo("chevrolet", "Onix", 2018);
        v2 = new Veiculo("BYD", "Dolphin", 2018); 
        c1 = new Carro("fiat", "uno",2018,"deer", 149000f,1.3f);
        cb1 = new CaminhãoBau("volvo","novo",2020,true,4,2.2f,1000,true,false,"cb-3");
        cg1 = new CaminhãoCeg("Volvo","novo",2020,true,4,3.5f,5,7.5f,true);
        
        cg1.exibirDadosCaminhãoCeg();
        
        
        
        
        /**
        v1.exibirDadosVeiculo();
        v2.exibirDadosVeiculo();
        c1.exibirDadosCarro();
        * cb1.exibirDadosCaminhãoBau();
        **/ 
        
        
        
    }
}