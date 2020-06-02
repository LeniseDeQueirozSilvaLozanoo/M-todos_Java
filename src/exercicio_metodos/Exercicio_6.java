package exercicio_metodos;

public class Exercicio_6 {

	public static void main(String[] args) {
		System.out.println(menorValor(5, -9));
		
	}
	
	public static int menorValor(int x, int y) {
		int aux = 0;
		
		if(x<y) {
			aux = x;
		} else {
			aux = y;
		}
		
		return aux;
	}

}
