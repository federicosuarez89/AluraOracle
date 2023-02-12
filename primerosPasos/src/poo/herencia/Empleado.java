package poo.herencia;

public abstract class Empleado {
	//Atributos de clase
	private String nombre;
	private int documento;
	private double sueldo;
	private double bonificacion;
	private double sueldoConAumento;
	
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
		return this.sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void setBonificacion(double bonificacion) {
		double aumento = bonificacion/100;
		this.bonificacion = this.sueldo * aumento;
	}
	
	public double getBonificacion() {
		return this.bonificacion;
	}
	//Metodo que establece los aumentos a los empleados
	
	  public void setSueldoConAumento(double bonificacion) { 
		  double aumento = 1 + (bonificacion/100); 
		  this.sueldoConAumento = this.sueldo * aumento; 
	  }
	 
	
	public double getSueldoConAumento() {
		return this.sueldoConAumento;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + this.nombre + ", documento=" + this.documento + ", sueldo base=$" + this.sueldo + ", sueldoConAumento=$"
				+ this.getSueldoConAumento() + "]";
	}
	
	//ToString()
	
}
