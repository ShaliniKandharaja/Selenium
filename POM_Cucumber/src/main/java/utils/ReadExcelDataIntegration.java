package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataIntegration {

	public static String[][] readExcel(String excelFileName) throws IOException { //we can keep this as static method, whenever we need this method
		//we can just put this class name & call the method, don't need to create object for each time
		//if we don't have static keyword, we have to create object for the class ReadExcelDataIntegration, through object
		//we have to call the method
		//If we have static method, we can call like classname.methodname
		
		// Open the workbook and mention the file path
				//XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+excelFileName+".xlsx");

				//Enter into a specific sheet by sheet name or Index
				XSSFSheet sheet = wb.getSheet("Sheet1");
				//wb.getSheetAt(0);

				//Get the Rowcount
				int rowCount = sheet.getLastRowNum();//this method will ignore heading , get real data alone
				System.out.println("Total Number of Rows:"+rowCount);
				
				//Get the Column count
				short columnCount = sheet.getRow(0).getLastCellNum();//0th row means header row
				System.out.println("Total Number of Columns:"+columnCount);
				
				String data[][]=new String[rowCount][columnCount];
				
				//Initiate through the rows and columns
				for (int i = 1; i <=rowCount ; i++) {
					XSSFRow row = sheet.getRow(i);
					for (int j = 0; j < columnCount; j++) {
						XSSFCell cell = row.getCell(j);//[1][0]
						String readData = cell.getStringCellValue();
						data [i-1][j]=readData; // In Array Index should start from 0, So gave data [i-1][j]=readData;
						//data [1-1][0]=readData;
						
					}
				}
				
				wb.close(); // Close the workbook
				return data;

				//Get the row
				/*
				 * XSSFRow row = sheet.getRow(1); //get data in row no need for heading XSSFCell
				 * cell = row.getCell(0); //first row first column String singleData=
				 * cell.getStringCellValue(); //getStringCellValue will read the data of
				 * particular cell in String format System.out.println(singleData);
				 */


	}

	public static String[][] readExcel1(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

}
