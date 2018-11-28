package lt.bt.Testas.abstraktumas;

public class Trikampis_lygiakrastis extends Figura{
	double krastines = 3;
	
	public Trikampis_lygiakrastis(double krastinesIlgis) {
		super(krastinesIlgis);
		this.krastinesIlgis = krastinesIlgis;
	}
	
	public Trikampis_lygiakrastis() {
		super();
	}
	
	@Override
	public double calcPerimeter() {
		double perimeter = krastinesIlgis*krastines;		
		return perimeter;		
	}
	@Override
	public double calcArea() {
		double plotas = (Math.pow(krastinesIlgis,2)*Math.sqrt(3))/4;
		return plotas;
	}
	@Override
	public double calcPerimeterFromArea(double plotas) {
		krastinesIlgis = Math.sqrt(4*plotas/Math.sqrt(3));
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
