package robsonrccha.com.github;

public class CondicionalSimples {

	public static void main(String[] args) {
		
		
		//Exemplo de Caixa Eletrônico
		double saldo = 25.0;
	    double valorSolicitado = 17.0;

	    if(valorSolicitado < saldo) // verificação com a instrução if para controlar o fluxo da tomada de decisao
	    saldo = saldo - valorSolicitado; // se a condição for verdadeira entra dentro do if para realizar o comando

	    System.out.println("Seu saldo atual é R$ " + saldo);

	}

}
