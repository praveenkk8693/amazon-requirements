package com.amazon.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.amazon.credentials.LoginCredentials;

public class DataInExcel {
	public static FileInputStream fi;
	public static XSSFWorkbook wb ;
	public static XSSFSheet ws;
	
	public static LoginCredentials getCredentials() throws IOException  {
		File file =  new File("D://amaZonData.xlsx");
		fi = new FileInputStream(file);
		wb =  new XSSFWorkbook(fi);
		ws = wb.getSheet("amazon credentials");
		XSSFRow  row = ws.getRow(1); 
		LoginCredentials loginCredentials = new LoginCredentials();
		loginCredentials.setUserName(row.getCell(0).getStringCellValue());
		loginCredentials.setPassword(row.getCell(1).getStringCellValue());
		return loginCredentials;
		
	}
	
	

}
