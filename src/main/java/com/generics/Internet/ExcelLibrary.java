package com.generics.Internet;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant {
    
	public static String getCellvalue(String path,String sheet,int row,int cell) throws IOException {
		FileInputStream fis=new FileInputStream(excel_sheet);
		XSSFWorkbook xwb=new XSSFWorkbook(fis);
		String cellvalue=xwb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
	}
}
