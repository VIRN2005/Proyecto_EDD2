
package proyecto_edd2;

import com.sun.jdi.connect.spi.Connection;
import java.awt.Desktop;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.util.Units;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Export_Excel {
    String path; 

    public Export_Excel(String path) {
        this.path = path;
    }
    
    public void Create_Excel(ArrayList<Campo> Header, ArrayList<Registro> values){
        try {
            String filename = "K:/data.xlsx";//Create a Filename and path
            XSSFWorkbook workbook = new XSSFWorkbook(); //Create a new Excel Workbook Use HSSFWorkbook if the version of your excel is 2003
            XSSFSheet sheet = workbook.createSheet("new Sheet"); //create a new excel sheet
            float idcolumnwidth = 20f;//columnwidth for ID
            float namecolumnwidth = 25f;//column width for names
            float deptcolumnwidth = 28f;//column width for department
            float birthdaycolumnwidth = 25f;//columnwidth for birthday

//set columnwidth of cell
            int idwidth = (int) Math.floor((idcolumnwidth * Units.DEFAULT_CHARACTER_WIDTH + 5) / Units.DEFAULT_CHARACTER_WIDTH * 256);
            int namewidth = (int) Math.floor((namecolumnwidth * Units.DEFAULT_CHARACTER_WIDTH + 5) / Units.DEFAULT_CHARACTER_WIDTH * 256);
            int deptwidth = (int) Math.floor((deptcolumnwidth * Units.DEFAULT_CHARACTER_WIDTH + 5) / Units.DEFAULT_CHARACTER_WIDTH * 256);
            int birthwidth = (int) Math.floor((birthdaycolumnwidth * Units.DEFAULT_CHARACTER_WIDTH + 5) / Units.DEFAULT_CHARACTER_WIDTH * 256);
            sheet.setColumnWidth(0, idwidth);
            sheet.setColumnWidth(1, namewidth);
            sheet.setColumnWidth(2, namewidth);
            sheet.setColumnWidth(3, namewidth);
            sheet.setColumnWidth(4, deptwidth);
            sheet.setColumnWidth(5, birthwidth);
            XSSFCellStyle style = workbook.createCellStyle();//cell style for header
            XSSFCellStyle style2 = workbook.createCellStyle();//cell style for result
            style.setAlignment(HorizontalAlignment.CENTER);//center align
            style.setBorderBottom(BorderStyle.THICK);//border bottom
            style.setBorderTop(BorderStyle.THICK);//border top
            style.setBorderLeft(BorderStyle.THICK);//border left
            style.setBorderRight(BorderStyle.THICK);//border right
            style2.setBorderBottom(BorderStyle.THIN);//border bottom
            style2.setBorderTop(BorderStyle.THIN);//border top
            style2.setBorderLeft(BorderStyle.THIN);//border left
            style2.setBorderRight(BorderStyle.THIN);//border right
            style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
            XSSFFont font = workbook.createFont();//style for header
            XSSFFont font2 = workbook.createFont();//style for result
            font.setBold(true);
            font.setFontName("Tahoma");
            font.setFontHeightInPoints((short)14);
            font2.setFontName("Cambria");
            font2.setFontHeightInPoints((short)12);
            style.setFont(font);//font style for header
            style2.setFont(font2);//font style for result
                        
            XSSFRow header = sheet.createRow((short) 0);//create a row header. 0 means row 1
            header.createCell((short) 0).setCellValue("ID Number");//Create a header for IDnumber
            header.createCell((short) 1).setCellValue("Last Name");//Create a header for Last Name
            header.createCell((short) 2).setCellValue("First Name");//Create a header for First Name
            header.createCell((short) 3).setCellValue("Middle Name");//Create a header for Middle Name
            header.createCell((short) 4).setCellValue("Department");//Create a header for Department Name
            header.createCell((short) 5).setCellValue("Birthday");//Create a header for Birthday
            header.getCell(0).setCellStyle(style);//aplly style to header
            header.getCell(1).setCellStyle(style);
            header.getCell(2).setCellStyle(style);
            header.getCell(3).setCellStyle(style);
            header.getCell(4).setCellStyle(style);
            header.getCell(5).setCellStyle(style);
            

            //Export data from Mysql to Excel
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb", "root", "1234");
//            //root is the Mysql connection username and 1234 is the password
//            //create a query to write the result in excel
//            String query = "SELECT * FROM student_info";
//            PreparedStatement pst = con.prepareStatement(query);
//            ResultSet result = pst.executeQuery();
            int i = 1;
//            while (result.next()) {
//                XSSFRow resultrow = sheet.createRow((short) i);
//                resultrow.createCell((short) 0).setCellValue(result.getInt(1)); //data from column IDNumber
//                resultrow.createCell((short) 1).setCellValue(result.getString(2));//data from column lastname
//                resultrow.createCell((short) 2).setCellValue(result.getString(3));//firstname
//                resultrow.createCell((short) 3).setCellValue(result.getString(4));//middlename
//                resultrow.createCell((short) 4).setCellValue(result.getString(5));//department
//                resultrow.createCell((short) 5).setCellValue(result.getString(6));//birthdate
//                resultrow.getCell(0).setCellStyle(style2);
//                resultrow.getCell(1).setCellStyle(style2);
//                resultrow.getCell(2).setCellStyle(style2);
//                resultrow.getCell(3).setCellStyle(style2);
//                resultrow.getCell(4).setCellStyle(style2);
//                resultrow.getCell(5).setCellStyle(style2);
//                i++;
//
//            }

            try {
                FileOutputStream fileout = new FileOutputStream(filename);
                workbook.write(fileout);
                JOptionPane.showMessageDialog(null, "Excel File has been exported");
                Desktop.getDesktop().open(new File((filename)));//automatically open after exporting
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
}
