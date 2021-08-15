package Scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Create Input steam 
        File file =    new File("C:\\DjangoProjects\\DjangoSeleniumTutorialPoint\\static\\images\\data.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        
        //create runtime sheet 
        XSSFSheet sheet=wb.getSheet("Data");
        
        //get row
        XSSFRow row1=sheet.getRow(1);
        
        //create row cell
        XSSFCell cell=sheet.getRow(1).createCell(4);
        cell.setCellValue("testwrite");
       
       //Create new row in excel sheet
        XSSFRow row=sheet.createRow(4);
        
        
        row.createCell(0).setCellValue("4");
        row.createCell(1).setCellValue("riana");
        row.createCell(2).setCellValue("6666454545");
        row.createCell(3).setCellValue("7-7-2021");
        
      //To write into Excel File
        FileOutputStream outputStream = new FileOutputStream("C:\\\\DjangoProjects\\\\DjangoSeleniumTutorialPoint\\\\static\\\\images\\\\data.xlsx");
        wb.write(outputStream);
        
 
        //close the streams
        wb.close();
        inputStream.close();
        outputStream.close();
     
	}

}
