package poo;

public class PruebaAcceso {
	public static void main(String[] args) {
		Metodos cuenta = new Metodos();
		cuenta.setSaldo(200);
		
		cuenta.retirar(300);
		
		System.out.println(cuenta.getSaldo());
	}

}
