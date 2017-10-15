public class Transicao {
	
	Valida testa = new Valida();

	int guardaEstado;
	int x;
	int funTransicao(char[] palavra, int estado) 
	{
		
		for(int i = 0; i < palavra.length; i++)
		{
			if(!testa.valida(palavra, i)) {
				i+=palavra.length;
				x=i;
			}else {
				switch(estado)
				{
					case 0:
						if (palavra[i] == 'a')
							estado = guardaEstado = 2;
						else 
							estado = guardaEstado = 1;
						break;
						
					case 1:
						if (palavra[i] == 'a')
							estado = guardaEstado = 1;
						else 
							estado = guardaEstado = 0;
						break;
						
					case 2:
						if (palavra[i] == 'a')
							estado = guardaEstado = 4;
						else 
							estado = guardaEstado = 3;
						break;
						
					case 3:
						if (palavra[i] == 'a')
							estado = guardaEstado = 2;
						else 
							estado = guardaEstado = 5;
						break;
						
					case 4:
						if (palavra[i] == 'a')
							estado = guardaEstado = 5;
						else 
							estado = guardaEstado = 2;
						break;
						
					case 5:
						if (palavra[i] == 'a')
							estado = guardaEstado = 3;
						else 
							estado = guardaEstado = 4;
						break;
				}
			}
		}
		
		if(x > palavra.length) {
			return guardaEstado;			
		} else {
			return estado;			
		}
	}	
}
