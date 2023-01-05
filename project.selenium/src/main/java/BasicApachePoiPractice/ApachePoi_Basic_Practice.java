package BasicApachePoiPractice;

import java.util.Arrays;

import com.shams.excel.reader.utilities.Xlsx_Reeader_EAL;

public class ApachePoi_Basic_Practice {

	public static void main(String[] args) {
		
		
		String Excelfilepath="C:\\Users\\uddin\\git\\repository\\project.selenium\\TestData\\testdata.xlsx";
		Xlsx_Reeader_EAL reader=new Xlsx_Reeader_EAL(Excelfilepath);
		
		//how many rows
		int rowcount=reader.getRowCount("register");
		System.out.println(rowcount);
		
		//how many columns
		
	   int columncount=reader.getColumnCount("register");
	   System.out.println(columncount);
	   
	   //get all data
	   
	   Object data [][]=reader.getSheetData("register");
	  System.out.println(Arrays.deepToString(data));

	}

}
