package poo.herencia;

public class TestEmpleado {
	public static void main(String[] args) {
		Empleado empleado1 =  new Empleado();
		empleado1.setDocumento(34878787);
		empleado1.setSueldo(100000);
		empleado1.setNombre("Federico Leandro");
		empleado1.setBonificacion(20);
		System.out.println(empleado1);
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Yury");
		gerente.setDocumento(9595995);
		gerente.setSueldo(60000);
		gerente.setBonificacion(15);
		gerente.setPassword("123federico");
		System.out.println(gerente.iniciarSesion(gerente.getPassword()));
		System.out.println(gerente);
		
	}

}
