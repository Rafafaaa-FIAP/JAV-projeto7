package projeto7;

public class Carro implements Veiculo, VeiculoAereo {

	public static String volante = "Redondo";
	
	public final void rodar() {
		
	}
	
	public static void darPartida() {
		System.out.println("Dar partida.");
	}
	
	@Override
	public void acelerar() {
		System.out.println("Carro acelerando!!!");
	}
	
	@Override
	public void frear() {
		System.out.println("Carro freando!!!");
	}

	@Override
	public void voar() {
		System.out.println("Carro voando!!!");
	}
	
}
