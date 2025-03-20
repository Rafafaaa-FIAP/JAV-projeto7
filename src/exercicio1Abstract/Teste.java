package exercicio1Abstract;

public class Teste {

	public static void main(String[] args) {

		Circulo circulo = new Circulo(5);
		circulo.calcularArea();
		circulo.calcularPerimetro();

		Retangulo retangulo = new Retangulo(4, 6);
		retangulo.calcularArea();
		retangulo.calcularPerimetro();
		
	}
}
