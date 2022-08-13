package ejercicio1;

public class Empleado {
	//Attributes 
	private final int id;
	private String nombre;
	private int edad;
	private static int ContId = 1000;
	
	//Constructors
	public Empleado() {
        ContId++;
        
		this.id = ContId;	
	}
	
	public Empleado(String nombre, int edad) {
		ContId++;
		
		this.id = ContId;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Setters y Getters
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}
