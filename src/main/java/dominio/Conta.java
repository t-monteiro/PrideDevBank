package dominio;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	protected int id;
	protected String numeroConta;
	protected String numeroAgencia;
	protected float saldo;
	protected Cliente cliente;

	protected String chavePix[] = new String[3]; // email, cpf, telefone

	
	public Conta() {
		
	}
	
	public Conta(String numeroAgencia, String numeroConta,Cliente cliente, float saldoInicial) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.saldo = saldoInicial;
	}
	
	
	public float getSaldo() {
		return saldo;

	}

	public String getChavePix(int pos) {
		return chavePix[pos];
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}


	public void adicionarChavePix(String novaChave) {

		if (chavePix[0] == null) {
			chavePix[0] = novaChave;
		} else {
			if (chavePix[1] == null) {
				chavePix[1] = novaChave;
			}else {
				chavePix[2] = novaChave;
			}
		}
	}

	public void depositar(float valorDepositado) {
		this.saldo += valorDepositado;
	}

	public void trasferir(float valorTransferencia, Conta contaDestino) {

		this.sacar(valorTransferencia);
		contaDestino.depositar(valorTransferencia);
	}

	public void sacar(float valorSaque) {
		this.saldo -= valorSaque; 

		
	}
	
	public Cliente getCliente() {
		return cliente;
	}


}