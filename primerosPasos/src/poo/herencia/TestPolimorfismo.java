package poo.herencia;

public class TestPolimorfismo {
	public static void main(String[] args) {
		//Aplicamos el polimorfismo
		Empleado empleado2 = new Gerente();
		empleado2.setNombre("Leandro");
		empleado2.setSueldo(2000);
		
		
		Gerente gerente2 = new Gerente();
		gerente2.setNombre("Daniel");
		gerente2.setSueldo(10000);
		
	}

}
