package executavel;

import java.util.Scanner;
import dominio.Cliente;
import dominio.Conta;

public class EntradaDados {
	
	Conta conta = new Conta();
	
	//conta.depositar(100);
	
	//try {
		//Cliente cliente = new Cliente("Thais", "1125459538794")
	//}

	public static void main(String[] args) {
	 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o valor a ser sacado:");
		int valor = entrada.nextInt();
		
		
		
		CaixaEletronico.retirar(valor);

	}

}