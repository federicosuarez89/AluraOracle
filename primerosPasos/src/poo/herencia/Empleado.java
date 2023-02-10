package poo.herencia;

public class Empleado {
	//Atributos de clase
	private String nombre;
	private int documento;
	private double sueldo;
	
	//Metodo constructor
	public Empleado() {}

	//Getter and setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
	//Metodo que establece los aumentos a los empleados
	public double setBonificacion(double bonificacion) {
		double aumento = 1 + (bonificacion/100);
		this.sueldo *= aumento;
		return this.sueldo;
	}
	
	//ToString()
	@Override
	public String toString() {
		return "Empleado [nombre=" + this.nombre + ", documento=" + this.documento + ", sueldo=$" + this.sueldo + "]";
	}
	
	
	
}
