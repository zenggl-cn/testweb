package ai.testweb.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.CellCopyPolicy;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class templatecopy {

	public static void main(String[] args) {
		try (FileOutputStream os = new FileOutputStream("WebContent/excelfile/report.xlsx")) {
			try (InputStream is =new FileInputStream("WebContent/excelfile/Calculation_Mechanism_Report.xlsx")){
				/*Transformer transformer = TransformerFactory.createTransformer(is, os);
				XlsArea xlsArea = new XlsArea("K1", transformer);
				xlsArea.processFormulas();
				transformer.write();*/
				XSSFWorkbook book=new XSSFWorkbook(is);
				XSSFSheet sheet=book.getSheetAt(1);
				XSSFRow row=sheet.getRow(10);
				XSSFRow newrow=sheet.createRow(38);
				CellCopyPolicy policy = new CellCopyPolicy.Builder().cellFormula(true).build();
				newrow.copyRowFrom(row, policy);
				
				book.write(os);
				book.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
