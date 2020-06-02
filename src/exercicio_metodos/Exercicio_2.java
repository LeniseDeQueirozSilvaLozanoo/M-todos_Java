package exercicio_metodos;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Float valor = null;
		System.out.println(nuloXnao(valor));
		
		sc.close();
	}

	public static boolean nuloXnao (Float x) {
		
		if(x == null) {
			return true;
		} return false;
	}
}
