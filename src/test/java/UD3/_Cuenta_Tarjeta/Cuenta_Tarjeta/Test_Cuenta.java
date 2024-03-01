package UD3._Cuenta_Tarjeta.Cuenta_Tarjeta;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import dominio.*;

/**
 * Unit test for simple App.
 */
public class Test_Cuenta 
{
	private Cuenta cuenta;
	
	
	@BeforeEach
	public void ini() {
		cuenta=new Cuenta("123456789","Usuario");
	}
	
	@Test
	public void ingreso() throws Exception{
		cuenta.ingresar("1",20);
		assertEquals(20,cuenta.getSaldo());
		cuenta.retirar(20);
		assertEquals(0,cuenta.getSaldo());
	}
	
	@AfterEach
	public void fin() {
		cuenta=null;
	}
	
}
