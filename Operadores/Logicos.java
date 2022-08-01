package fundamentos.Operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3>7;
		
		System.out.println(condicao1 && condicao2); // Os dois precisam ser verdadeiros
		System.out.println(condicao1 || condicao2); // OU. Pelo menos um dos elementos precisam ser vderdadeiro
		System.out.println(condicao1 ^ condicao2); // OU exclusivo. Obrigatoriamente, um precisa ser true e outro false
		System.out.println(!condicao1); // Inverte a situação. true -> <-false
	
	// Tabela verdade E && (AND)
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		// Tabela verdade OU || (OR)(se um for true, o resultado será true)
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		// Tabela verdade ^ OU (XOR) Exclusivo (Para retornar true, um precisa ser true e o outro false)
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false); // false
	
	}
	

}
