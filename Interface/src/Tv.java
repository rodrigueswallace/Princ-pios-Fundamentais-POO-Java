/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * Classe para implementar TODOS os metods da interface Eletrodomestico
 *
 * @author 2830482221019
 */
public class Tv implements Eletrodomestico{
    
    String marca;
    String modelo;
    int polegada;
    boolean ligada;
    
    
    // construtor

    public Tv(String marca, String modelo, int polegada, boolean ligada) {
        this.marca = marca;
        this.modelo = modelo;
        this.polegada = polegada;
        this.ligada = ligada;
    }
    
    
    // metodo para determinar tempo antes de desligar
    public void ligarTime(int tempo) throws InterruptedException{
        Thread.sleep(1000 * tempo);
        desligar();
    }
    
    
    
    

    @Override
    public void ligar() {
        
        System.out.println("TV ligada!! ");
        this.ligada = true;
    }

    @Override
    public void desligar() {
        
        System.out.println("TV desligada!! ");
        this.desligar = false;
    }
    
} // fim da classe
