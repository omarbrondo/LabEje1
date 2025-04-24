
public class main {

	 public static void main(String[] args) {
	        Tecnico tecnico = new Tecnico("Juan Perez", "12345678", 10);
	        Administrativo administrativo = new Administrativo("Barbara Carrizo", "87654321", 5000);
	        Gerente gerente = new Gerente("Omar Brondo", "11223344", 20);

	        System.out.println("Empleado Técnico: " + tecnico.nombre + ", Salario: $" + tecnico.calcularSalario());
	        System.out.println("Empleado Administrativo: " + administrativo.nombre + ", Salario: $" + administrativo.calcularSalario());
	        System.out.println("Empleado Gerente: " + gerente.nombre + ", Salario: $" + gerente.calcularSalario());

	        System.out.println("Total de empleados creados: " + Empleado.getContadorEmpleados());
	    }
}