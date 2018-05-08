package tarea;
import java.util.Scanner;

public class ParImpar {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int numero,contPares = 0, contImpares = 0;
		System.out.print("Ingrese un numero: ");
		numero = entrada.nextInt();
		
		while(numero != 0) {
			
			if(numero % 2 == 0)
				contPares = contPares + 1;
			else
				contImpares = contImpares + 1;
			
			System.out.print("Ingrese un numero: ");
			numero = entrada.nextInt();
		}
	System.out.println("Numeros pares: " + contPares +
			        "\nNumeros Impares: " + contImpares);
	}
	
}	