package lt.bt.Testas.objektai;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grades = {9,5,8,7,6};
		boolean[] attendance = {true, false, true,true, false, true};
		Student studentas1 = new Student("Jonas", "Jonaitis", "Matematika", grades, attendance);
		
		StudentMethods.printWholeName(studentas1);
		
		StudentMethods.printClassName(studentas1);
		
		//studentas1.setGradesArray(grades);		
		StudentMethods.printGradesAverage(studentas1);
				
		//studentas1.setAttendanceArray(attendance);		
		StudentMethods.printAttendence(studentas1);

	}

}
