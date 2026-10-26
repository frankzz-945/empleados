public class EmpleadoFijo extends Empleado {

    private double sueldoMensual;

    public EmpleadoFijo(String nombre, double sueldoMensual) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }

    @Override
    public String getTipo() {
        return "Empleado fijo";
    }
}
