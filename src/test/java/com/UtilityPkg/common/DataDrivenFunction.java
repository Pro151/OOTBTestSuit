package com.UtilityPkg.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFunction {

    // Method to get data from a specific row based on the test case name from the specified sheet
    public ArrayList<String> getData(String filePath, String sheetName, String testCaseName) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        FileInputStream fis = null;
        XSSFWorkbook workbook = null;

        try {
            // Open the Excel file
            fis = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fis);

            // Iterate through the sheets to find the specified sheet
            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet " + sheetName + " does not exist in the file.");
            }

            // Find the column index of the Test_case_ID column
            int column = findColumnIndex(sheet, "Test_case_ID");
            if (column == -1) {
                throw new IllegalArgumentException("Test_case_ID column not found in the sheet " + sheetName);
            }

            // Iterate through the rows to find the specified test case row
            Iterator<Row> rows = sheet.iterator();
            while (rows.hasNext()) {
                Row row = rows.next();
                Cell cell = row.getCell(column);
                if (cell != null && cell.getCellType() == CellType.STRING &&
                        cell.getStringCellValue().equalsIgnoreCase(testCaseName)) {
                    // Fetch all cells in the row and add their values to the data list
                    for (Cell c : row) {
                        if (c.getCellType() == CellType.STRING) {
                            data.add(c.getStringCellValue());
                        } else if (c.getCellType() == CellType.NUMERIC) {
                            data.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                        } else if (c.getCellType() == CellType.BOOLEAN) {
                            data.add(String.valueOf(c.getBooleanCellValue()));
                        } else if (c.getCellType() == CellType.BLANK) {
                            data.add("");
                        }
                    }
                    break; // Break the loop once the test case row is found
                }
            }
        } finally {
            // Close resources
            if (workbook != null) {
                workbook.close();
            }
            if (fis != null) {
                fis.close();
            }
        }

        return data;
    }

    // Method to find the column index by its header name in the first row
    private int findColumnIndex(XSSFSheet sheet, String columnHeader) {
        Row firstRow = sheet.getRow(0);
        if (firstRow != null) {
            Iterator<Cell> cells = firstRow.cellIterator();
            int colIndex = 0;
            while (cells.hasNext()) {
                Cell cell = cells.next();
                if (cell.getCellType() == CellType.STRING && cell.getStringCellValue().equalsIgnoreCase(columnHeader)) {
                    return colIndex;
                }
                colIndex++;
            }
        }
        return -1; // Column not found
    }
}

/*import com.google.common.collect.Table;
import com.sun.rowset.internal.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class dataDriven {

    public ArrayList<String> getData(String testcaseName) throws IOException, SQLException {

    }

    public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub

    }

}
import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class DataDrivenMethod {
    private XSSFSheet ExcelWSheet;
    private XSSFWorkbook ExcelWBook;

    //Constructor to connect to the Excel with sheetname and Path
    public void Excelutils(String Path, String SheetName) throws Exception {

        try {
            // Open the Excel file
            FileInputStream ExcelFile = new FileInputStream(Path);

            // Access the required test data sheet
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);
        } catch (Exception e) {
            throw (e);
        }
    }

    //This method is to set the rowcount of the excel.
    public int excel_get_rows() throws Exception {

        try {
            return ExcelWSheet.getPhysicalNumberOfRows();
        } catch (Exception e) {
            throw (e);
        }
    }

    //This method to get the data and get the value as strings.
    public String getCellDataasstring(int RowNum, int ColNum) throws Exception {

        try {
            String CellData =
                    ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
            System.out.println("The value of CellData " + CellData);
            return CellData;
        } catch (Exception e) {
            return "Errors in Getting Cell Data";
        }
    }

    //This method to get the data and get the value as number.
    public double getCellDataasnumber(int RowNum, int ColNum) throws Exception {

        try {
            double CellData =
                    ExcelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
            System.out.println("The value of CellData " + CellData);
            return CellData;
        } catch (Exception e) {
            return 000.00;
        }
    }


}*/

/*import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFunction {

//Identify Testcases coloum by scanning the entire 1st row
//once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
//after you grab purchase testcase row = pull all the data of that row and feed into test

    public ArrayList<String> getData(String testcaseName, String sheetName) throws IOException {
//fileInputStream argument
        ArrayList<String> a = new ArrayList<String>();

        FileInputStream fis = new FileInputStream("\"C:\\Users\\promitmukherjee\\Downloads\\MISC\\Learning\\Java\\Auto\\OOTBTestSuit\\DataDriven\\TestData.xlsx\"");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
                XSSFSheet sheet = workbook.getSheetAt(i);
//Identify Testcases coloum by scanning the entire 1st row

                Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
                Row firstrow = rows.next();
                Iterator<Cell> ce = firstrow.cellIterator();//row is collection of cells
                int k = 0;
                int coloumn = 0;
                while (ce.hasNext()) {
                    Cell value = ce.next();

                    if (value.getStringCellValue().equalsIgnoreCase("Test_case_ID")) {
                        coloumn = k;

                    }

                    k++;
                }
                System.out.println(coloumn);

////once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
                while (rows.hasNext()) {

                    Row r = rows.next();

                    if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName)) {

////after you grab purchase testcase row = pull all the data of that row and feed into test

                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {
                            Cell c = cv.next();
                            if (c.getCellType() == CellType.STRING) {

                                a.add(c.getStringCellValue());
                            } else {

                                a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

                            }
                        }
                    }
                }

            }
        }
        return a;

    }


}*/




