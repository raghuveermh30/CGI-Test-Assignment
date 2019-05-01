package pk_mercury_tours;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Read_data_from_Excel {
	public static void main(String args[]) throws EncryptedDocumentException, InvalidFormatException, IOException  {
		
		Read_Excel re = new Read_Excel();
		
		String[][] data = re.getExcelData("Test_sele.xls", "Testdata");
		
		for(int i=0;i<data.length;i++) {
			System.out.println("\n");
			for(int j=0;i<data[i].length;j++) {
				System.out.println(data[i][j]+ "\t");
			}
		}
	}
}
