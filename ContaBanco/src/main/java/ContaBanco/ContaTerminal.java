package ContaBanco;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        

        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();
      

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
       

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        System.out.println();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia +
                ", conta " + numeroConta + " e seu saldo é " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}



