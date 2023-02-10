package poo.encapsulamiento;

public class TestMetodos {
	public static void main(String[] args) {
		Metodos cuentaFederico = new Metodos();
		cuentaFederico.setSaldo(300);
		cuentaFederico.depositar(120.32);
		System.out.println(cuentaFederico.getSaldo());
		
		cuentaFederico.retirar(100);
		System.out.println(cuentaFederico.getSaldo());
		
		Metodos cuentaLeandro = new Metodos();
		cuentaLeandro.depositar(1000);
		cuentaLeandro.transferir(360, cuentaFederico);
		System.out.println(cuentaFederico.getSaldo());
		System.out.println(cuentaLeandro.getSaldo());
	}

}
