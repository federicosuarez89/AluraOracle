package excepciones; 

public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio metodo main");
		metodo1();
		System.out.println("Fin metodo main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio metodo1");
		try {
			metodo2();
		}catch(MiExcepcion me) {
			me.printStackTrace();
		}
		System.out.println("Fin metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio metodo2");
		System.out.println("Fin metodo2");
		throw new MiExcepcion("Mi excepcion fue lanzada");
	}
}
