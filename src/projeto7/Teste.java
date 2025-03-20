package projeto7;

public class Teste {

	public static void main(String[] args) {

		Animal animal = new Cachorro();
		animal.emitirSom();
		animal.comer();
		
		Carro carro = new Carro();
		carro.rodar();
		System.out.println(carro.volante);
		
		Carro carro2 = new Carro();
		carro2.rodar();
		System.out.println(carro2.volante);
		
		//Uso do atributo estatico
		System.out.println(Carro.volante);
		Carro.darPartida();
		
	}

}
