package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	//static ConfigReader config;

	public static String inputexcle;

	static ExcelReader reader;

	public static ArrayList<Object[]> getDataFromexcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		try {

			// config = new ConfigReader();

			// System.out.println(config.getProperty("seo"));

			// inputexcle = config.getProperty("seo");                 

			inputexcle = "C:\\Users\\a1306\\COS_TestData.xlsx";

			// System.out.println(inputexcle);

			reader = new ExcelReader(inputexcle);

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
                                                                                                              
			String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
			String mobile_number = reader.getCellData("Sheet1", "mobile_number", rowNum);
			String mpin1 = reader.getCellData("Sheet1", "mpin1", rowNum);
			String mpin2 = reader.getCellData("Sheet1", "mpin2", rowNum);
			String mpin3 = reader.getCellData("Sheet1", "mpin3", rowNum);
			String mpin4 = reader.getCellData("Sheet1", "mpin4", rowNum);

			Object ob[] = { INDEX, mobile_number, mpin1 , mpin2 , mpin3 , mpin4 };

			myData.add(ob);

		}

		return myData;

	}

	// Title Status

	public static void title_Status(String value, int INDEX) throws Exception {

		Thread.sleep(1000);

		File fis = new File(inputexcle);

		FileInputStream excelloc = new FileInputStream(fis);

		XSSFWorkbook wb = new XSSFWorkbook(excelloc);

		XSSFSheet s = wb.getSheetAt(0);

		XSSFRow row = s.getRow(INDEX);

		XSSFCell c = row.createCell(3);

		if (value == "FAIL" || value == "INVALID URL") {

			XSSFCellStyle my_style = wb.createCellStyle();

			XSSFFont my_font = wb.createFont();

			my_font.setColor(XSSFFont.COLOR_RED);

			my_style.setFont(my_font);

			c.setCellValue(value);

			c.setCellStyle(my_style);

		} else {

			c.setCellValue(value);

		}

		FileOutputStream out = new FileOutputStream(fis);

		wb.write(out);

		out.close();

	}

}
