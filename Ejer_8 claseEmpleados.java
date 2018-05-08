package tarea;

import java.util.Scanner;
public class Empleados extends Persona {
	protected int sueldo;
    public void cargarSueldo() {
        System.out.print("Ingrese su sueldo:");
        sueldo=teclado.nextInt();
    }
    
    public void imprimirSueldo() {
        System.out.println("El sueldo es:"+sueldo);
    }
}
