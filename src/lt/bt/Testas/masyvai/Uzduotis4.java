package lt.bt.Testas.masyvai;

public class Uzduotis4 {

	public static void main(String[] args) {
		int[] array = {3, 5, 7, 34, 1, 3, 6, 8, 8, 5};		
		
		for(int i = 0; i<array.length; i++) {
			for(int o =i+1; o<array.length; o++) {
				int skaicius1 = array[i];
				int skaicius2 = array[o];			
				if (skaicius1 > skaicius2) {
					array[o] = skaicius1;
					array[i] = skaicius2;				
				} 
			}
		}		
		
		for (int i = 0; i<array.length; i++) {
			boolean x = true;
			for(int j= i+1; j<array.length; j++)	{
				int skaicius1=array[i];
				int skaicius2=array[j];
				if(skaicius1==skaicius2) {
					System.out.println(array[i] + " - 2");
					i++;
					x = false;				
				}
			}
			if (x) {
			System.out.println(array[i] + " - 1");
			}
		}		
	}
}
