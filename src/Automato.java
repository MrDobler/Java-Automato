import java.util.Scanner;

public class Automato  {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String resposta;
		
		while(true){
			Scanner input = new Scanner(System.in);
			System.out.println("Informa a palavra: ");
			String palavraOriginal = input.nextLine();
			
			String palavraLower = palavraOriginal.toLowerCase();
			char[] palavra = new char[palavraOriginal.length()-1];
			palavra = palavraLower.toCharArray();
			int estado = 0;
			
			Transicao transicao = new Transicao();
			
			int resultado = transicao.funTransicao(palavra, estado);
			
			
			if(resultado == 3 || resultado == 4) {
				System.out.println("A palavra: "+palavraOriginal+" foi aceita");
				System.out.println("Estado final: "+resultado);
			}else {
				System.out.println("Palavra não aceita!");
			}
			System.out.println("\ncontinuar?");
			System.out.println("__________________________");
			
			resposta = input.nextLine();
			if (resposta.equals("n")) {
				System.out.println("Programa finalizado!");
				break;
			}
		}
		
	}
		
}
