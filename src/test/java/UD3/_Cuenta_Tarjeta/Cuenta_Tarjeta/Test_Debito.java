package UD3._Cuenta_Tarjeta.Cuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.*;

import dominio.*;

public class Test_Debito {
	private static Date mFecha;
	private static Debito deb;
	private static Cuenta cu;
	
	@BeforeEach
	public void ini() {
		mFecha=new Date();
		deb=new Debito("123456","Persona 1",mFecha);
		cu=new Cuenta ("123456","Persona 1");
	}
	
	@Test
	public void testIngresar() throws Exception  {
		cu.ingresar(1000);
		deb.setCuenta(cu);
		assertEquals(1000,deb.getSaldo());
	}
	
	@Test
	public void testEstablecimiento() throws Exception {
		cu.ingresar(1000);
		deb.setCuenta(cu);
		deb.pagoEnEstablecimiento("Estanco", 30);
		assertEquals(970,deb.getSaldo());
	}
	
	@Test
	public void testRetirar() throws Exception {
		cu.ingresar(1000);
		deb.setCuenta(cu);
		deb.retirar(900);
		assertEquals(100,deb.getSaldo());
	}
	
	@AfterEach
	public void fin() {
		mFecha=null;
		deb=null;
		cu=null;
		
	}
	
}
