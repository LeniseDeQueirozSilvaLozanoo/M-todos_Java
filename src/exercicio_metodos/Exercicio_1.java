package exercicio_metodos;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		System.out.println(positivoNegativo(numero));
		
		
		sc.close();

	}
public static String positivoNegativo (int x) {
	String resultado = ""; 
	if (x > 0) {
		resultado = "Positivo";
	} else {
		resultado = "Negativo";
	}
	
	return resultado;
}

}
