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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista listacontactos = new Lista();
       
        int op=0;
        do {
            String opcion =JOptionPane.showInputDialog(null, "1 Insertar 2 Visualizar 3 Salir");
            op= Integer.parseInt(opcion);
            
            switch(op)
            {
                case 1: 
                    {
                       String Nombre, Direccion, Correo, Telefono;
                       
                       Nombre=JOptionPane.showInputDialog(null, "Ingrese un nombre");
                       Direccion=JOptionPane.showInputDialog(null, "Ingrese la direccion");
                       Correo=JOptionPane.showInputDialog(null, "Ingrese un nombre");
                       Telefono=JOptionPane.showInputDialog(null, "Ingrese el telefono");
                       
                       listacontactos.insertarLista(null, new Contacto(Nombre,Direccion,Correo,Telefono));
                       break;
                       
                       
            }
        }
    }while(op!=3);
    

}
}
