package javacurso;

public class TrabalhandoComString {

	public static void main(String[] args) {
        String texto  = "bem vindo ao curso de Java";
        String texto2 = "Vamos aprender sobre String. ";
        
      
        //1.Comprimento da string:
    String nome = "Thifany nielly farias da silva";
        System.out.println("Comprimento da String: "+nome.length());
        
        //2.Concatenar strings:
        String textoCompleto = texto +" "+texto2;
        System.out.println( "texto completo :"+ textoCompleto);
       String Nome2 = "maria";
      String Sobrenome = "Viana";
        System.out.println(Nome2 + Sobrenome);
        
        
        //3. Converter para Maiusculas e minusculas:
        System.out.println("MAIUSCULAS: "+texto.toUpperCase());
        System.out.println("minusculas: "+ texto.toLowerCase());
        
        //4.Substituir uma parte da string:
        String novotexto = texto.replace("Vitoria", "java");
        System.out.println("texto após substituição: "+ novotexto);
          
        
        //5.Buscar por uma substring:
        int posicao = texto.indexOf("curso");
        System.out.println("posicao da palavra 'curso': "+ posicao);
        
        //6.Verificar se uma string começa ou termina com 1 substring:
        System.out.println("começa com 'bem': " + texto.startsWith("bem"));
        
        
        //7.Dividr String:
        String[] palavras = textoCompleto.split(" ");
        System.out.println("Palavras no texto completo:");
            for (String palavra : palavras ) {
            	System.out.println(palavra);
            	
         //8.remover espaços em branco:
             String textoComespaços = "     texto com espaços     ";
             System.out.println("texto sem espaços: '"+ textoComespaços.trim() + "'");
            }
	 
	}
	
}	
        
    
  
