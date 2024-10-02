/*
 * Bienvenido
 * Este es un juego de azar donde el usuario debe ingresar un número cualquiera para saber si eres el número 
 * afortunado o no, este juego hace la comparación entre 4 posibles casos de números afortunados (3,7,8 y 9 )
 * el programa compara solo número positivos y lo iguala a cero
 * 
 * 
 * 
 * */

import java.util.Scanner; // importa util.Scanner

public class Codigo5 {
	public static void main(String[]args) { //faltaba iniciar el main
	Scanner s = new Scanner(System.in); //se agrega system.in
	 System.out.println("Introduzca un número: "); // se cambia la comilla simple por doble
    String ni = s.nextLine();
    int c = Integer.parseInt(ni);// se confierte un string a entero
    
    int afo = 0;
    int noAfo = 0;
    int temp = c; // Guarda el valor original para despues usarlo
    while (c > 0) { // Se cambia a c
	  int digito = c % 10; //ya estaba en int no era necesario el código anterior
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
      }
	  c /= 10; // se cambia por c
    }
    if (afo > noAfo) {
    	System.out.println("El " + temp + " es un número afortunado."); //se corrige el error de System
    } else {
      System.out.println("El " + temp + " no es un número afortunado."); // se cambia a temp para imprimir el numero original
    }
    s.close(); // se cierra scanner
  }
  
}//Codigo5
