
public class Valida 
{
	int estado = 0;
	boolean palavraAceita = true;
	String resultado;
	
	void validacao(char[] letras, int stado) 
	{
		
	

	for (int i = 0; i < letras.length; i++) 
	{
		// Q0
		switch (estado) {

			case 0:
				if (letras[i] == 'a')
					estado = 2;
				else if (letras[i] == 'b')
					estado = 1;
				else {
					palavraAceita = false;
					i = letras.length;
				}

				break;

			// Q1
			case 1:
				if (letras[i] == 'a')
					estado = 1;
				else if (letras[i] == 'b')
					estado = 0;
				else {
					palavraAceita = false;
					i = letras.length;
				}
				
				break;
			// Q2
			case 2:
				if (letras[i] == 'a')
					estado = 4;
				else if (letras[i] == 'b')
					estado = 3;
				else {
					palavraAceita = false;
					i = letras.length;
				}
				
				break;
			// Q3
			case 3:
				if (letras[i] == 'a')
					estado = 2;
				else if (letras[i] == 'b')
					estado = 5;
				else {
					palavraAceita = false;
					i = letras.length;
				}
				
				break;
			// Q4
			case 4:
				if (letras[i] == 'a')
					estado = 5;
				else if (letras[i] == 'b')
					estado = 2;
				else {
					palavraAceita = false;
					i = letras.length;
				}
				
				break;
			// Q5
			case 5:
				if (letras[i] == 'a')
					estado = 3;
				else if (letras[i] == 'b')
					estado = 4;
				else {
					palavraAceita = false;
					i = letras.length;
				}
				
				break;

			}
		}
	
		if (palavraAceita == true && (estado == 3  || estado == 4))
			resultado = " foi aceita pelo automato";	
		else
			resultado =" não foi aceita pelo autômato";	
	}
	
	
	int getEstado() {
		return estado;
	}
	
	String getResultado() {
		return resultado;
	}
	
}