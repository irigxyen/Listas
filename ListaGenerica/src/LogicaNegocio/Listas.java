/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

/**
 *
 * @author Karla
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
    Lista<Integer> l=new Lista<>();
    
        
        l.insertarcabeza(1);
        l.insertarcabeza(2);
        l.insertarcabeza(3);
        l.insertarcabeza(4);
        
    
    
    
    System.out.println("Elementos:");
    l.visualizar(); 
  }


}
    
