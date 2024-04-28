/**
 *
 * @author Wallace Rodrigues
 * @since 21/03/2024
 */
public class Carro extends Veiculo{
    String chassi;
    float valor;
    float potencia;
    
    // metodo construtor domobjeto do tipo carro
    public Carro(String marca, String modelo, int ano,String chassi,float valor,float potencia){
        super(marca,modelo,ano);
        this.chassi = chassi;
        this.valor = valor;
        this.potencia = potencia;
    }

    
    
    
    
    public void exibirDadosCarro(){
        super.exibirDadosVeiculo(); // invoke
        System.out.println("Chassi: " + chassi);
        System.out.println("Valor: " + valor);
        System.out.println("Potencia: " + potencia + "hp");
        System.out.println("=============================");
    }
    
    
} // fim da classe