/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

/**
 *
 * @author danil
 */

public class rmi extends UnicastRemoteObject implements Calculadora{
    public rmi() throws RemoteException{
        int a,b;
    }
    public int div(int a, int b) throws RemoteException {
        return a / b;
    }
    public int mult(int a, int b) throws RemoteException {
        return a * b;
    }
    public int sub(int a, int b) throws RemoteException {
        return a - b;
    }
    public int soma(int a, int b) throws RemoteException {
        return a + b;
    }
        
}
