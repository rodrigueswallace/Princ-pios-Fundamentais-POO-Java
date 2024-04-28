/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * Classe para instanciar objettos encapsulados
 *
 * @author Wallace 
 */
public class PetShop {
    
    public static void main(String[] args) {
        
        
        Pet pet = new Pet("Labrador","Marley",3);
        Pet gato = new Pet("Siames","Mila",7);
        
        pet.setNome("lulu");
        pet.raça = "açogue";
    }
    
}
