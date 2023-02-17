package excepciones;

public class MiExcepcion extends RuntimeException{
	public MiExcepcion() {
		super();
	}
	
	public MiExcepcion(String message) {
		super(message);
	}

}
