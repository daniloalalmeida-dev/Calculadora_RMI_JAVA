/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author danil
 */

public class cliente {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        try{
            Registry meuRegistro = LocateRegistry.getRegistry("localhost", 1099);
            Calculadora c = (Calculadora)Naming.lookup("//localhost/Calculadora");
            
            while (true) {                
                String menu = JOptionPane.showInputDialog("Calculadora \n "
                        + "Soma...(1) \n"
                        + "Subtração...(2) \n"
                        + "Multiplicação...(3) \n"
                        + "Divisão...(4) \n"
                        + "Cancelar para sair");
                switch(menu){
                    case "1":{
                    
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
                        
                            JOptionPane.showMessageDialog(null, "A soma é: " +c.soma(x,y));
                            break;
                    }
                    case "2":{
                    
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
                        
                            JOptionPane.showMessageDialog(null, "A subtração é: " +c.sub(x,y));
                            break;
                    }
                    case "3":{
                    
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
                        
                            JOptionPane.showMessageDialog(null, "A multiplicação é: " +c.mult(x,y));
                            break;
                    }
                    case "4":{
                    
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
                        
                            JOptionPane.showMessageDialog(null, "A divisão é: " +c.div(x,y));
                            break;
                    }                    
                }
            }
        }catch(Exception e){
            System.out.println("Servidor não conectado" + e);
        }
    }
    
}
