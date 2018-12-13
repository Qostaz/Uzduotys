package lt.bt.Testas.Kolekcijos;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class KolekcijosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <BigInteger,Zmogus> zmones = new TreeMap<>();
		Zmogus zmogus1 = new Zmogus("Petras", "Petraitis", new BigInteger("4568912333"));
		Zmogus zmogus2 = new Zmogus("Jonas", "Jonaitis", new BigInteger("4568912454"));
		Zmogus zmogus3 = new Zmogus("Gedas", "Gedaitis", new BigInteger("4012568795"));
		
		zmones.put(zmogus1.getAsmensKodas(), zmogus1);
		zmones.put(zmogus2.getAsmensKodas(), zmogus2);		
		zmones.put(zmogus3.getAsmensKodas(), zmogus3);		

		for(Map.Entry<BigInteger,Zmogus> entry : zmones.entrySet()) {
			BigInteger key = entry.getKey();			
			String value = entry.getValue().getVardas();
			String value2 = entry.getValue().getPavarde();
			BigInteger value3 = entry.getValue().getAsmensKodas();

			  System.out.println(key + " => " + value + " " + value2 + ", " + value3);
		}
		
		
	    for(BigInteger key : ((TreeMap<BigInteger, Zmogus>) zmones).descendingKeySet()){
	    	
			String value = zmones.get(key).getVardas();
			String value2 = zmones.get(key).getPavarde();
			BigInteger value3 = zmones.get(key).getAsmensKodas();

			System.out.println(key + " => " + value + " " + value2 + ", " + value3);
	    }

		
	}

}
