package javacurso;
import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {
	   Scanner scanner = new  Scanner(System.in);
	   
	   
	  //Entradas do usuario:
	   //Pegando o capital inicial:
	   System.out.println("Digite o capital");
		 double capital = scanner.nextDouble();
		 
		 
		//Pegando Taxa de juros:
		 System.out.println("Qual e a taxa de juros ");
		   double taxa = scanner.nextDouble();
		   
		   //Pegando o Tempo:
		   System.out.println("Digite o tempo em anos");
		      int n = scanner.nextInt();
		      
		   //Calculando os juros compostos:
		     double montante = capital * Math.pow(1 + (taxa/100), n);
		     //saida final:
		     System.out.println("O montante final sera de R$" + montante);
		     scanner.close();
		     
		   }
         }