package Read_And_Write_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_File_Program {

	public static void main(String[] args) throws Exception {
	
		
		File file = new File("/Users/apple/Desktop/seed_chetak/TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		//XSSFWorkbook and all coming fron Apache poi
		//.xls file HSSF
		//.xlsx file XSSF
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		//sp many mthods which alloow to read excel aheet
		//excel index starts with 0 for both row and col
		int rowcount = sheet1.getLastRowNum();
		
		
		for(int i =0;i< rowcount+1;i++)
		{
			Row row = sheet1.getRow(i);
			
			for(int j =0; j < row.getLastCellNum();j++)
			{
				System.out.print(row.getCell(j).getStringCellValue()+" ");
			}
			
			System.out.println();
		}

		wb.close();
	}

	

}
