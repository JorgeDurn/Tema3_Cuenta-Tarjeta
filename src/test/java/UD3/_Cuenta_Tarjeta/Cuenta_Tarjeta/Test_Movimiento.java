package UD3._Cuenta_Tarjeta.Cuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.*;

import dominio.Movimiento;

public class Test_Movimiento {

	//private Date mFecha;
	private Movimiento mov;
	
	@BeforeEach
	public void ini() {
		mov=new Movimiento();
		//mFecha=new Date();
	}
	
	/*El método setFecha(Date) en el tipo Movimiento no aplica para los argumentos (String)
	Habria que declarar una variable tipo Date en el Test, y para comparar con el get
	tendrias que usar esa variable tipo Date
	
	@Test
	public void testFecha() {
		//mov.setFecha(mFecha);
		assertEquals(mFecha,mov.getFecha());
	}
*/	
	@Test
	public void testConcepto() {
		mov.setConcepto("Concepto");
		assertEquals("Concepto",mov.getConcepto());
	}
	
	@Test
	public void testmImporte() {
		mov.setImporte(654.458);
		assertEquals(654.45,mov.getImporte(),0.1d);
	}
	
	@AfterEach
	public void fin() {
		mov=null;
	}
}
