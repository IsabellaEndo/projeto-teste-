package primeiro_projeto;
import java.util.Scanner; 
public class Atividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variaveis 
		String nome, idade;
		//Instaciar classe Scanner 
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados 
		System.out.println("informe o nome: ");
		nome  = ler.next();
		
		System.out.println("informe a idade: ");
		idade = ler.next();
		
		//Processamento 
		System.out.println("seu nome e idade é: " + nome + idade);
		
		
		
		
		
		
		
	}

}
