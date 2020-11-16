/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

/**
 *
 * @author Karla
 * @param <T>
 */
public class nodo<T> {
     T dato;
  nodo<T> enlace;
  
  public nodo(T x)
  {
   dato=x;
   enlace=null;  
  }
  

}
