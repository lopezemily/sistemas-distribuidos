package calc;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Conexao {

    public static void enviar(Socket socket, Object objeto) throws IOException {
        // Pega o fluxo de saida do Socket
        OutputStream saidaSocket = socket.getOutputStream();
        // Cria um serializador conectado direto na saida do Socket
        ObjectOutputStream serializador = new ObjectOutputStream(saidaSocket);
        // Serializa E escreve (envia) um objeto para o destino
        serializador.writeObject(objeto);
    }

    public static Object receber(Socket socket) throws IOException, ClassNotFoundException {
        // Pega o fluxo de entrada do socket
        InputStream entradaSocket = socket.getInputStream();
        // Cria um deserializador conectado direto à entrada o socket
        ObjectInputStream deserializador = new ObjectInputStream(entradaSocket);
        // Deserializa bytes vindos do Input Stream e converte em um Object
        Object objeto = deserializador.readObject();
        
        return objeto;
    }
}
