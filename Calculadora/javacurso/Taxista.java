package javacurso;
   
import java.util.Scanner;

public class Taxista {
   public static void main(String[]args)  {
     	Scanner scanner = new Scanner (System.in);
     	
   System.out.print("digite a quantidade de quilometros rodados ");
   double quilometros = scanner.nextDouble();

     double n1= quilometros*2+10; 
     
    System.out.print(n1);
}
}