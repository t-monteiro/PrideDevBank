package executavel;

import dominio.Conta;
import dominio.ContaCorrente;
import dominio.ContaPoupanca;

public class EntradaDados {

	public static void main(String[] args) {
	
		Conta contaThais = new Conta();
		
		contaThais.setChavePix("437ysdh38qa");
		contaThais.depositar(100);
		
		ContaCorrente contaDaLi = new ContaCorrente();

		System.out.println("conta da Li: " +contaDaLi.getSaldo());
		System.out.println("Saldo: " + contaThais.getSaldo());
		System.out.println("Chave Pix: " + contaThais.getChavePix());
		System.out.println("Saldo Anterior "+ contaThais.getSaldo());
		
		contaThais.trasferir(10, contaDaLi);
		System.out.println("Novo Saldo "+ contaThais.getSaldo());
		
		System.out.println("Novo Saldo Gi "+ contaDaLi.getSaldo());
	}

}