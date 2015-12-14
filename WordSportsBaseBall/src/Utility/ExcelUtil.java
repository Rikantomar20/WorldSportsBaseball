package Utility;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtil 
{
	private static HSSFWorkbook workbook;
	private static HSSFSheet sheet;
	private static HSSFCell cell;
	private static String location;
	private static String sheetname;
	static String CellData;
	static String Data;
	
	public static void setExcelFile() throws Exception
	{
		location="D:\\BaseballDataExcel.xls";
		sheetname="AdminSheet";
		try
		{
			FileInputStream excelfile=new FileInputStream(location);
		    workbook=new HSSFWorkbook(excelfile);
		    sheet=workbook.getSheet(sheetname);
		}
		
		catch(Exception e)
		{
			throw (e);
	    }	
	}	
		public static String getCellData(int RowNum, int ColNum) throws Exception
		{
			try
			{
				cell=sheet.getRow(RowNum).getCell(ColNum);
			    CellData=cell.getStringCellValue();
				
				return CellData;
			}
			
			catch(Exception e)
			{
				return"";
			}
			
		}
		
		/*public static double getData(int RowNum, int ColNum) throws Exception{

			   

		       cell = sheet.getRow(RowNum).getCell(ColNum);

		       double CellData = cell.getNumericCellValue();
		       
		       return CellData;

		      
		}*/
		
		public static String getData(int RowNum, int ColNum) throws Exception
		{
			try
			{
				cell=sheet.getRow(RowNum).getCell(ColNum);
			   
				double d1=cell.getNumericCellValue();
				long i=(long)d1;
				Data=Long.toString(i);
				return Data;
			}
			
			catch(Exception e) 
			{
			    return Data;  
			}
			
		}
	}