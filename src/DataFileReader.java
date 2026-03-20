import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataFileReader {

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Constructor for Datafile Reader
     * @param fileName Name of the file you wish to read
     */
    public DataFileReader(String fileName) {
        this.fileName = fileName;
    }

    public DataFileReader() {
        this.fileName = "default";
    }

    /**
     * Reads the data for a file that you specified in the constructor. If non specified it will read a file called default.
     */
    public void dataReader() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] valuesInTheRow = line.split(" ");
                int i0 = Integer.parseInt(valuesInTheRow[0]);
                int i1 = Integer.parseInt(valuesInTheRow[1]);
                int i2 = Integer.parseInt(valuesInTheRow[2]);
                int i3 = Integer.parseInt(valuesInTheRow[3]);
                float f0 = Float.parseFloat(valuesInTheRow[4]);
                float f1 = Float.parseFloat(valuesInTheRow[5]);
                System.out.println("Four ints: " + i0 + ", " + i1 + ", " + i2 + ", " + i3 + " Two Floats: " + f0 + ", " + f1);
            }
        } catch (FileNotFoundException fNotFound) {
            System.out.println("The file you tried to open could not be opened." + fNotFound.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
