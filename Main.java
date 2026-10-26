import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n=== SISTEMA DE EMPLEADOS ===");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Ver empleados");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.println("\nTipo de empleado:");
                System.out.println("1. Fijo");
                System.out.println("2. Por horas");
                System.out.print("Elige: ");
                int tipo = sc.nextInt();
                sc.nextLine();

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                if (tipo == 1) {
                    System.out.print("Sueldo mensual: ");
                    double sueldo = sc.nextDouble();
                    empleados.add(new EmpleadoFijo(nombre, sueldo));
                    System.out.println("Empleado fijo registrado!");
                } else if (tipo == 2) {
                    System.out.print("Horas trabajadas: ");
                    double horas = sc.nextDouble();
                    System.out.print("Tarifa por hora: ");
                    double tarifa = sc.nextDouble();
                    empleados.add(new EmpleadoHoras(nombre, horas, tarifa));
                    System.out.println("Empleado por horas registrado!");
                } else {
                    System.out.println("Tipo no valido");
                }

            } else if (opcion == 2) {
                if (empleados.size() == 0) {
                    System.out.println("\nNo hay empleados registrados todavia.");
                } else {
                    System.out.println("\n--- LISTA DE EMPLEADOS ---");
                    for (Empleado e : empleados) {
                        e.mostrarInfo();
                    }
                }

            } else if (opcion == 3) {
                System.out.println("Adios!");
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }
}
