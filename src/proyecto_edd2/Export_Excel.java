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

    public void Create_Excel(ArrayList<Campo> Header, ArrayList<Registro> values, String filename) {
        try {
            String excelname = path+".xlsx";
            XSSFWorkbook workbook = new XSSFWorkbook(); 
            XSSFSheet sheet = workbook.createSheet(filename); 
            
            for (int i = 0; i < Header.size(); i++) {
                Campo c = Header.get(i);
                float column_width = c.getSize();
                int width = (int) Math.floor((column_width * Units.DEFAULT_CHARACTER_WIDTH + 5) / Units.DEFAULT_CHARACTER_WIDTH * 256);
                sheet.setColumnWidth(i, width);
            }
            
            //Set style of excel columns
            XSSFCellStyle style = workbook.createCellStyle();//cell style for header
            XSSFCellStyle style2 = workbook.createCellStyle();//cell style for result
            style.setAlignment(HorizontalAlignment.CENTER);//center align
            style.setBorderBottom(BorderStyle.THIN);//border bottom
            style.setBorderTop(BorderStyle.THIN);//border top
            style.setBorderLeft(BorderStyle.THIN);//border left
            style.setBorderRight(BorderStyle.THIN);//border right
            style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
            XSSFFont font = workbook.createFont();//style for header
            XSSFFont font2 = workbook.createFont();//style for result
            font.setBold(true);
            font.setFontName("Times New Roman");
            font.setFontHeightInPoints((short) 14);
            font2.setFontName("Times New Roman");
            font2.setFontHeightInPoints((short) 12);
            style.setFont(font);//font style for header
            style2.setFont(font2);//font style for result

            XSSFRow header = sheet.createRow((short) 0);
            for (int i = 0; i < Header.size(); i++) {
                header.createCell((short)i).setCellValue(Header.get(i).getName());
                header.getCell(i).setCellStyle(style);
            }
            for (int i = 0; i < values.size(); i++) {
                XSSFRow row = sheet.createRow((short) i);
                for (int j = 0; j < Header.size(); j++) {
                    //row.createCell((short)i).setCellValue(value);
                    RowType(j, values.get(j),Header,row);
                    row.getCell(j).setCellStyle(style2);
                }
                
            }
            try {
                FileOutputStream fileout = new FileOutputStream(excelname);
                workbook.write(fileout);
                JOptionPane.showMessageDialog(null, "Excel creado con exito");
                Desktop.getDesktop().open(new File((excelname)));//automatically open after exporting
                fileout.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
    private void RowType(int i, Registro value, ArrayList<Campo> campos, XSSFRow row){
        if ("float".equals(campos.get(i).getType())||"int".equals(campos.get(i).getType())) {
            int Value = Integer.parseInt(value.getAll_fields().get(i));
            row.createCell((short) 0).setCellValue(Value); //data from column IDNumber
        }else {
            row.createCell((short) 1).setCellValue(value.getAll_fields().get(i));//data from column lastname
        }
        //resultrow.createCell((short) 0).setCellValue(result.getInt(1)); //data from column IDNumber
        //resultrow.createCell((short) 1).setCellValue(result.getString(2));//data from column lastname
    }
}
