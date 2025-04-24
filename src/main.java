
public class main {

	 public static void main(String[] args) {
	        Tecnico tecnico = new Tecnico("Juan Pérez", "12345678", 10);
	        Administrativo administrativo = new Administrativo("María López", "87654321", 5000);
	        Gerente gerente = new Gerente("Carlos Gómez", "11223344", 20);

	        System.out.println("Empleado Técnico: " + tecnico.nombre + ", Salario: $" + tecnico.calcularSalario());
	        System.out.println("Empleado Administrativo: " + administrativo.nombre + ", Salario: $" + administrativo.calcularSalario());
	        System.out.println("Empleado Gerente: " + gerente.nombre + ", Salario: $" + gerente.calcularSalario());

	        System.out.println("Total de empleados creados: " + Empleado.getContadorEmpleados());
	    }
}

