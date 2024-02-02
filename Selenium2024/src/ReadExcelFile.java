import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("/Users/apple/Desktop/seed_chetak/2023ExcelSheet.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowCount = sheet1.getLastRowNum();
		
		System.out.println("Row num: "+ rowCount);
		
		for(int i=0;i<=rowCount;i++)
		{
		   Row row = sheet1.getRow(i);
		   
		   System.out.print("col: "+ row.getLastCellNum());
		   
		   for(int j=0;j< row.getLastCellNum();j++)
		   {
			   System.out.print(row.getCell(j).getStringCellValue()+" ");
		   }
		   
		   System.out.println();
		}
		
      wb.close();
	}

}
