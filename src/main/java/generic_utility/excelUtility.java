package generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import different_ways_post.pojo_post;

public class excelUtility {
	public Object[][] excelData(String sheetname) throws Throwable {
		// pojo_post po = new pojo_post("madan", "madan6999", "pass", 1);
		FileInputStream f1 = new FileInputStream(".\\src\\test\\resources\\restassured.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet(sheetname);
		int lastrow = sh.getLastRowNum() + 1;
		int lastcell = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastrow][lastcell];
		for (int i = 0; i < lastrow; i++) {
			for (int j = 0; j < lastcell; j++) {
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}

	public String excel(String sheetname, int row, int coll) throws Throwable {
		FileInputStream f1 = new FileInputStream(".\\src\\test\\resources\\restassured.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sh = wb.getSheet(sheetname);
		Row rw = sh.getRow(row);
		String sh1 = rw.getCell(coll).getStringCellValue();
		return sh1;

	}

}
