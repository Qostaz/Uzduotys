package lt.bt.Testas.funkcijos;

public class ForLoop_rekursija {

	public static void main(String[] args) {	
		int[] skaiciai = {5, 8, 15, 2, 6, 8, 23, 54};
		didejimoTvarka(skaiciai);		
		int b= 0;
		arrayPrint(b, skaiciai);
	}
	

	
	private static void didejimoTvarka(int[] array) {
		for (int i = 0; i<array.length; i++) {
			for (int j = i+1; j<array.length; j++) {
				int skaicius1 = array[i];
				int skaicius2 = array[j];
				if(skaicius1>skaicius2) {
					array[i]= skaicius2;
					array[j]= skaicius1;
				}
			}
		}
	}
		
	private static void arrayPrint(int i, int[] array) {
		if(i<array.length) {
			System.out.println(array[i]);		
			i= i+1;
			arrayPrint(i, array);
		}
	}

}
