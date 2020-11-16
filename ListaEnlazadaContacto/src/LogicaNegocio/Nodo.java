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
public class Nodo {
    protected Nodo enlace;
    protected Contacto dato;

    public Nodo(Nodo enlace, Contacto dato) {
        this.enlace = enlace;
        this.dato = dato;
    }
    
    public Nodo getenlace() {
        return enlace;
    }

    public void setenlace(Nodo enlace) {
        this.enlace = enlace;
    }

    public Contacto getDato() {
        return dato;
    }

    public void setDato(Contacto dato) {
        this.dato = dato;
    }
    
    
    
}
