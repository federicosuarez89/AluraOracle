package poo;

public class Metodos {
	//Atributos de clase
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//Metodo sin retorno
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	
	//Metodo con retorno
	public boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Metodos nombreTitular){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			nombreTitular.depositar(valor);
			return true;
		}else {
			return false;
		}
	}

}
