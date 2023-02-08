package poo;

public class TestMetodos {
	public static void main(String[] args) {
		Metodos cuentaFederico = new Metodos();
		cuentaFederico.saldo = 300;
		cuentaFederico.depositar(120.32);
		System.out.println(cuentaFederico.saldo);
		
	}

}
