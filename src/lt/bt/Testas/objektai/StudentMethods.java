package lt.bt.Testas.objektai;

public class StudentMethods {
	
	public static void printWholeName(Student student) {
		System.out.println(student.getName() + " " + student.getLastName());		
	}
	
	public static void printAttendence(Student student) {
		System.out.println("\nStudentas praleido pamoku: ");
		System.out.println(String.valueOf(student.getMissedClasses()));		
	}
	
	public static void printGradesAverage(Student student) {
		System.out.println("\nStudento pazymiu vidurkis: ");
		System.out.println(String.valueOf(student.averageGrades()));		
	}
	
	public static void printClassName(Student student) {
		System.out.println("\nPamoka: " + student.getClassName());		
	}

}
