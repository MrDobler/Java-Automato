import java.util.Scanner;

public class Palavra
{

	public static void main(String[] args) 
	{
		String loop="sim";
		String palavra;
		char[] letras;
		int estado = 0;
		while(!loop.contains("nao") ) 
		{
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
		
			System.out.println("informe a palavra a ser validada: ");
			palavra = input.nextLine();
			letras = palavra.toCharArray();
			Valida valida = new Valida();
		
			valida.validacao(letras);
		
			System.out.println("A palavra: \""+palavra+"\""+valida.getResultado());
			System.out.println("Estado final: q"+valida.getEstado());
		
			System.out.println("\nContinuar? sim ou nao");
			loop = input.nextLine();
	
		}
	}

}
