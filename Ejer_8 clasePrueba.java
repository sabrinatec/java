package tarea;

public class Prueba {
    public static void main(String[] ar) {
        Persona persona1=new Persona();
        persona1.cargarDatosPersonales();
        Empleados empleado1=new Empleados();
        empleado1.cargarDatosPersonales();
        empleado1.cargarSueldo();
        persona1.imprimirDatosPersonales();        
        empleado1.imprimirDatosPersonales();
        empleado1.imprimirSueldo();
    }
}