package condicionales;

public class IfSwitch {
	public static void main(String[] args) {
		int edad = 28;
		if (edad >=18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		int mes =1;
		switch (mes) {
			case 1:
				System.out.println("Opcion 1");
				break;
			case 2:
				System.out.println("Opcion 2");
				break;
			default:
				System.out.println("Opcion incorrecta");
		}
	}

}
