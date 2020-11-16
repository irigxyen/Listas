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
 * 
 * 
 */
public class Productos<T>  {
    private T nombre;
    private T cantidad;
    private T precio;

    public Productos(T nombre, T cantidad, T precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public T getCantidad() {
        return cantidad;
    }

    public void setCantidad(T cantidad) {
        this.cantidad = cantidad;
    }

    public T getPrecio() {
        return precio;
    }

    public void setPrecio(T precio) {
        this.precio = precio;
    }

} 

    