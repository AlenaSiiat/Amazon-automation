package testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet {
public static Workbook w;
public static Sheet sheet; //sheet class is used to represent excelsheet
public static Object [][] readdata (String Sheetname) {
	
	FileInputStream file=null; //to leave it global, we assign null
	try  { //obtains data from excelsheet
	file=new FileInputStream("C:\\Users\\Alena\\eclipse-workspace\\amazon\\src\\test\\java\\testdata\\data.xlsx");	
	}
	catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
	
	try {w=WorkbookFactory.create(file);} //to read data from workbook and excelsheet
	
	catch (IOException a) {
		a.printStackTrace();
	}
	sheet=w.getSheet(Sheetname); //gets the sheet with a given name
	
	Object [][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
	for(int i=0;i<sheet.getLastRowNum();i++) //to fetch rows
	{for (int m=0;m<sheet.getRow(0).getLastCellNum();m++) //to fetch columns
		data[i][m]=sheet.getRow(i+1).getCell(m).toString(); //to read cell value
	
	}
	return data;
	}
}
	
	
	
	
	

