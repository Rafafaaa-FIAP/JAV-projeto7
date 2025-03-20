package exercicio1Abstract;

public class Retangulo extends FormaGeometrica {

	private float largura;
    private float altura;

    
    
    public Retangulo(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    
    
	@Override
	public void calcularArea() {
		double area = largura * altura;
		
		System.out.println("A área do retângulo é " + area);
	}

	@Override
	public void calcularPerimetro() {
		double perimetro = 2 * (largura + altura);
		
		System.out.println("O perímetro do retângulo é " + perimetro);
		
	}

	
	
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
