package Scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcel {

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
        
        //get row cell
        XSSFCell cell=sheet.getRow(1).getCell(1);
        XSSFCell cell1=sheet.getRow(1).getCell(2);
        XSSFCell cell2=sheet.getRow(1).getCell(3);
        
        //get cell data
        String username= cell.getStringCellValue();
        int Mobilenumber=(int) cell1.getNumericCellValue();
        Date userlogindate=cell2.getDateCellValue();
        
        //print
        System.out.println(username);
        System.out.println(Mobilenumber);
        System.out.println(userlogindate);
        
        
        //close the streams
        wb.close();
        inputStream.close();
     
	}

}
