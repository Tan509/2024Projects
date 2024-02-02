package Read_And_Write_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel__File_Program {

	public static void main(String[] args) throws Exception {
		
		File src = new File("/Users/apple/Desktop/seed_chetak/ExcelReadFile.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
	    XSSFSheet sheet1 =	wb.getSheetAt(0);
	    
	    sheet1.getRow(8).createCell(3).setCellValue("vbbbb");
	    
	    //sheet1.getRow(1).createCell(3).setCellValue("b");
	    
	    
	    //sheet1.getRow(2).createCell(3).setCellValue("100.87");
	    
	    FileOutputStream fout = new FileOutputStream(src);
	    
	    wb.write(fout);
	    
	    wb.close();
	}

}
