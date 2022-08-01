package fundamentos.Operadores;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		System.out.println(++a == b--); // Neste caso, 'a' é incrementado em 1
		// passando a valer 2. Ao comparar 'a' e 'b' dessa forma, o que acontece em ordem é:
		// 'a' passa a valer dois, 'a' é comparado com 'b' que ainda vale 2 (return true)
		// só depois que b'' é decrementado em 1. 
		
		System.out.println(a++ == b--);
	}

}
