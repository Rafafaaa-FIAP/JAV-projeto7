package exercicio1Abstract;

public class Circulo extends FormaGeometrica {

	private float raio;

	
	
	public Circulo(float raio) {
        this.raio = raio;
    }
	
	
	
	@Override
	public void calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é " + area);
	}

	@Override
	public void calcularPerimetro() {
		double perimetro = 2 * Math.PI * raio;
		
		System.out.println("O perímetro do círculo é " + perimetro);
	}
	
	
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
}
