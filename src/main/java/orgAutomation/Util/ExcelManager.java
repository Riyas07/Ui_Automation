package orgAutomation.Util;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class ExcelManager {
    private static ExcelManager excelManager;
    private XSSFSheet sheet;
    XSSFWorkbook workbook;
    private ExcelManager()
    {
       try
       {
           InputStream inputStream=new FileInputStream("Book1.xlsx");
         workbook  =new XSSFWorkbook(inputStream);
        sheet= workbook.getSheetAt(0);
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
    public static ExcelManager getInstance()
    {
        if (excelManager == null)
        {
            excelManager=new ExcelManager();
            return excelManager;
        }
        else
        {
            return excelManager;
        }
    }
    public String[] getdata()
    {
       int lastrow= this.sheet.getLastRowNum();
       String arr[]=new String[lastrow+1];
       for(int i=0;i<lastrow+1;i++)
       {
          arr[i]=sheet.getRow(i).getCell(0).getStringCellValue();
       }
      return arr;
    }
    public void  adddata()
    {
        try
        {
           int last= sheet.getLastRowNum();
            System.out.println(last);
          XSSFRow row= sheet.createRow(last+1);
        XSSFCell cell= row.createCell(0);cell.setCellValue("mohammed");
        FileOutputStream outputStream =new FileOutputStream("Book1.xlsx");
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getInstance().adddata();
        for (String s: getInstance().getdata())
        {
            System.out.println(s);
        }
    }
}
