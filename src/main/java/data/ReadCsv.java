package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to read a CSV and to affect value for each sensor
 *
 * @author Emilien
 */
public class ReadCsv {

    private final static String RESOURCES_PATH = "C:/Users/emili/Downloads/";

    private final static String ELEVES_FILE_NAME = "export-device-20553A-messages.csv";

    private final static char SEPARATOR = ';';


    /**
     * Find data list.
     *
     * @return the list
     */
    public List<String> findData() {

        List<String> result = new ArrayList<String>();

        try {
            File file = new File(RESOURCES_PATH + ELEVES_FILE_NAME);
            FileReader fileReader = new FileReader(file);

            BufferedReader br = new BufferedReader(fileReader);

            String sep = new Character(SEPARATOR).toString();


            for (String line = br.readLine(); line != null; line = br.readLine()) {
                String[] oneData = line.split(sep);
                result.add(oneData[0]);
            }

            br.close();
            fileReader.close();
        } catch (Exception e) {

        }

        return result;
    }
}
