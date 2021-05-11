package ex03;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workbook workbook = null;
		
		try {
			workbook = Workbook.getWorkbook(new File("./jxlrwtest.xls"));
			//라이브러리 버전
			System.out.println(workbook.getVersion() );
			//워크시트 이름
			String[] names = workbook.getSheetNames();
			System.out.println(Arrays.toString(names));
			
			Sheet sheet = workbook.getSheet(0);
			System.out.println(sheet.getName());
			
			System.out.println(sheet.getColumns());
			System.out.println(sheet.getRows());
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage());
		}finally {
			if(workbook != null) workbook.close();
		}
	}

}
