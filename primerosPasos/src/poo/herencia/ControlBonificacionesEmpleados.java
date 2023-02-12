package poo.herencia;

public class ControlBonificacionesEmpleados {
	private double sumaBonificaciones;
	
	public void setRegistroSueldo(Empleado empleado) {
		this.sumaBonificaciones += empleado.getBonificacion();
	}
	
	public double getRegistroSueldo() {
		System.out.println("Suma de bonificaciones totales: "+this.sumaBonificaciones);
		return this.sumaBonificaciones;
	}

}
