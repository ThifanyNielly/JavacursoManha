package javacurso;
import java.util.Scanner ;

public class PositivoZero {
	public static void main (String [] args) {
		Scanner scanner= new Scanner (System.in);
		
		//Solicitar ao  usuario para enserir um numero:
		   System.out.print("Porfavor, digite um Número: ");
		      double numero= scanner.nextDouble();
		      
		      //Verificar se o Número é positivo,negativo ou Zero
		        if (numero < 0) {
		        	System.out.println("O numero e negativo.");
		        } else if (numero > 0) {
		          System.out.println("O numero e positivo");
		        } else {
		          System.out.println("o numero e zero.");
		        }
		        scanner.close();
	           }
              }
		
	
   

