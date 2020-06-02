package exercicio_metodos;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		System.out.println(menorV(1, -2, 3));
	}
	
	public static int menorV (int a, int b, int c) {
		int menor = Math.min(a, b);
		
		if(menor > c) {
			menor = c;
		}
		return menor;
		
	}

}
