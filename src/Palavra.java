import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Palavra {

	public static void main(String[] args) {
		String palavra;
		char[] letras;
		int estado = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe a palavra a ser validada: ");
		palavra = input.nextLine();
		letras = palavra.toCharArray();
		Valida valida = new Valida();
		
		valida.validacao(letras, estado);
		
		System.out.println("A palavra: \""+palavra+"\""+valida.getResultado());
		System.out.println("Estado final: Q"+valida.getEstado());
		

	}

}
