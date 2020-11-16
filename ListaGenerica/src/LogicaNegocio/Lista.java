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
public class Lista<T> {
  private nodo<T> cabeza;
  private nodo<T> anterior;
  
  public Lista ()
  {
   cabeza=null;
  }

 public Lista<T> insertar(T entrada)
  {
    nodo nuevo=new nodo(entrada);
    if(cabeza==null)
       cabeza=nuevo;
    else
         anterior.enlace=nuevo; 
    
    anterior=nuevo;   
   return this;    
  } 
  public Lista insertarcabeza(T entrada){
     
    nodo nuevo ;
    nuevo = new nodo(entrada);
    nuevo.enlace = cabeza; // enlaza nuevo nodo al frente de la lista
    cabeza = nuevo; // mueve primero y apunta al nuevo nodo
    return this;

  }
          

  public void visualizar()
  {
   nodo n;
   n=cabeza;
   while(n!=null)
    {
      System.out.println(n.dato + " ");
      n=n.enlace;
    }
  }

}
