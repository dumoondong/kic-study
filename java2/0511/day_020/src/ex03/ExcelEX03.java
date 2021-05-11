package ex03;


import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelEX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("./text.xls");
		WritableWorkbook writableWorkbook = null;
		
		try {
			writableWorkbook = Workbook.createWorkbook(file);
			WritableSheet writableSheet1 = writableWorkbook.createSheet("첫번째 시트",0);
			WritableSheet writableSheet2 = writableWorkbook.createSheet("두번째 시트",1);
			WritableSheet writableSheet3 = writableWorkbook.createSheet("세번째 시트",2);
			
			Label label = new Label(0, 0, "데이터 0,0");
			writableSheet1.addCell(label);
			writableWorkbook.write();
			System.out.println("파일이 생성되었습니다.");
		}catch (WriteException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("에러 :" + e.getMessage() );
		}finally {
			if(writableWorkbook != null)
				try {
					writableWorkbook.close();
				} catch (WriteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}