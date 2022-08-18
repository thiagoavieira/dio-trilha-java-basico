package view;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import model.ContaBanco;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        ContaBanco conta = null;

        System.out.println("Bem vindo ao Banco S!");
        do {
            try {
                System.out.println("Por favor, digite o número da agência: ");
                agencia = teclado.next();

                System.out.println("Por favor, informe seu nome completo: ");
                nomeCliente = teclado.next();

                Random random = new Random();
                numero = random.nextInt(9999) + 1000;

                conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

                System.out.println("Olá " + conta.getNomeCliente()
                        + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia()
                        + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo()
                        + " já está disponível para saque");

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, verifique os valores da próxima vez!");
            }
        } while (conta.getClass() == null);

        teclado.close();
    }
}
