package tarea;

import java.util.Scanner;

public class suma {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int suma,cant,valor,total;
        suma=0;
        cant=0;
        do {
            System.out.print("Ingrese un valor (9999 para finalizar):");
            valor=teclado.nextInt();
            if (valor!=9999) {
                suma=suma+valor;
                cant++;
            }
        } while (valor!=9999);
        if (cant!=0) {
            total=suma;
            System.out.print("El total de los valores ingresados es:");
            System.out.print(total);
        } else {
            System.out.print("No se ingresaron valores.");
        }
        if (suma>0)
        	
        {
        	System.out.print("\nEl valor acumulado es mayor a cero");
        }
        
        else if (suma==0)
          {
        	  System.out.print("\nEl valor acumulado es cero");
          }
          else
          {
        	  System.out.print("\nEl valor acumulado es menor a cero");
          }
        }
    }
