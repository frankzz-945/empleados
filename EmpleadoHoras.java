public class EmpleadoHoras extends Empleado {

    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoHoras(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String getTipo() {
        return "Empleado por horas";
    }
}
