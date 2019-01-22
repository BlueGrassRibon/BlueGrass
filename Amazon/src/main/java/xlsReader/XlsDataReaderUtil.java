package xlsReader;

import java.util.ArrayList;

public class XlsDataReaderUtil {

    static XlsReader reader;

    public static ArrayList<Object[]> getDataFromExcel(){

        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            reader = new XlsReader(System.getProperty("user.dir")+"\\data\\Book1.xls");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        // change only sheet name in line 19
        for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
            String  email = reader.getCellData("Sheet1", "email",rowNum );
            String pass = reader.getCellData("Sheet1","pass", rowNum);
            String message = reader.getCellData("Sheet1","message", rowNum);
            Object obj[] = {email,pass,message};
            myData.add(obj);
        }
        return  myData;
    }
}