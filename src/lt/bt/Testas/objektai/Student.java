package lt.bt.Testas.objektai;

public class Student {
	private String name = "";
	private String lastName = "";
	private String className = "";
	private int[] gradesArray = null;
	private boolean[] attendanceArray = null;
	
	public Student(String name, String lastName, String className, int[] gradesArray, boolean[] attendanceArray) {
		this.name = name;
		this.lastName = lastName;
		this.className = className;
		this.gradesArray= gradesArray;
		this.attendanceArray = attendanceArray;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int[] getGradesArray() {
		return gradesArray;
	}
	public void setGradesArray(int[] gradesArray) {
		this.gradesArray = gradesArray;
	}
	public boolean[] getAttendanceArray() {
		return attendanceArray;
	}
	public void setAttendanceArray(boolean[] attendanceArray) {
		this.attendanceArray = attendanceArray;
	}
	
	public double averageGrades() {
		int gradesSum = 0;		
		for (int i =0; i<this.gradesArray.length; i++) {
			gradesSum += gradesArray[i];			
		}
		
		double average =gradesSum/gradesArray.length;
		return average;
	}
	
	public int getMissedClasses() {
		int missedClasses = 0;
		for (int i =0; i<this.attendanceArray.length; i++) {
			if(!attendanceArray[i]) {
				missedClasses++;
			}
		}
		return missedClasses;
	}
	
}
