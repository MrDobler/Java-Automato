public class Transicao {
	
	Valida testa = new Valida();
	
	int i;
	int funTransicao(char[] palavra, int estado) 
	{
		
		for(i = 0; i < palavra.length; i++)
		{
			if(!testa.valida(palavra, i)) {
				i+=palavra.length;
			}else {
				switch(estado)
				{
					case 0:
						if (palavra[i] == 'a')
							estado =  2;
						else 
							estado = 1;
						break;
						
					case 1:
						if (palavra[i] == 'a')
							estado = 1;
						else 
							estado = 0;
						break;
						
					case 2:
						if (palavra[i] == 'a')
							estado = 4;
						else 
							estado = 3;
						break;
						
					case 3:
						if (palavra[i] == 'a')
							estado = 2;
						else 
							estado = 5;
						break;
						
					case 4:
						if (palavra[i] == 'a')
							estado = 5;
						else 
							estado = 2;
						break;
						
					case 5:
						if (palavra[i] == 'a')
							estado = 3;
						else 
							estado = 4;
						break;
				}
			}
		}
		
		if(i > palavra.length) {
			return estado = -1;
		} else {
			return estado;			
		}
	}	
}
