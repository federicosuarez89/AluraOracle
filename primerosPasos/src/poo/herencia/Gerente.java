package poo.herencia;

public class Gerente extends Empleado{
	//Atributos de clase 
	private String password;
	
	public Gerente() {
		super();
	}
	
	//Metodo que establece la clave del gerente
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Metodo que retorna la clave guardada
	public String getPassword() {
		return this.password;
	}
	
	//Metodo para iniciar sesion
	public String iniciarSesion(String password) {
		String clave;
		if(password.equals("123federico")) {
			clave = "Ha ingresado la clave correcta";
			return clave;
		}else {
			clave = "Ha ingresado una clave invalida";
			return clave;
		}
	}
}
