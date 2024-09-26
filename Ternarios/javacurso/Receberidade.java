package javacurso;

   import java.util.Scanner;
public class Receberidade {
   public static void main(String[] args) {
	   Scanner scanner =new Scanner (System.in);
	   
	  //solicitar que o usuario que insire sua idade
	   System.out.println("digite sua idade: ");
	     int idade =scanner.nextInt();
	  
	     
	      String resultado =(idade>=19) ? "Maior de idade":"Menor de idade";
	       System.out.println("O numero e "+idade+" é "+resultado);
         }
       }
	   

