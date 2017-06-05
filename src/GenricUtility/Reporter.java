package GenricUtility;



import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Reporter {
	
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	
	
	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

	public static void setExcelFile(String Path,String SheetName) throws Exception {

			try {

   			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			} catch (Exception e){

				throw (e);

			}

	}
	
	
	
	
public static void ReporterEvent(String strFilePath,String Scriptname,String strDesc,String strExpected,String strActual,String Status, String Snapshot)

{
	
	
	
	
	
}
	
	
	
	
	

	public static void CreateTemplate(String strFilePath) {
		 try {
	            
	            XSSFWorkbook workbook = new XSSFWorkbook();
	            XSSFSheet sheet = workbook.createSheet("FirstSheet");  
	            
	            XSSFCellStyle style = workbook.createCellStyle();
	            style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
	            //style.setFillPattern(XSSFCellStyle.BORDER_THIN);
	            XSSFFont font = workbook.createFont();
	            font.setColor(IndexedColors.BLACK.getIndex());
	            style.setFont(font);

	            
	            
	            XSSFRow rowhead = sheet.createRow((short)0);
	                    
	            XSSFCell cell1 = rowhead.createCell(0);
	    	    cell1.setCellValue("ScriptName");
	    	    cell1.setCellStyle(style);
	            
	    	    XSSFCell cell2 = rowhead.createCell(1);
	    	    cell2.setCellValue("StepDescription");
	    	    cell2.setCellStyle(style);
	    	    
	    	    XSSFCell cell3 = rowhead.createCell(2);
	    	    cell3.setCellValue("Expected");
	    	    cell3.setCellStyle(style);
	    	    
	    	    XSSFCell cell4 = rowhead.createCell(3);
	    	    cell4.setCellValue("Actual");
	    	    cell4.setCellStyle(style);
	    	    
	    	    XSSFCell cell5 = rowhead.createCell(4);
	    	    cell5.setCellValue("Status");
	    	    cell5.setCellStyle(style);
	    	    
	    	    XSSFCell cell6 = rowhead.createCell(5);
	    	    cell6.setCellValue("Snapshot");
	    	    cell6.setCellStyle(style);
	    	    
	    	    
	            
	            FileOutputStream fileOut = new FileOutputStream(ConstantAndVariables.ReportFilePath);
	            workbook.write(fileOut);
	            fileOut.close();
	     

	        } catch ( Exception ex ) {
	            System.out.println(ex);
	        }
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	

