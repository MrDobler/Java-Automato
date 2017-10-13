import java.util.Scanner;

public class Automato  {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String resposta;
		
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Informe a palavra: ");
			String palavraOriginal = input.nextLine();
			if(palavraOriginal.equals("")) {
				System.out.println("A palavra não pode estar vazia.");
				break;
			}
			
			String palavraLower = palavraOriginal.toLowerCase();
			char[] palavra = new char[palavraOriginal.length()-1];
			palavra = palavraLower.toCharArray();
			int estado = 0;
			
			Transicao transicao = new Transicao();
			
			int resultado = transicao.funTransicao(palavra, estado);
			
			
			if(resultado == 3 || resultado == 4) {
				System.out.println("A palavra \""+palavraOriginal+"\" foi aceita");
				System.out.println("Estado final: q"+resultado);
			}else {
				System.out.println("Palavra \""+palavraOriginal+"\" não aceita!");
			}
			
			System.out.println("\nPressione n para sair ou Enter para continuar.");
			System.out.println("_______________________________________________");
			
			
			resposta = input.nextLine();
			if (resposta.equals("n") || resposta.equals("N")) {
				System.out.println("Programa finalizado!");
				break;
			}
		}
		
	}
		
}
