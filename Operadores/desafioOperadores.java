package fundamentos.Operadores;

public class desafioOperadores {
	public static void main(String[] args) {
		
	// Simule que você tem dois crédiotos a receber de pessoas diferentes.
		// Se os dois te pagare, você irá ao shopping comprar uma TV de 50'
		// Se somente um te pagar, você irá comprar uma TV de 32'
		// Nos dois cenários você irá tomar sorvete com a família
		// Se nenhum dos dois te pagarem, você não irá ao shopping
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		boolean tv50 =  (trabalho1 && trabalho2);
		System.out.println("Comprou TV 50'?" + tv50);
		boolean tv32 = (trabalho1 ^ trabalho2);
		System.out.println("Comprou TV 32'? " + tv32);
		boolean comprouSorvete = (trabalho1 || trabalho2);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		
	}

}
