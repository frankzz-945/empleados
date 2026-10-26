public class Empleado {

    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSueldo() {
        return 0;
    }

    public String getTipo() {
        return "Empleado";
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + getTipo());
        System.out.println("Sueldo mensual: $" + calcularSueldo());
        System.out.println("---------------");
    }
}
