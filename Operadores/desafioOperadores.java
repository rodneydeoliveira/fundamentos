package fundamentos.Operadores;

public class desafioOperadores {
	public static void main(String[] args) {
		
	// Simule que voc� tem dois cr�diotos a receber de pessoas diferentes.
		// Se os dois te pagare, voc� ir� ao shopping comprar uma TV de 50'
		// Se somente um te pagar, voc� ir� comprar uma TV de 32'
		// Nos dois cen�rios voc� ir� tomar sorvete com a fam�lia
		// Se nenhum dos dois te pagarem, voc� n�o ir� ao shopping
		
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
