package fundamentos.Operadores;

public class DesafioAritmetico {
	public static void main(String[] args) {
		/*int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); // elevando variavel a em 3
		
		System.out.println(b);
		*/
		
	double a = 6*(3+2);
	double b = Math.pow(a, 2);
	double c = 3 * 2;
	double d = b / c;
	System.out.println(d);
	
	double e = 1-5;
	double f = 2-7;
	double g = e * f / 2;
	
	double h = Math.pow(g, 2);
	
	System.out.println(h);
	
	double a1 = d-h;
	double a2 = Math.pow(a1, 3);
	double a3 = Math.pow(10, 3);
	System.out.println(a2/a3);
	}
}
