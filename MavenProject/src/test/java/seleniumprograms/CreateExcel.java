package seleniumprograms;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateExcel {
	public static void main(String[] args) throws IOException {
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("Sheet1");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Anil");
		sheet.getRow(0).createCell(1).setCellValue("Kumar");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Address");
		sheet.getRow(1).createCell(1).setCellValue("Pernamitta");
		File file = new File("C:\\Users\\MY PC\\eclipse-workspace\\MavenProject\\Exceldata\\Details.xls");
        FileOutputStream output = new FileOutputStream(file);
        workbook.close();
       	}
}
