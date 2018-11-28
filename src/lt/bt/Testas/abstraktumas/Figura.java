package lt.bt.Testas.abstraktumas;

public abstract class Figura {
	protected double krastines;
	protected double krastinesIlgis;
	
	public Figura(double krastinesIlgis) {
		this.krastinesIlgis = krastinesIlgis;
	}

	public Figura() {
		this.krastinesIlgis = 0;
	}

	
	public double calcPerimeter() {
		double perimeter = 0;		
		return perimeter;		
	}
	
	public double calcArea() {
		double plotas = 0;
		return plotas;
	}
	
	public double calcPerimeterFromArea(double plotas) {
		double perimeter = 0;		
		return perimeter;
	}
	
	public double calcPerimeterFromPerimeter(double perimeter) {
		double plotas = 0;		
		return plotas;
	}
}
