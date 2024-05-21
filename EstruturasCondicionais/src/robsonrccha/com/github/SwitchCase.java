package robsonrccha.com.github;

public class SwitchCase {

	public static void main(String[] args) {
		
	
		/* Exemplo com IF ELSE
		 
			String sigla = "M";
			
		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO"); */
		
		// Usando o SWITCHCASE - Plano de pacote de dados de uma operadora
		
		String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("Pacote PEQUENO - 200MG");
			break; // O break é usado para sair do bloco switch. Se o break não for usado, a execução continuará no próximo caso, o que pode não ser desejado.
		}
		case "M":{
			System.out.println("Pacote MÉDIO - 500MG");
			break;
		}
		case "G":{
			System.out.println("Pacote GRANDE - 1GB");
			break;
		}
		default: // O default é usado para fornecer um bloco de código a ser executado se nenhum dos casos correspondentes for encontrado.
			System.out.println("Pacote INDEFINIDO");
		}

	}

}
