package Exceptions;

public class SaldoInsuficienteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteException(String mensagemErro) {
		super(mensagemErro);
	}
	

}