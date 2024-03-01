package primeiro_projeto;
import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variaveis
		double a,b, som;
		//Instaciar classe Scanner 
		Scanner ler = new Scanner(System.in); 
		
		//Entrada de dados 
		System.out.println("informe o valor 1: ");
		a = ler.nextDouble();
		
		System.out.println("informe o valor 2: ");
		b = ler.nextDouble();
		
		//Processamento
		som = a+b;
		//Saida
		System.out.println("O resultado é : " + som);
			

	}

}
