
public class Persona {
	String name = "";
	String correo = "";
	int age = 0;
	
	public String saludar() {
		return "Hola, soy " + this.name;
	}
	
	public String miEdad() {
		return "Mi edad es: " + this.age + " a�os";
	}
	
}
