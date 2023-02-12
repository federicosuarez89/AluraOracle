package poo.herencia;

public class TestCuenta {

	public static void main(String[] args) {
		CuentaCorriente cc1 = new CuentaCorriente(1,1);
		CuentaAhorro ca1 = new CuentaAhorro(2, 3);
		cc1.depositar(2000);
		cc1.transferir(1000, ca1);
		System.out.println("Tengo en mi cuenta corriente: $"+cc1.getSaldo());
		System.out.println("Tengo en mi cuenta de ahorro: $"+ca1.getSaldo());
		

	}

}
