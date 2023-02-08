package ciclos;

public class While {
	public static void main(String[] args) {
		int contador = 0;
		while (contador <= 10) {
			System.out.println("While valor: "+contador);
			contador++;
		}
		
		do {
			System.out.println("Do-While valor: "+contador);
			contador++;
		}while(contador<=20);
	}
}
