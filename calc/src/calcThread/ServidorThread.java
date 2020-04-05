package calcThread;

import calc.Conexao;
import calc.Controler;
import calc.Requisicao;
import calc.Resultado;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorThread {

    public static void main(String[] args) throws Exception {
        int porta = 9600;
        ServerSocket serverSocket = new ServerSocket(porta);

        System.out.println("O servidor comecou a escutar na porta: " + porta);

        while (true) {
            Socket clienteSocket = serverSocket.accept();

            System.out.println("Nova conexao de " + clienteSocket.getInetAddress().getHostAddress());

            ServidorRunnable servidor = new ServidorRunnable(clienteSocket);
            Thread thread = new Thread(servidor);
            thread.start();
        }
    }
}
