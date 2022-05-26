package entities;

public class Retangulo {
	public double larguraDoRetangulo;
	public double alturaDoRetangulo;
	
	public double area() {
		return this.larguraDoRetangulo * this.alturaDoRetangulo;
	}
	
	public double perimetro() {
		return (this.larguraDoRetangulo + this.alturaDoRetangulo) * 2;
	}
	
	public double diagonal() {
		
		return Math.sqrt((this.larguraDoRetangulo * this.larguraDoRetangulo) + (this.alturaDoRetangulo * this.alturaDoRetangulo));
	}
	
}
