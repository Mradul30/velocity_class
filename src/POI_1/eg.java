package POI_1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class eg {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\Velocity\\API_EXCEL\\Book1.xlsx");
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
       
		System.out.println(value);
	}

}
