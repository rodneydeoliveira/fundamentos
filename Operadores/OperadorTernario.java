package fundamentos.Operadores;

public class OperadorTernario {
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultado = media >= 7.0 ? "aprovado.": media >= 5.0? 
				"em recupera��o.": "reprovado.";
		// se media for maior que 7.0, retornar� aprovado. Se for >= 5, return 'em recupera��o'
		// Caso contr�rio (:), retornar� reprovado.
		
	}

}
