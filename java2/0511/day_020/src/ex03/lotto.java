package ex03;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Workbook workbook = null;
		
		try {
			workbook = Workbook.getWorkbook(new File("./lotto(1~962).xls"));
			Sheet sheet = workbook.getSheet(0);
			String sum= "";
			for(int row=4; row<=sheet.getRows(); row++) {
				Cell turn = sheet.getCell(2-1, row-1);
				Cell num1 = sheet.getCell(14-1, row-1);
				Cell num2 = sheet.getCell(15-1, row-1);
				Cell num3 = sheet.getCell(16-1, row-1);
				Cell num4 = sheet.getCell(17-1, row-1);
				Cell num5 = sheet.getCell(18-1, row-1);
				Cell num6 = sheet.getCell(19-1, row-1);
				Cell num7 = sheet.getCell(20-1, row-1);
				
	
				System.out.printf("%2s회 %2s %2s %2s %2s %2s %2s %2s \n",
						turn.getContents(),num1.getContents(),num2.getContents(),
						num3.getContents(),num4.getContents(),num5.getContents(),
						num6.getContents(),num7.getContents());
			}
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :"+e.getMessage());
		}finally {
			if( workbook != null ) workbook.close();
		}	
	}

}
