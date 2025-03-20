package exercicio2Final;

public class Conta {

	private float saldo;
	
	
	
	public final void exibirSaldo() {
		System.out.println("O saldo da conta é " + this.saldo);
	}



	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
