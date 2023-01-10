package seleniumprograms;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Datadrive {
    public static  void main(String args[]) throws IOException {
    	File file = new File("C:\\Users\\MY PC\\eclipse-workspace\\MavenProject\\Exceldata\\Information.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=workbook.getSheetAt(0);
        String address= sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println("Address is :"+ address);
        workbook.close();
        inputStream.close();
        
    }
}
