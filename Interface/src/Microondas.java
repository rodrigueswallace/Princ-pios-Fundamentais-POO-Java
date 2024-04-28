/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * classe para implementar TODOS os objetos da interface Eletrodomestico 
 *
 * @author 2830482221019
 */
public class Microondas implements Eletrodomestico {
    
    
    String marca;
    int capapcidade;
    boolean ligado;
    
    
    // construtor

    public Microondas(String marca, int capapcidade) {
        this.marca = marca;
        this.capapcidade = capapcidade;
        
    }
    
    
    
    

    @Override
    public void ligar() {
        
        this.ligado = true;
        System.out.println("O microondas foi lidado!! ");
    }
    
    public void ligar(int tempo) throws InterruptedException{
        ligar();
        
        System.out.println("Tempo vai de " + tempo);
        
        while(tempo > 0)
        {
            System.out.println(tempo);
            Thread.sleep(1000);
            tempo--;
        }
        System.out.println("PRONTO!!!!!!");
        desligar();
    }

    @Override
    public void desligar() {
        
        this.ligado = false;
        System.out.println("O microondas foi desligado!! ");
        
    }
    
}
