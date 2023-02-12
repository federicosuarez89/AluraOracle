package poo.herencia;

public class TestControlBonificaciones {
	public static void main(String[] args) {
		Empleado empleado3 = new Contador();
		empleado3.setSueldo(2000);
		empleado3.setBonificacion(10);
		
		
		Gerente gerente3 = new Gerente(); 
		gerente3.setSueldo(11000);
		gerente3.setBonificacion(15);
		
		Contador contador1 = new Contador();
		contador1.setSueldo(5000);
		contador1.setBonificacion(12);
		
		 
		
		ControlBonificacionesEmpleados control = new ControlBonificacionesEmpleados();
		control.setRegistroSueldo(empleado3);
		control.getRegistroSueldo();
		control.setRegistroSueldo(gerente3);
		control.getRegistroSueldo();
		control.setRegistroSueldo(contador1);
		control.getRegistroSueldo();
	}
}
