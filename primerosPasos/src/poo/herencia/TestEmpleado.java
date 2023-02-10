package poo.herencia;

public class TestEmpleado {
	public static void main(String[] args) {
		Empleado federico =  new Empleado();
		federico.setDocumento(34878787);
		federico.setSueldo(100000);
		federico.setNombre("Federico Leandro");
		System.out.println(federico);
		
		federico.setBonificacion(20);
		System.out.println(federico);
		
		Gerente gerente = new Gerente();
		gerente.setSueldo(60000);
		gerente.setBonificacion(15);
		gerente.setPassword("123federico");
		System.out.println(gerente.iniciarSesion(gerente.getPassword()));
		
	}

}
