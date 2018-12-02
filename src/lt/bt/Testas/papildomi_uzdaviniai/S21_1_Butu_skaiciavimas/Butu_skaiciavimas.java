package lt.bt.Testas.papildomi_uzdaviniai.S21_1_Butu_skaiciavimas;


import java.io.IOException;
import java.io.RandomAccessFile;


public class Butu_skaiciavimas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Duomenys_butai.txt";
	    RandomAccessFile data = new RandomAccessFile(filePath, "r");
	    
	    int butuSkaicius = Integer.parseInt(data.readLine());
	    Butas[] butuMasyvas = new Butas[butuSkaicius];
	  
	    Utils.saveData(butuMasyvas, butuSkaicius, data);
	    
		String filePathKriterijai = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Kriterijai_butai.txt";
	    RandomAccessFile dataK = new RandomAccessFile(filePathKriterijai, "r");
	    Kriterijai kriterijai = new Kriterijai();
	    kriterijai.kambariuSkaicius = Utils.readKriterijai(dataK);
	    kriterijai.kvadratura = Utils.readKriterijai(dataK);	    
	    kriterijai.nuomosKaina = Utils.readKriterijai(dataK);	    
	    
	    Butas[] atrinktiButai = Utils.selectAccordingToCriteria(butuMasyvas, kriterijai, butuSkaicius);
	    
	    Utils.sortData(atrinktiButai);
	    
	    String filePathWrite = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Rezultatai_butai.txt";
	    
	    Utils.printResults(atrinktiButai);	    
	    Utils.writeToFile(atrinktiButai, filePathWrite);
	}
}
