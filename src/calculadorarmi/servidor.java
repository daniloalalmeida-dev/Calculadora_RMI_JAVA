/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author danil
 */

public class servidor {
    public static void main(String[] args){
        try{
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calculadora", new rmi());
            JOptionPane.showMessageDialog(null, "Servidor Conectado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Servidor não conectado" + e);
        }
    
    }

}
