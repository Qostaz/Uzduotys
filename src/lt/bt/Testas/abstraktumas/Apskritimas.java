package lt.bt.Testas.abstraktumas;

public class Apskritimas extends Figura{
	double krastines = 1;

	public Apskritimas(double krastinesIlgis) {
		super(krastinesIlgis);
		this.krastinesIlgis = krastinesIlgis;
	}
	
	public Apskritimas() {
		super();
	}
	
	@Override
	public double calcPerimeter() {
		double perimeter = krastinesIlgis*2*Math.PI;		
		return perimeter;		
	}
	@Override
	public double calcArea() {
		double plotas = Math.PI*Math.pow(krastinesIlgis,2);
		return plotas;
	}
	@Override
	public double calcPerimeterFromArea(double plotas) {
		krastinesIlgis = Math.sqrt(plotas/Math.PI);
		double perimeter = calcPerimeter();		
		return perimeter;
	}
	@Override
	public double calcPerimeterFromPerimeter(double perimeter) {
		krastinesIlgis = perimeter/(2*Math.PI);
		double plotas = calcArea();		
		return plotas;
	}
}
