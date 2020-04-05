package br.uam.bmoritani.exemplormi;

import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Caregando o cliente.");

        try {
            Calculadora calculadoraRemota = (Calculadora) Naming.lookup("rmi://LOCALHOST:1099/calculadora");

            System.out.println("*********************************");
            System.out.println("***  CALCULADORA DISTRIBUIDA  ***");
            System.out.println("*********************************");
            System.out.println("Escolha uma operacao: ");

            System.out.println("(1)SOMA (2)SUBTRACAO (3)MULTIPLICACAO (4)DIVISAO");
            int opcao = leia.nextInt();
            System.out.println("Digite o valor 1");
            float a = leia.nextInt();
            System.out.println("Digite o valor 2");
            float b = leia.nextInt();

            float resp;
            switch (opcao) {
                case 1:
                    resp = calculadoraRemota.somar(a, b);
                    System.out.println("O resultado eh: " + resp);
                    break;

                case 2:
                    resp = calculadoraRemota.subtrair(a, b);
                    System.out.println("O resultado eh: " + resp);
                    break;

                case 3:
                    resp = calculadoraRemota.multiplicar(a, b);
                    System.out.println("O resultado eh: " + resp);
                    break;

                case 4:
                    resp = calculadoraRemota.dividir(a, b);
                    System.out.println("O resultado eh: " + resp);
                    break;

                default:
                    throw new Exception("operacao nao suportada.");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
