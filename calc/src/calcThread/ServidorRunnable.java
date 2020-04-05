package calcThread;

import calc.Conexao;
import calc.Controler;
import calc.Requisicao;
import calc.Resultado;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorRunnable implements Runnable {

    private Socket clienteSocket;

    public ServidorRunnable(Socket clienteSocket) {
        this.clienteSocket = clienteSocket;
    }

    @Override
    public void run() {
        try {
            Object objetoCliente = Conexao.receber(clienteSocket);

            Requisicao req = (Requisicao) objetoCliente;

            Resultado res = Controler.processa(req);

            Conexao.enviar(clienteSocket, res);

            System.out.println("Fechando a conexao de: " + clienteSocket.getInetAddress().getHostAddress());
            
            clienteSocket.close();
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

}
