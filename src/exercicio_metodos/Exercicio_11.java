package exercicio_metodos;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite 'C' para Celsius ou 'F' para Farenhat");

		String escolha = sc.next();
		
		System.out.println("Digite a temperatura");
		
		double temp = sc.nextDouble();
		
		
		System.out.println(celsiusXfarenhet(escolha, temp));
		
		
		sc.close();

	}
	
	public static double celsiusXfarenhet(String tipo, double x) {
	
		double retorno = 0;
		switch (tipo) {
		
		case "c":
			retorno = 5 * (x-32)/9;
			break;
			
		case "f":
			retorno = (9*x/5)+32;
			break;
		}
		return retorno;
		
	}

}
