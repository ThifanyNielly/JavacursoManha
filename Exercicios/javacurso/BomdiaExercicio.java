package BomdiaExercicio.java;

import java.util.Scanner;

   public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	 System.out.println("porfavor escreva uma hora");
	    int hora=scanner.nextInt();
	    
	     switch (hora) {
	     case 6,7,8,9,10,11:
	      System.out.println("Bom dia!,espero que tenha descansado bem!");
	    	 break;
	     case 12,13,14,15,16,17:
	     System.out.println("Boa tarde!,e hora de tomar um belo cafe e aproveitar a vista");
	          break;
	     case 18,19,20,21,22,23:
	      System.out.println("boa noite que tal uma pipoca e assitir uma serie?");
	          break;
	      default:
	    	  System.out.println("durma arrombado, ninguem e obrigado a te mandar dormir sempre.");
          }
       }
