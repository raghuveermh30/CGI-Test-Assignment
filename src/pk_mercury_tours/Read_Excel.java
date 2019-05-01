package pk_mercury_tours;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel {

    private static Sheet ExcelWSheet;
    private static Workbook ExcelWBook;
    
    //This Method is to read the testdata
    
    public String[][] getExcelData(String filename,String sheetName) throws EncryptedDocumentException, InvalidFormatException, IOException{
           String[][] arrayExcelData=null;
           
           FileInputStream FIS=new FileInputStream(filename);
           ExcelWBook=WorkbookFactory.create(FIS);
           ExcelWSheet=ExcelWBook.getSheet(sheetName);
           int no_Rows=ExcelWSheet.getLastRowNum();
           int no_Cols=ExcelWSheet.getRow(0).getLastCellNum();
           
           arrayExcelData=new String[no_Rows][no_Cols];
           
           for(int i=1;i<no_Rows+1;i++) {
                  int curr_No_Cols=ExcelWSheet.getRow(i).getLastCellNum();
                  for(int j=0;j<curr_No_Cols;j++) {
                        arrayExcelData[i-1][j]=ExcelWSheet.getRow(i).getCell(j).toString();
                  }
           }
           
           return arrayExcelData;
    }

	
}
