public abstract class Empleado {
    protected String nombre;
    protected String dni;
    protected static final double SUELDO_BASE = 50000;
    private static int contadorEmpleados = 0;

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        contadorEmpleados++;
    }

    public abstract double calcularSalario();

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }
}

class Tecnico extends Empleado {
    private double horasExtras;

    public Tecnico(String nombre, String dni, double horasExtras) {
        super(nombre, dni);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return SUELDO_BASE + (horasExtras * 100);
    }
}

class Administrativo extends Empleado {
    private double bono;

    public Administrativo(String nombre, String dni, double bono) {
        super(nombre, dni);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return SUELDO_BASE + bono;
    }
}

class Gerente extends Empleado {
    private double porcentajeBonificacion;

    public Gerente(String nombre, String dni, double porcentajeBonificacion) {
        super(nombre, dni);
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    @Override
    public double calcularSalario() {
        return SUELDO_BASE + (SUELDO_BASE * porcentajeBonificacion / 100);
    }
}
