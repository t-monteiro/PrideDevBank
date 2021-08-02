package dominio;

import Exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta  implements Sacavel {
	private float chequeEspecial = 100;
	

	@Override
	public void sacar(float valorSaque)  {
		if (valorSaque  <= this.saldo + chequeEspecial) {
			this.saldo = this.saldo - valorSaque;
		}else{
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
	}
	
	public float getChequeEspecial() {
		return this.chequeEspecial;
	}
	
	public void transferir(float valorTransferencia, Conta outraConta) {
		this.sacar(valorTransferencia);
		outraConta.depositar(valorTransferencia);
		
	}



	

	
}