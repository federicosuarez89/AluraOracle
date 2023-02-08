package poo;

public class TestMetodos {
	public static void main(String[] args) {
		Metodos cuentaFederico = new Metodos();
		cuentaFederico.saldo = 300;
		cuentaFederico.depositar(120.32);
		System.out.println(cuentaFederico.saldo);
		
		cuentaFederico.retirar(100);
		System.out.println(cuentaFederico.saldo);
		
		Metodos cuentaLeandro = new Metodos();
		cuentaLeandro.depositar(1000);
		cuentaLeandro.transferir(360, cuentaFederico);
		System.out.println(cuentaFederico.saldo);
		System.out.println(cuentaLeandro.saldo);
	}

}
