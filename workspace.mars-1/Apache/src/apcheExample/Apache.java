package apcheExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       File src= new File("Desktop");
       
       
       FileInputStream fis= new FileInputStream(src);
       
       XSSFWorkbook wb= new XSSFWorkbook(fis);
       
       XSSF
	
	}

}
