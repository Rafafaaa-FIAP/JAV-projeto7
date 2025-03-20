package exercicio2Final;

public class Teste {

	public static void main(String[] args) {

		Banco banco = new Banco();
		banco.setNomeBanco("Nubank");
		banco.setAgencia("1234");
		banco.exibirDadosBancarios();

		Conta conta = new Conta();
		conta.setSaldo(1000);
		conta.exibirSaldo();
		
	}

}
