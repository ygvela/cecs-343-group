
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.openxml4j.opc.Package;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Takes the excel data parse it
 * It return the list of rows
 * Note : the first row is skipped because of the Header
 * @author Saket
 *
 */

public class Upload {

    private File file;

    public Upload(File file){
        this.file = file;
    }

    public ArrayList<ArrayList<Object>> extractAsList(){

        PrintStream oldErr = System.err;
        PrintStream newErr = new PrintStream(new ByteArrayOutputStream());
        System.setErr(newErr);


        ArrayList<ArrayList<Object>> list = new ArrayList<ArrayList<Object>>();
        int maxDataCount =0;
        try{
            FileInputStream file = new FileInputStream(this.file);

            // Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(Package.open(file));

            // Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();

                //Skip the first row beacause it will be header
                if (row.getRowNum() == 0) {
                    maxDataCount = row.getLastCellNum();
                    continue;
                }

                /**
                 * if row is empty then break the loop,do not go further
                 */
                if(this.isRowEmpty(row,maxDataCount)){
                    //Exit the processing
                    break;
                }

                ArrayList<Object> singleRows = new ArrayList<Object>();

                // For each row, iterate through all the columns
                for(int cn=0; cn<maxDataCount; cn++) {

                    Cell cell = row.getCell(cn, Row.CREATE_NULL_AS_BLANK);

                    switch (cell.getCellType()) {

                        case Cell.CELL_TYPE_NUMERIC:
                            singleRows.add(cell.getNumericCellValue());
                            break;

                        case Cell.CELL_TYPE_STRING:
                            singleRows.add(cell.getStringCellValue());
                            break;

                        case Cell.CELL_TYPE_BLANK : singleRows.add(null);break;

                        default : singleRows.add(cell.getStringCellValue());
                    }

                }
                list.add(singleRows);
            }
            file.close();
            //workbook.close();
        } catch (Exception e) {  e.printStackTrace();}

        System.setErr(oldErr);
        return list;
    }

    public boolean isRowEmpty(Row row,int lastcellno) {
        for (int c = row.getFirstCellNum(); c < lastcellno; c++) {
            Cell cell = row.getCell(c,Row.CREATE_NULL_AS_BLANK);
            if (cell != null && cell.getCellType() != Cell.CELL_TYPE_BLANK)
                return false;
        }
        return true;
    }
}