package exercicio2Final;

public final class Banco {

	private String nomeBanco;
	private String agencia;
	
	
	
	public void exibirDadosBancarios() {
		System.out.println("Nome do banco " + this.nomeBanco + " e agência " + this.agencia);
	}


	
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
}
