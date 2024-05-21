package robsonrccha.com.github;

public class CondicaoTernario {

	public static void main(String[] args) {


		// Cenário 1
		int nota = 7;
		
		// "?" é a mensagem que sera exibida apos a condicao ser verdadeira, ":" sera verificado apos exibido apos a condição ser falsa
		String resultado = nota >=7 ? "Aluno Aprovado" : "Aluno Reprovado";
		System.out.println(resultado);
		
		
		// Cenário 2
		int nota2 = 6;
		
		// neste caso o primeiro ":" sera o "senao se" entao o segundo "?" será exibido se for true e o ultimo ":" o senao(else)
		String resultado2 = nota2 >=7 ? "\nAluno Aprovado" : nota2 >=5 && nota2 <7 ? "\nAluno de "
				+ "Recuperação" : "\nAluno Reprovado";
		System.out.println(resultado2);

	}

}
