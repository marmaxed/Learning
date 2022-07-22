package UtilsForData;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

public class ExelData {
    //Объявляем используемые значения
    int rows;
    int col;
    int value = -1;

    //Публичный конструктор, параметр которого задает рассу существа, данные которого будут взяты.
    //Расса используется в качестве значения строки в таблице с данными

    public ExelData(String creatureRace){
        switch (creatureRace.toLowerCase(Locale.ROOT)) {
            case  ("human"):
                rows=0;
                break;
            case ("swamper"):
                rows=1;
                break;
            case ("woodman"):
                rows=2;
                break;
            default:
                rows = 4;
                break;
        }
    }

    /*Функция, используемая для получения данных. Применяется при заполнении массива.
      На вход получаем символ, от значения которого зависит столбец в таблице
      Вызывается при заполнении каждой клетки массива
      Идет проверка на правильный ввод, путем присвоения столбцу и строке значения клетки, в которых нет данных
      Пробрасывается исколючение, идет выход из приложения*/

    public int getData(char columns) throws IOException {
        switch ( Character.toUpperCase(columns)) {
            case  ('S'):
                col=0;
                break;
            case ('W'):
                col=1;
                break;
            case ('T'):
                col=2;
                break;
            case ('P'):
                col=3;
                break;
            default:
                col = 4;
                break;
        }
        try {
            FileInputStream file = new FileInputStream(new File("src/main/java/UtilsForData/myData.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFRow Row = sheet.getRow(rows);
            value = (int)Double.parseDouble(String.valueOf(Row.getCell(col)));
        } catch (NullPointerException e){
            System.out.println("It is impossible to get data about the nature and type of the field.\n" +
                    " You may have entered them incorrectly.\n" +
                    " Restart the game and enter the data correctly");
            System.exit(0);
        }
       return value;
    }

}
