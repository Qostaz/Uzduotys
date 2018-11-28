package lt.bt.Testas.abstraktumas;

public class Kvadratas extends Figura{
	double krastines = 4;
	
	public Kvadratas(double krastinesIlgis) {
		super(krastinesIlgis);
		this.krastinesIlgis = krastinesIlgis;
	}
	
	public Kvadratas() {
		super();
	}
	
	@Override
	public double calcPerimeter() {
		double perimeter = krastinesIlgis*krastines;		
		return perimeter;		
	}
	@Override
	public double calcArea() {
		double plotas = Math.pow(krastinesIlgis,2);
		return plotas;
	}
	@Override
	public double calcPerimeterFromArea(double plotas) {
		krastinesIlgis = Math.sqrt(plotas);
		double perimeter = calcPerimeter();		
		return perimeter;
	}
	@Override
	public double calcPerimeterFromPerimeter(double perimeter) {
		krastinesIlgis = perimeter/krastines;
		double plotas = calcArea();		
		return plotas;
	}
}
