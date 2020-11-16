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
public class Lista <T>{
    protected Nodo<T> cabeza;
    protected Nodo<T> anterior;

    
public Lista insertar(Productos producto)
  {
    Nodo<T> nuevo=new Nodo(null,producto);
    if(cabeza==null)
       cabeza=nuevo;
    else
         anterior.enlace=nuevo; 
    
    anterior=nuevo;   
   return this;    
  } 

//public Lista eliminar(Productos<T> x){
    
//}


public Lista insertarcabeza(Productos producto){
     
    Nodo nuevo ;
    nuevo = new Nodo(null, producto);
    nuevo.enlace = cabeza; // enlaza nuevo nodo al frente de la lista
    cabeza = nuevo; // mueve primero y apunta al nuevo nodo
    return this;
}
public void visualizar()
  {
   Nodo n;
   n=cabeza;
   while(n!=null)
    {
      System.out.println(n.dato + " ");
      n=n.enlace;
    }
  }




}