package javacurso;
public class IfConciso {
   public static void main(String[] args) {
	//Declarando variável:
	   int numero =10;
	   
	   //uso do if normal:
	 /* if (numero >=10) {
		 System.out.println("valor maior/igual que 10");
		  } else {
		   System.out.println("valor menor que 10");	   
	    } */ 
	   String resultado = (numero >= 10) ? "maior que 10":"menor que 10";
	   System.out.println("o número"+numero+"é"+resultado);
      }
}
