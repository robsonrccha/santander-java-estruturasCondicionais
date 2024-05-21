package robsonrccha.com.github;

public class Condicionalencadeada {

	public static void main(String[] args) {

		// ResultadoEscolar
		int nota = 6;

		if (nota >= 7) {
			
			System.out.println("Aluno Aprovado");
			
		} else if (nota >= 5 && nota < 7) { // outro condição a ser verificada "SENAO SE"
			
			System.out.println("Aluno de Recuperação - Exame");
			
		} else
			System.out.println("Aluno Reprovado");

	}

}
