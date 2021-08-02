package dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {
	
	@Test
	void deveSerPossivelCriarClientePassandoValores() {
		Cliente cliente = new Cliente("Thais","12345678909");
		
		String nomeCliente = cliente.getNome();
		String cpfCorrentista = cliente.getCPF();
		
		Assertions.assertEquals("Ana",nomeCliente);
		Assertions.assertEquals("12345678909",cpfCorrentista);
		
	}
	
	
	@Test
	void deveValidarSeCPFContem11Caracteres() {
//		Cliente cliente = new Cliente("Ana","1234567890");
//		
//		String nomeCliente = cliente.getNome();
//		String cpfCorrentista = cliente.getCPF();
//		
//		Assertions.assertEquals("Ana",nomeCliente);
//		Assertions.assertEquals("12345678909",cpfCorrentista);
//		
	}
	
	
	
	

}