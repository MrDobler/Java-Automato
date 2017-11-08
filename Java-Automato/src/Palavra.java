import java.util.Scanner;

public class Palavra
{

<<<<<<< HEAD
	public static void main(String[] args) {
		boolean loop = true;
		String palavra, continua;
		char[] letras;
		
		while(loop) {
=======
	public static void main(String[] args) 
	{
		String loop="sim";
		String palavra;
		char[] letras;
		int estado = 0;
		while(!loop.contains("nao") ) 
		{
>>>>>>> 763dc41a8cc5fa024235b87a38471b7678fcb45e
			
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
<<<<<<< HEAD
			continua = input.nextLine();
			
			if (continua.equalsIgnoreCase("nao") || continua.equalsIgnoreCase("não"))
				loop = false;

=======
			loop = input.nextLine();
	
>>>>>>> 763dc41a8cc5fa024235b87a38471b7678fcb45e
		}
	}

}
