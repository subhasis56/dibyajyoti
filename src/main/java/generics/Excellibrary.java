package generics;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excellibrary implements Autoconstant
{
	public static String getCellvalue(String excel_path,String sheet,int row,int cell) throws IOException
	{
		
	
	
	
	
	FileInputStream fis=new FileInputStream(excel_path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet s = wb.getSheet(sheet);
	String cellvalue = s.getRow(row).getCell(cell).getStringCellValue();
	return cellvalue;
	
	
	}
	

}
