package javacurso;

  import java.util.Scanner;
  
public class Bomdia {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
	     System.out.println("Escreva um numero porfavor :0");
          int b= scanner.nextInt();
          
          switch(b) {
          case 6,7,8,9,10,11:
        	System.out.println("bom dia, vamos tomar um belo cafe enquanto ve o por do sol");
           break;
          case 12,13,14,15,16,17:
        	System.out.println("boa tarde macho!,bora comer uma bolacha :0");
           break;
         default:
        	System.out.println("vai dormir arrombado!");
          }
       }
}
