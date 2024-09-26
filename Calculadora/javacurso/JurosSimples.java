package javacurso;

import java.util.Scanner;

public class JurosSimples {
	public static void main(String[] args) {
		//instanciando a classe(usando a classe):
		Scanner scanner = new Scanner(System.in);
		
		//Entrada de valores:
		System.out.println("----------------------");
		System.out.println("Calculadora de juros Simples");
		System.out.println("----------------------");
		System.out.println("digite o capital");
		double capital = scanner.nextDouble();
		
          System.out.println("informe a taxa de juros (%): ");
             double taxa = scanner.nextDouble();
		   
             System.out.println("informe o tempo" );
              int tempo = scanner.nextInt();
              
            //Calculando os juros:
              double juros =( capital * taxa * tempo)/100;
		       System.out.println("o Valor dos juros são: "+juros);
		       
		       
		       double total = capital + juros;
		       System.out.println("O total investido + juros e de:"+ total);
		       
		       scanner.close();
               
	       }
	     }

