// programa demnstra a soma de dois numeros inseridos pelo usuário
// programa feito para rodar em compilador online


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("digite um numero:");
	      int variavel=input.nextInt();
	      
	      System.out.print("o numero digitado foi:"+ variavel);
	      
	      System.out.println("digite o segundo numero:");
	        int variavel2=input.nextInt();
	        
	        System.out.println("O segundo numero digitado foi"+ variavel2);
	        
	        int soma = variavel + variavel2;
	        
	        System.out.println();
	        
	        System.out.println("A SOMA DOS NUMEROS FOI:" + soma);
		
	}
}