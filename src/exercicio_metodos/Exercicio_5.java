package exercicio_metodos;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		
		System.out.println(maiorValor(9, 8));

	}
	
	public static int maiorValor(int x, int y) {
		
		int aux = 0;
		
		if(x > y) {
			aux = x;
		} else {
			aux = y;
		}
		
		return aux;
	}

}
