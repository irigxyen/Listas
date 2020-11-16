/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import javax.swing.JOptionPane;

/**
 *
 * @author Karla
 */
public class Lista {
    private Nodo primero;
    private Nodo ultimo;
    
    public Lista(){
        primero=null;
        ultimo=null;
    }
    
   public boolean listaVacia(){
        if(primero== null){
            return true;
        } else{
            return false;
        }    
    }
    public Lista insertarLista(Nodo anterior, Contacto contacto){
    Nodo nuevo;
    nuevo = new Nodo(null,contacto);
    nuevo.enlace = anterior.enlace;
    anterior.enlace = nuevo;
    return this;
    }
    public void insertarInicioLista(Nodo enlace, Contacto contacto){
        Nodo nuevo;
         if(primero==null){
          nuevo = new Nodo (null, contacto);
         /* nuevo.setenlace(nuevo)= anterior.setenlace();*/
          primero=nuevo;
          ultimo= nuevo;}
             else{
             nuevo=new Nodo(null, contacto);
             ultimo.setenlace(nuevo);
             ultimo=nuevo;
         }     
        
        }
    /*public Nodo buscarLista(Contacto contacto){
        Nodo i;
        for(i=primero; i!= null; i=i.getenlace())
            if (contacto.equals(i.enlace))
                return i;
        return null;       
        
    }*/
    public Nodo buscarLista(Contacto contacto){
    Nodo indice;
    for (indice = primero; indice!= null; indice = indice.enlace)
    if (contacto == indice.dato) // (destino.equals(indice.dato))
    return indice;
    return null;
    }
    public void eliminarLista(Contacto contacto){
        Nodo actual, anterior;
         boolean encontrado;
         actual = primero;
         anterior = null;
         encontrado = false;
         // búsqueda del nodo y del anterior
        while ((actual!=null) && (!encontrado))
        {
         encontrado = (actual.dato == contacto);
         //con objetos: actual.dato.equals(entrada)
         if (!encontrado)
         {
         anterior = actual;
         actual = actual.enlace;
         }
         }
         // Enlace del nodo anterior con el siguiente
         if (actual != null)
         {
         // Distingue entre que el nodo sea el cabecera,
         // o del resto de la lista
         if (actual == primero)
         {
         primero = actual.enlace;
         }
        else
         {
         anterior.enlace = actual.enlace;
          }
          actual = null; // no es necesario al ser una variable local
 }
}
    public Lista insertaOrden(Contacto contacto){
       Nodo nuevo ;
       nuevo = new Nodo(null,contacto);
       if (primero == null) // lista vacía
       primero = nuevo;
       else if (contacto.equals(primero.getDato()))
       {
       nuevo.setenlace(primero);
       primero = nuevo;
       }
       else /* búsqueda del nodo anterior a partir del que
       se debe insertar */
       {
       Nodo anterior, p;
       anterior = p = primero;
       while ((p.getenlace( ) != null) && (contacto.equals(p.getDato())))
       {
       anterior = p;
       p = p.getenlace( );
        }
       if (contacto.equals(p.getDato( ))) //se inserta después del último nodo
       anterior = p;
       // Se procede al enlace del nuevo nodo
       nuevo.setenlace(anterior.getenlace( ));
       anterior.setenlace(nuevo);
       }
       return this;
}
    public void mostrar(){
        if(listaVacia()){
            JOptionPane.showMessageDialog(null,"La LISTA ESTA VACIA");
            return;
        }else
        {
            Nodo temp;
            temp =primero;
            while(temp!=null)
            {
                JOptionPane.showMessageDialog(null, temp.getDato().toString());
                temp=temp.getenlace();
            }     
        }
    }
        

        
}

