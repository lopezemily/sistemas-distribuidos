package calc;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9600);

        Requisicao req = construirRequisicao();
        Conexao.enviar(socket, req);

        Object objetoServidor = Conexao.receber(socket);

        Resultado res = (Resultado) objetoServidor;

        mostraResultado(res);

        socket.close();
    }

    private static Requisicao construirRequisicao() {
        Scanner leia = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("***  CALCULADORA DISTRIBUIDA  ***");
        System.out.println("*********************************");

        System.out.println("Escolha uma operacao: ");
        System.out.println("(+)SOMA (-)SUBTRACAO (*)MULTIPLICACAO (/)DIVISAO");
        String op = leia.nextLine();
        char operacao = op.charAt(0);
        System.out.println("Digite o valor 1");
        float x = leia.nextFloat();
        System.out.println("Digite o valor 2");
        float y = leia.nextFloat();
        Requisicao req = new Requisicao(operacao, x, y);
        return req;
    }

    private static void mostraResultado(Resultado res) {
        if (res.isSucesso()) {
            System.out.println("O resultado e: " + res.getResultado());
        } else {
            System.out.println("Erro: " + res.getMsg());
        }
    }

}
