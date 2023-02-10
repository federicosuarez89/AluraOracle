package poo.encapsulamiento;

public class Metodos {
	//Atributos de clase
	private double saldo;
	private int agencia;
	private int numero;
	private String titular;
	
	//Constructor de la clase
	public Metodos() {} 
	
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
	
	//Metodo con retorno
	public boolean transferir(double valor, Metodos nombreTitular){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			nombreTitular.depositar(valor);
			return true;
		}else {
			return false;
		}
	}

	
	//Getter and setter
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
}
