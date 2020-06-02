package exercicio_metodos;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		System.out.println(delta(4, -5, 1));

	}
	
	public static int delta (int a, int b, int c) {
		
		int delta = b^2 - 4*(a*c);
		
		return delta;
	}

}
