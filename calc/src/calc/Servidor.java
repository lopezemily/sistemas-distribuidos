package calc;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws Exception {
        int porta = 9600;
        ServerSocket serverSocket = new ServerSocket(porta);

        System.out.println("O servidor comecou a escutar na porta: " + porta);

        while (true) {
            Socket clienteSocket = serverSocket.accept();

            System.out.println("Nova conexao de " + clienteSocket.getInetAddress().getHostAddress());

            Object objetoCliente = Conexao.receber(clienteSocket);
            Requisicao req = (Requisicao) objetoCliente;

            Resultado res = Controler.processa(req);

            Conexao.enviar(clienteSocket, res);

            System.out.println("Fechando a conexao de: " + clienteSocket.getInetAddress().getHostAddress());
            clienteSocket.close();
        }
    }

}
