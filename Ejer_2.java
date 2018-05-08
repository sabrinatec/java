package tp2;


import java.util.Scanner;
public class Separar {

public static void main(String[] args) {
//variables
int n,c=0;
//inicio
System.out.println("Ingresar numero:");
Scanner teclado=new Scanner(System.in);
n=teclado.nextInt();
while(n>0){
n=n/10;
c+=1;
}
//salida
System.out.println("");
System.out.println("El numero de digitos son: "+c);

}

}