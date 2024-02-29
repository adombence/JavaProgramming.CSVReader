package javaProgramming.FileManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javaProgramming.GUI.EmpTM;

public class FileManager {

	public static EmpTM CSVReader() {
		Object emptmn[] = { "Jel", "Kód", "Név", "Szülidő", "Lakóhely", "Fizetés" };
		EmpTM etm = new EmpTM(emptmn, 0);
		
 		 try {
			 BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
			 String line = reader.readLine();
			 
			 line = reader.readLine();
			 
			 while (line != null) {
				 //String data = line.replaceAll(";", " - ");
				 String[] dataArr = line.split(";");
				 //System.out.println(data);
				 etm.addRow(new Object[] { false, dataArr[0], dataArr[1], dataArr[2], dataArr[3], dataArr[4] });
				 line = reader.readLine();
			 }
			 
			 reader.close();
		} catch (IOException ioe) {
			System.out.println("CSVReader: " + ioe.getMessage());
		}
 		 
 		 return etm;
	}
}

