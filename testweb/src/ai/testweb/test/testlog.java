package ai.testweb.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javafx.scene.control.Cell;
import oracle.net.aso.f;

import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.ss.usermodel.CellCopyPolicy;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testlog {
	static Logger log=LoggerFactory.getLogger(testlog.class);
	public static void main(String[] args) {
		log.info("tesetlog");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("sheetabcd");
		XSSFRow firstrow=sheet.createRow(0);
		CellCopyPolicy policy = new CellCopyPolicy.Builder().cellFormula(true).build();
		for (int i = 0; i < 10; i++) {
			XSSFCell firstrowcell=firstrow.createCell(i);
			firstrowcell.setCellValue(i);
		}
		firstrow.createCell(10).setCellFormula("SUM(A1:J1)");
		//XSSFCell formualcell=firstrow.getCell(10);
		
		for(int ir=1;ir<10;ir++){
			XSSFRow row=sheet.createRow(ir);
			row.copyRowFrom(firstrow, policy);
			for (int i = 0; i < 10; i++) {
				XSSFCell cell= row.createCell(i);
				cell.setCellValue(i);
				//cell.setCellFormula("2+4");
			}
			//XSSFCell cell= row.createCell(10, CellType.FORMULA);
			//cell.copyCellFrom(formualcell, policy);
		}
		
		try {
			FileOutputStream fileOut = new FileOutputStream("WebContent/excelfile/sheetabce.xlsx");
			
			wb.write(fileOut);
			fileOut.close();
			wb.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
