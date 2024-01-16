package Excel_Read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
public static String getStringData(int a, int b) throws IOException
{
	
	f= new FileInputStream("C:\\Users\\HP\\Desktop//Student_details.xlsx");
	//open workbook
	w= new XSSFWorkbook(f);
	//open sheet
	sh= w.getSheet("Sheet1");
	Row r= sh.getRow(a); // Row is a Interface
	Cell c = r.getCell(b);
	return c.getStringCellValue();
	}

public static String getIntegerData(int a, int b) throws IOException
{
	
	f= new FileInputStream("C:\\Users\\HP\\Desktop//Student_details.xlsx");
	//open workbook
	w= new XSSFWorkbook(f);
	//open sheet
	sh= w.getSheet("Sheet1");
	Row r= sh.getRow(a); // Row is a Interface
	Cell c = r.getCell(b);
	int x=(int)c.getNumericCellValue();
	return String.valueOf(x);
	}
}
