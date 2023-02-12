package poo.herencia;

import poo.encapsulamiento.Metodos;

public class Cuenta {
	private double saldo;
	private Cliente titular = new Cliente();
	private static int total = 1;
	private int agencia;
	private int numero;
	
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Se ha creado una nueva cuenta en el banco:" + Cuenta.total);
		Cuenta.total ++;
	}
	
	public void depositar(double saldo) {
		this.saldo += saldo;
	}

	public boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}

	public boolean transferir(double valor, Cuenta cuenta){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		}else {
			return false;
		}
	}

	
	public double getSaldo() {
		return saldo;
	}

	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public Cliente getTitular() {
		return titular;
	}

	
	public void setTitular(Cliente titular) {
		this.titular = titular;
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




}
