package testngexcelintegration;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		// Open the workbook and mention the file path
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");

		//Enter into a specific sheet by sheet name or Index
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//wb.getSheetAt(0);

		//Get the Rowcount
		int rowCount = sheet.getLastRowNum();//this method will ignore heading , get real data alone
		System.out.println("Total Number of Rows:"+rowCount);
		
		//Get the Column count
		short columnCount = sheet.getRow(0).getLastCellNum();//0th row means header row
		System.out.println("Total Number of Columns:"+columnCount);
		
		//Initiate through the rows and columns
		for (int i = 1; i <=rowCount ; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);//[1][0]
				String data = cell.getStringCellValue();
				System.out.println(data);
				
			}
		}
		

		//Get the row
		/*
		 * XSSFRow row = sheet.getRow(1); //get data in row no need for heading XSSFCell
		 * cell = row.getCell(0); //first row first column String singleData=
		 * cell.getStringCellValue(); //getStringCellValue will read the data of
		 * particular cell in String format System.out.println(singleData);
		 */
	}

}
