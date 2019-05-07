package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		Conta conta;

		System.out.println("Bem vindo ao Banco!");
		System.out.println("Para começar, informe o número da conta a ser criada:");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Agora, o nome do titular:");
		String name = sc.nextLine();
		
		System.out.println("Existe um deposito inicial? (y/n)");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y')
		{
			System.out.println("Entre com o valor do depósito inicial: ");
			double deposito = sc.nextDouble();
			conta = new Conta(numeroConta,name,deposito);
		}
		else {
			conta = new Conta(numeroConta,name);

		}
		
		System.out.println(conta);
		
		
		System.out.println("Entre com um novo deposito:");
		double novoDeposito = sc.nextDouble();
		conta.deposito(novoDeposito);
		
		System.out.println(conta);

		
		
		System.out.println("Entre com um valor para saque:");
		double saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.println(conta);

		
	}

}
