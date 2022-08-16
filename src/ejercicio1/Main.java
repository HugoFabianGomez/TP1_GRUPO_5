package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Empleado[] emp = new Empleado[5];
		
		emp[0] = new Empleado();
		emp[0].setNombre("Pablo Alderete");
		emp[0].setEdad(19);
		
		System.out.println(emp[0].toString());
		System.out.println("El proximo ID sera: " + Empleado.devuelveProximoID() + "\n");
		
		emp[1] = new Empleado();
		emp[1].setNombre("Thomas Alvarez");
		emp[1].setEdad(31);
		
		System.out.println(emp[1].toString());
		System.out.println("El proximo ID sera: " + Empleado.devuelveProximoID() + "\n");
		
		emp[2] = new Empleado("Silvia Beltran", 26);
		
		System.out.println(emp[2].toString());
		System.out.println("El proximo ID sera: " + Empleado.devuelveProximoID() + "\n");
		
		emp[3] = new Empleado("Romina Pastor", 48);
		
		System.out.println(emp[3].toString());
		System.out.println("El proximo ID sera: " + Empleado.devuelveProximoID() + "\n");
		
		emp[4] = new Empleado("Ramiro Prato", 23);
		
		System.out.println(emp[4].toString());
		System.out.println("El proximo ID sera: " + Empleado.devuelveProximoID() + "\n");
		
	}

}
