package fundamentos.Operadores;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		System.out.println(++a == b--); // Neste caso, 'a' � incrementado em 1
		// passando a valer 2. Ao comparar 'a' e 'b' dessa forma, o que acontece em ordem �:
		// 'a' passa a valer dois, 'a' � comparado com 'b' que ainda vale 2 (return true)
		// s� depois que b'' � decrementado em 1. 
		
		System.out.println(a++ == b--);
	}

}
