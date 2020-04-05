package br.uam.bmoritani.exemplormi;

import java.rmi.RemoteException;

public class MinhaCalculadora implements Calculadora {

    public MinhaCalculadora() throws RemoteException {
        super();
        System.out.println("Novo Servidor Math disponível.");
    }

    @Override
    public float somar(float a, float b) throws RemoteException {
        return a + b;
    }

    @Override
    public float subtrair(float a, float b) throws RemoteException {
        return a - b;
    }

    @Override
    public float dividir(float a, float b) throws RemoteException {
        if (b == 0) {
            throw new RemoteException("Nao eh possivel dividir por zero.");
        } else {
            return a / b;
        }
    }

    @Override
    public float multiplicar(float a, float b) throws RemoteException {
        return a * b;
    }

}
