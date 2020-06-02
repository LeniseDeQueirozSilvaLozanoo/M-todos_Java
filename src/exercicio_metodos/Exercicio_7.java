package exercicio_metodos;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		System.out.println(maiorV(-5, 10, 2));
		

	}
	
	public static int maiorV (int a, int b, int c) {
		int maior= Math.max(a, b);
		
		if (maior < c) {
			maior = c;
		}
		return maior;
	}

}
