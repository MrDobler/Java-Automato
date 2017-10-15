
public class Valida {
	
	boolean valida(char[] caracter, int count) 
	{
		if(caracter[count] != 'a' && caracter[count] != 'b' && caracter[count] ==' ') {
			return false;
		}else {
			return true;			
		}
		
	}
	
	boolean palavraVazia(String palavra) {
		if(palavra.equals("")) {
			System.out.println("A palavra não pode estar vazia.");
			System.out.println("_______________________________________________");
			return false;
		}else {
			return true;
		}
	}
	
	void estadoFinal(int result, String palavra) {
		if(result == 3 || result == 4) {
			System.out.println("A palavra \""+palavra+"\" foi aceita");
			System.out.println("Estado final: q"+result);
		}else {
			System.out.println("Palavra \""+palavra+"\" não aceita!");
			System.out.println("Último estado lido: q"+result);
		}
	}
	
	
}