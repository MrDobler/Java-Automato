import java.util.Scanner;

public class LoopPrincipal {
	
	@SuppressWarnings("resource")
	void Loop()
	{	
		String resposta;
		int estado = 0;
		while(true)
		{
			
			Scanner input = new Scanner(System.in);
			System.out.println("Informe a palavra: ");
			String palavraOriginal = input.nextLine();
			
			Valida teste = new Valida();
			if(!teste.palavraVazia(palavraOriginal)){
				Loop();
			}else {
				
				String palavraLower = palavraOriginal.toLowerCase();
				char[] palavraArray = new char[palavraOriginal.length()-1];
				palavraArray = palavraLower.toCharArray();
				
				Transicao transicao = new Transicao();
				int resultado = transicao.funTransicao(palavraArray, estado);
				teste.estadoFinal(resultado, palavraOriginal);
				
				System.out.println("\nPressione \"e\" ou \"E\" para sair ou Enter para continuar.");
				System.out.println("_______________________________________________");
				
				
				resposta = input.nextLine();
				if (resposta.equals("e") || resposta.equals("E")) {
					System.out.println("Programa finalizado!");
					System.exit(0);
				}	
			
			}
		}
	}
}
