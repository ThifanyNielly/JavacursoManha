package javacurso;
import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] agrs) {
	  Scanner scanner= new Scanner (System.in);
	System.out.println("me fale um numero: ");
	   int Numero =scanner.nextInt();
	  //Verificar se o número é par, ou impar:
	   if (Numero %2==0) {
		  System.out.println("Numero e par"); 
	   } else {
		 System.out.println("o numero e impar");
	   }
	   }

}
