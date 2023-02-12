package poo.herencia;

public class CuentaCorriente extends Cuenta{
	public CuentaCorriente(int agencia, int numero) {
		super(agencia,numero);
	}
	
	//Metodo que descuenta $80 por cada transferencia que se hace
	@Override
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.getSaldo() >= valor) {
			double sueldoDescuentoTransferencia = this.getSaldo() - valor - 80;
			cuenta.depositar(valor);
			this.setSaldo(sueldoDescuentoTransferencia);
			System.out.println("Ahora el saldo de tu cuenta descontando los $80 de la transferencia es: $"+this.getSaldo());
			return true;
		}else {
			return false;
		}
	}

}
