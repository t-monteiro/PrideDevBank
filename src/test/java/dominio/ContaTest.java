//package dominio;
//
//
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class ContaTest {
//	
//	Conta conta ;
//	@BeforeEach
//	void inicial() {
//		conta = new Conta();
//		conta.depositar(1000);
//	}
//	
//	
//	
//	@Test
//	void deveSerPossivelCriarUmaConta() {
//		assertTrue(conta != null);
//	}
//	
//	@Test
//	void deveSerPossivelAdicionarUmaChavePix() {
//
//		//execuc�o
//		conta.adicionarChavePix("anaalice.cd@gmail.com");
//		//valida��o
//		assertTrue(conta.getChavePix(0).equals("anaalice.cd@gmail.com"));
//	}
//	@Test
//	void deveSerPossivelSacarQuandoTemosLimite() {
//
//		//execu��o
//		conta.sacar(200);
//		
//		//valida��o
//		assertTrue(800 == conta.getSaldo() );
//	}
//
//	@Test
//	void deveSerPossivelTransferirParaOutraContaQuandoTemSaldo() {
//		Conta contaDestino = new Conta();
//		contaDestino.depositar(100);
//		
//		conta.trasferir(2, contaDestino);
//		
//		assertTrue(contaDestino.getSaldo() == 102);
//	}
//	
//	
//	
//	
//}