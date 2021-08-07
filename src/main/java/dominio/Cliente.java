package dominio;

import static util.Validador.validaCPF;

public class Cliente {

	protected int id;
	protected String cpfCorrentista;
	protected String nomeCorrentista;
	protected String nomeSocial;

	public String getNomeSocial() {
		return nomeSocial;
	}

	public Cliente(String nome, String cpf, String nomeSocial) {
		validaCPF(cpf);
		this.nomeCorrentista = nome;
		this.cpfCorrentista = cpf;
		this.nomeSocial = nomeSocial;
	}

	public String getNome() {
		return nomeCorrentista;
	}

	public String getCPF() {
		return cpfCorrentista;
	}

	public int getId() {
		return id;
	}

	public String getCpfCorrentista() {
		return cpfCorrentista;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCpfCorrentista(String cpfCorrentista) {
		this.cpfCorrentista = cpfCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

}

//package dominio;
//
//import static util.Validador.validaCPF;
//
//public class Cliente {
//
//	protected String cpfCorrentista;
//	protected String nomeCorrentista;
//	
//	public Cliente(String nome, String cpf) {
//		validaCPF(cpf);
//		this.nomeCorrentista = nome;
//		this.cpfCorrentista = cpf;
//	}
//
//	public String getNome() {
//		return nomeCorrentista;
//	}
//
//	public String getCPF() {
//		return cpfCorrentista;
//	}
//	
//	//contrutor que recebe nome e cpf
//	//validar cpf
//	// se cpf invalido dá erro do tipo InvalidArgument;
//}