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
 public class Nodo <T>{
    protected Nodo<T> enlace;
    protected Productos dato;

    public Nodo(Nodo<T> enlace, Productos dato) {
        this.enlace = enlace;
        this.dato = dato;
    }

    public Nodo<T> getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo<T> enlace) {
        this.enlace = enlace;
    }

    public Productos getDato() {
        return dato;
    }

    public void setDato(Productos dato) {
        this.dato = dato;
    }

    

    
    
    

}
