//package br.com.pueyo.teste.unitario;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//import org.mockito.Mockito;
//
//public class CarroBCTest {
//
//	@Test
//	public final void testCarroPossuiAbs() {
//		CarroBC bc = new CarroBC();
//		
//		Carro carro = new Sandero();
//		carro.insereItens(new Abs());
//		
//		assertNotNull(bc.carroPossuiAbs(carro));
//		assertEquals("O carro possui ABS", bc.carroPossuiAbs(carro));
//
//	}
//	
//	@Test
//	public final void testCarroNaoPossuiAbs() {
//		CarroBC bc = new CarroBC();
//
//		Carro carro = new Sandero();
//		
//		assertNotNull(bc.carroPossuiAbs(carro));
//		assertEquals("O carro Não possui ABS", bc.carroPossuiAbs(carro));
//
//	}
//	
//	@Test
//	public final void testCarroPossuiAbsMock() {
//		CarroBC bc = new CarroBC();
//		
//		Carro carro = Mockito.mock(Sandero.class);
//		Mockito.when(carro.possuiABS()).thenReturn(true);
//		
//		assertNotNull(bc.carroPossuiAbs(carro));
//		assertEquals("O carro possui ABS", bc.carroPossuiAbs(carro));
//
//	}
//	
//	@Test
//	public final void testCarroNaoPossuiAbsMock() {
//		CarroBC bc = new CarroBC();
//		
//		Carro carro = Mockito.mock(Sandero.class);
//		Mockito.when(carro.possuiABS()).thenReturn(false);
//		//carro.insereItens(new Abs());
//		
//		assertNotNull(bc.carroPossuiAbs(carro));
//		assertEquals("O carro Não possui ABS", bc.carroPossuiAbs(carro));
//
//	}
//
//}
