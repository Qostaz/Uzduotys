package lt.bt.Testas.papildomi_uzdaviniai.S21_1_Butu_skaiciavimas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Utils {
	
	
	public static void printResults(Butas[] butas) {			
		for (int i = 0; i<butas.length; i++) {
			System.out.println(butas[i].butoNumeris + " " + butas[i].butoAdresas + " " + (int)butas[i].butoKambariuSkaicius + " " + butas[i].butoKadratura + " " + (int)butas[i].butoNuomosKaina +  "\r\n");
		}		
	}
	
	
	public static void writeToFile(Butas[] butas, String fileWrite) throws IOException {
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);		
		for (int i = 0; i<butas.length; i++) {
			bw.write(butas[i].butoNumeris + " " + butas[i].butoAdresas + " " + (int)butas[i].butoKambariuSkaicius + " " + butas[i].butoKadratura + " " + (int)butas[i].butoNuomosKaina +  "\r\n");
		}			
		bw.close();	
		fw.close();
		System.out.println("Write done");
	}
	
	public static String readData(RandomAccessFile data, int length) throws IOException {
		byte[] temp = new byte[length];
	    data.read(temp, 0, length);
	    String text = "";
   	 	for(int j = 0; j<length; j++) {
   	 		text += (char)temp[j];
   	 	}  
   	 	return text;
	}
	
	public static double[] readKriterijai(RandomAccessFile data) throws IOException {
    	String temp = data.readLine();
    	String[] tempArray = temp.split(" ");
    	double[] tempDoubleArray = new double[tempArray.length]; 
    	for (int i =0; i<tempArray.length; i++) {
    		tempDoubleArray[i] = Integer.parseInt(tempArray[i]);
    	} 
   	 	return tempDoubleArray;
	}
	
	public static void saveData(Butas[] butai, int butuSkaicius, RandomAccessFile data) throws IOException {
	    for(int i = 0; i<butuSkaicius; i++) {
	    	butai[i] = new Butas();
	    	butai[i].butoNumeris = Utils.readData(data, 2);
	    	data.skipBytes(1);
	    	butai[i].butoAdresas = Utils.readData(data, 25);
	    	data.skipBytes(1);
	    	butai[i].butoKambariuSkaicius = Double.parseDouble(Utils.readData(data, 1));
	    	data.skipBytes(1);
	    	butai[i].butoKadratura = Double.parseDouble(Utils.readData(data, 4));
	    	data.skipBytes(1);
	    	butai[i].butoNuomosKaina = Double.parseDouble(Utils.readData(data, 3));
	    	data.skipBytes(2);        //skipping new line symbol	    	
	    } 
	}
	
	public static Butas[] selectAccordingToCriteria(Butas[] butai, Kriterijai kriterijai, int butuSkaicius) {
	    Butas[] atrinktiButaiTemp = new Butas[butuSkaicius];
	    int count = 0;
	    for (int i = 0; i<butai.length; i++) {
	    	if (butai[i].butoKambariuSkaicius >= kriterijai.kambariuSkaicius[0] && butai[i].butoKambariuSkaicius <= kriterijai.kambariuSkaicius[1]) {
	    		if (butai[i].butoKadratura >= kriterijai.kvadratura[0] && butai[i].butoKadratura <= kriterijai.kvadratura[1]) {
		    		if (butai[i].butoNuomosKaina >= kriterijai.nuomosKaina[0] && butai[i].butoNuomosKaina <= kriterijai.nuomosKaina[1]) {
		    			atrinktiButaiTemp[count] = butai[i];
		    			count ++;
		    		}
	    		}	    		
	    	}
	    }
	    
	    Butas[] atrinktiButai = new Butas[count];
	    count = 0;
	    
	    for (int i = 0; i<atrinktiButaiTemp.length; i++) {
	    	if(atrinktiButaiTemp[i] != null) {
	    		atrinktiButai[count] = atrinktiButaiTemp[i];
	    		count++;
	    	}
	    }
	    return atrinktiButai;
	}
	
	public static void sortData(Butas[] atrinktiButai) {
	    for (int i = 0; i<atrinktiButai.length; i++) {
	    	for (int j = i+1; j<atrinktiButai.length; j++) {
	    		Butas obj1 = atrinktiButai[i];
	    		Butas obj2 = atrinktiButai[j];
	    		if (obj1.butoKadratura < obj2.butoKadratura) {
	    			atrinktiButai[i] = obj2;
	    			atrinktiButai[j] = obj1;
	    		}
	    	}
	    }
	}
	

}
