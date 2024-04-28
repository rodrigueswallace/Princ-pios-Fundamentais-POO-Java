/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * classe para instacia on objeto tv
 *
 * @author 2830482221019
 */
public class Loja {
    
    public static void main(String[] args) throws InterruptedException {
        Tv tv = new Tv("LG","Led",65,true);
        Microondas m = new Microondas("LG",30); 
        
        
        tv.ligar();
        tv.ligarTime(5);
        System.out.println("---------//==========");
        m.ligar(30);
        
        
    }
    
}
