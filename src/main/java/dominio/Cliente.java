package dominio;

import static util.Validador.validaCPF;

public class Cliente {

	protected String cpfCorrentista;
	protected String nomeCorrentista;
	
	public Cliente(String nome, String cpf) {
		validaCPF(cpf);
		this.nomeCorrentista = nome;
		this.cpfCorrentista = cpf;
	}

	public String getNome() {
		return nomeCorrentista;
	}

	public String getCPF() {
		return cpfCorrentista;
	}
	
	//contrutor que recebe nome e cpf
	//validar cpf
	// se cpf invalido d� erro do tipo InvalidArgument;
}