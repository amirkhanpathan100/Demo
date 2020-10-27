import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Amir\\eclipse-workspace\\Apache_practice\\Demo_Excels\\Rechargedetails.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		//System.out.println(lastrow);

		for(int i=1;i<=lastrow;i++)
		{
			String data = sheet.getRow(i).getCell(0).getStringCellValue();
			String data1 = sheet.getRow(i).getCell(1).getStringCellValue();

			System.out.println(i+")"+data+"  "+ data1);
		}
	}

}