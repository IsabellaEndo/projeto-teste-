package primeiro_projeto;
import java.util.Scanner;
public class Atividade_dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variaveis 
		double horatrab, valorhora, salbruto, salliquido, inss;

		//Instaciar classe Scanner 
		Scanner ler =  new Scanner(System.in);

		//Entrada de dados 
		System.out.println("informe quantas horas vc trabalha por dia ");
		horatrab = ler.nextDouble();

		System.out.println("informe quanto voce ganha por hora ");
		valorhora = ler.nextDouble();

		//Processamento
		salbruto = horatrab * valorhora;
		inss = salbruto * 0.12 ;
		salliquido = salbruto - inss;

		//Saida
		System.out.println("o valor do salario bruto é: " + salbruto );
		System.out.println("o valor do salario liquido é: " + salliquido );




	}

}
